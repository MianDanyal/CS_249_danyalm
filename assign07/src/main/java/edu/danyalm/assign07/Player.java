package edu.danyalm.assign07;
import edu.danyalm.assign06.*;
import edu.danyalm.assign04.CharBoard;
public class Player extends Creature {

    public Player() {
        super(0, 0);
    }

    public Player(int row, int col) {
        super(row, col);
    }

    @Override
    public String toString() {
        return "Player at " + getRow() + "," + getCol();
    }

    @Override
    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'P');
    }
}

