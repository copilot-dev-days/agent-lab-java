package com.socops.model;

import java.util.List;

/**
 * Describes a completed five-in-a-row on the board.
 *
 * @param direction      one of "row", "column", or "diagonal"
 * @param index          which row/column (0-4) or diagonal (0-1)
 * @param cellPositions  the five board indices that form this streak
 */
public record WinningStreak(String direction, int index, List<Integer> cellPositions) {
}
