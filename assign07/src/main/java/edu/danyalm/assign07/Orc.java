package edu.danyalm.assign07;
import edu.danyalm.assign04.CharBoard;
import edu.danyalm.assign06.*;

public class Orc extends Creature implements Mover {
    private MoveAlgorithm moveAlgorithm;

    public Orc() {
        moveAlgorithm = new SeekPlayer();
    }

    public Orc(int row, int col) {
        super(row, col);
        moveAlgorithm = new SeekPlayer();
    }

    public String toString() {
        return "Orc at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'O');
    }

    public void performMove(Player p) {
        moveAlgorithm.move(this, p);
    }
}

