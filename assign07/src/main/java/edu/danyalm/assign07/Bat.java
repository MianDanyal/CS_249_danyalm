package edu.danyalm.assign07;
import edu.danyalm.assign06.*;
import edu.danyalm.assign04.CharBoard;

public class Bat extends Creature implements Mover {

    private MoveAlgorithm moveAlgorithm;

    public Bat() {
        super();
        moveAlgorithm = new AvoidPlayer();
    }

    public Bat(int row, int col) {
        super(row, col);
        moveAlgorithm = new AvoidPlayer();
    }

    public String toString() {
        return "Bat at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'B');
    }

    public void performMove(Player p) {
        moveAlgorithm.move(this, p);
    }
}

