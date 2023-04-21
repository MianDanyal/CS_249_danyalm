package edu.danyalm.assign06;

import edu.danyalm.assign04.CharBoard;

import java.io.*;
import java.util.*;

public class GameState implements Loadable {
    private ArrayList<Loadable> loadableList;
    private CharBoard baseMap;

    public GameState() {
        loadableList = new ArrayList<>();
        baseMap = new CharBoard(12, 30, '.');
    }

    public Loadable createLoadable(String typeName) throws GameFileException {
        switch (typeName) {
            case "Skeleton":
                return new Skeleton();
            case "Rat":
                return new Rat();
            case "Item":
                return new Item();
            case "Book":
                return new Book();
            default:
                throw new GameFileException("Unknown type: " + typeName);
        }
    }

    public void load(Scanner input) throws GameFileException {
        baseMap.clear();
        loadableList.clear();

        int numLines = Integer.parseInt(input.nextLine());
        for (int i = 0; i < numLines; i++) {
            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            loadableList.add(m);
            if (m instanceof Drawable) {
                ((Drawable) m).draw(baseMap);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n");
        sb.append(baseMap.getMapString()).append("\n");
        sb.append("CREATURES:\n");
        for (Loadable l : loadableList) {
            if (l instanceof Creature) {
                sb.append("* ").append(l.toString()).append("\n");
            }
        }
        sb.append("INVENTORY:\n");
        for (Loadable l : loadableList) {
            if (l instanceof Item) {
                sb.append("* ").append(l.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public void save(String filename) throws GameFileException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.print(this.toString());
        } catch (Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
