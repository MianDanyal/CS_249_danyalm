package edu.danyalm.assign07;
import edu.danyalm.assign06.*;
import edu.danyalm.assign04.CharBoard;
public class SeekPlayer implements MoveAlgorithm {

    @Override
    public void move(Creature current, Player p) {
        int rowDist = p.getRow() - current.getRow();
        int colDist = p.getCol() - current.getCol();

        if (rowDist == 0 && colDist == 0) {
            return;
        }

        if (Math.abs(rowDist) > Math.abs(colDist)) {
            if (rowDist < 0) {
                current.setRow(current.getRow() - 1);
            } else {
                current.setRow(current.getRow() + 1);
            }
        } else {
            if (colDist < 0) {
                current.setCol(current.getCol() - 1);
            } else {
                current.setCol(current.getCol() + 1);
            }
        }
    }

}

