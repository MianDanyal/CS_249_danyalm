package edu.danyalm.assign07;
import edu.danyalm.assign04.CharBoard;
import edu.danyalm.assign06.*;

public class AvoidPlayer implements MoveAlgorithm {

    @Override
    public void move(Creature current, Player p) {
        int rowDistance = current.getRow() - p.getRow();
        int colDistance = current.getCol() - p.getCol();
        if (current.getRow() == p.getRow() && current.getCol() == p.getCol()) {
            return;
        }
        else if (rowDistance != 0 || colDistance != 0) {
            if (Math.abs(rowDistance) > Math.abs(colDistance)) {
                if (rowDistance < 0) {
                    current.setRow(current.getRow() - 1);
                } else {
                    current.setRow(current.getRow() + 1);
                }
            } else {
                if (colDistance < 0) {
                    current.setCol(current.getCol() - 1);
                } else {
                    current.setCol(current.getCol() + 1);
                }
            }
        }
    }



}

