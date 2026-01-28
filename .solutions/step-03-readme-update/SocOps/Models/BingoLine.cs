namespace SocOps.Models;

public class BingoLine
{
    public string Type { get; set; } = string.Empty; // "row", "column", or "diagonal"
    public int Index { get; set; }
    public List<int> Squares { get; set; } = new();
}
