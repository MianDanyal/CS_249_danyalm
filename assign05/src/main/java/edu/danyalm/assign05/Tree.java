package edu.danyalm.assign05;

public class Tree extends Giant {
    public Tree(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString() + " of the trees";
    }
    public String speak() {
        return "<rustling>";
    }
}

