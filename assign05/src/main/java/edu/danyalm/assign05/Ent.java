package edu.danyalm.assign05;

public class Ent extends Tree {
    public Ent(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Ent " + super.toString();
    }
    public String speak() {
        return "HOOM";
    }
}
