package com.socops.service;

import com.socops.data.IcebreakerPrompts;
import com.socops.model.BingoCell;
import com.socops.model.WinningStreak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Pure-logic helper that builds boards, flips tiles, and spots victories.
 * Every method is static — no Spring wiring needed.
 */
public final class BoardAssembler {

    private static final int GRID_SIDE = 5;
    private static final int CENTER_SLOT = 12;

    private BoardAssembler() {
        /* static helper — never instantiated */
    }

    /* ------------------------------------------------------------------ */
    /*  Board creation                                                     */
    /* ------------------------------------------------------------------ */

    /** Produce a fresh 25-cell board with shuffled prompts and a centre free cell. */
    public static List<BingoCell> assembleNewBoard() {
        var shuffledPrompts = new ArrayList<>(IcebreakerPrompts.ALL_PROMPTS);
        Collections.shuffle(shuffledPrompts);
        List<String> chosenPrompts = shuffledPrompts.subList(0, 24);

        List<BingoCell> freshBoard = new ArrayList<>(25);
        int promptCursor = 0;

        for (int slot = 0; slot < GRID_SIDE * GRID_SIDE; slot++) {
            if (slot == CENTER_SLOT) {
                freshBoard.add(BingoCell.ofFreeCell(slot));
            } else {
                freshBoard.add(BingoCell.ofPrompt(slot, chosenPrompts.get(promptCursor)));
                promptCursor++;
            }
        }
        return freshBoard;
    }

    /* ------------------------------------------------------------------ */
    /*  Cell toggling                                                      */
    /* ------------------------------------------------------------------ */

    /** Return a copy of the board with the given cell's selection toggled (free cells are immune). */
    public static List<BingoCell> flipCell(List<BingoCell> board, int cellId) {
        List<BingoCell> updatedBoard = new ArrayList<>(board.size());
        for (BingoCell tile : board) {
            if (tile.id() == cellId && !tile.freeCell()) {
                updatedBoard.add(new BingoCell(tile.id(), tile.prompt(), !tile.selected(), false));
            } else {
                updatedBoard.add(tile);
            }
        }
        return updatedBoard;
    }

    /* ------------------------------------------------------------------ */
    /*  Victory detection                                                  */
    /* ------------------------------------------------------------------ */

    /** Scan rows, columns, and diagonals; return the first fully-selected line, if any. */
    public static Optional<WinningStreak> detectWinningStreak(List<BingoCell> board) {

        // Rows
        for (int row = 0; row < GRID_SIDE; row++) {
            List<Integer> positions = positionsForRow(row);
            if (allSelected(board, positions)) {
                return Optional.of(new WinningStreak("row", row, positions));
            }
        }

        // Columns
        for (int col = 0; col < GRID_SIDE; col++) {
            List<Integer> positions = positionsForColumn(col);
            if (allSelected(board, positions)) {
                return Optional.of(new WinningStreak("column", col, positions));
            }
        }

        // Main diagonal  (top-left → bottom-right)
        List<Integer> diagMain = IntStream.range(0, GRID_SIDE)
                .map(i -> i * GRID_SIDE + i)
                .boxed().toList();
        if (allSelected(board, diagMain)) {
            return Optional.of(new WinningStreak("diagonal", 0, diagMain));
        }

        // Anti-diagonal (top-right → bottom-left)
        List<Integer> diagAnti = IntStream.range(0, GRID_SIDE)
                .map(i -> i * GRID_SIDE + (GRID_SIDE - 1 - i))
                .boxed().toList();
        if (allSelected(board, diagAnti)) {
            return Optional.of(new WinningStreak("diagonal", 1, diagAnti));
        }

        return Optional.empty();
    }

    /** Extract the board positions belonging to a streak into a Set for quick lookup. */
    public static Set<Integer> collectWinningCellIds(WinningStreak streak) {
        return new HashSet<>(streak.cellPositions());
    }

    /* ------------------------------------------------------------------ */
    /*  Internal helpers                                                   */
    /* ------------------------------------------------------------------ */

    private static List<Integer> positionsForRow(int row) {
        return IntStream.range(0, GRID_SIDE)
                .map(col -> row * GRID_SIDE + col)
                .boxed().toList();
    }

    private static List<Integer> positionsForColumn(int col) {
        return IntStream.range(0, GRID_SIDE)
                .map(row -> row * GRID_SIDE + col)
                .boxed().toList();
    }

    private static boolean allSelected(List<BingoCell> board, List<Integer> positions) {
        for (int pos : positions) {
            if (!board.get(pos).selected()) {
                return false;
            }
        }
        return true;
    }
}
