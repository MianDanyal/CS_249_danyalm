package edu.danyalm.assign05;

import java.util.ArrayList;

public class Woods {

    private ArrayList<Giant> giants;

    public Woods() {
        this.giants = new ArrayList<>();
    }

    public Giant createGiant(String name, String typeName) {
        if (name.equals("")) {
            return null;
        }
        else if (typeName.equals("GIANT")) {
            return new Giant(name);
        }
        else if (typeName.equals("TROLL")) {
            return new Troll(name);
        }
        else if (typeName.equals("TREE")) {
            return new Tree(name);
        }
        else if (typeName.equals("ENT")) {
            return new Ent(name);
        }
        else if (typeName.equals("HUORN")) {
            return new Huorn(name);
        }
        else {
            return null;
        }
    }

    public boolean addGiant(String name, String typeName) {
        Giant giant = createGiant(name, typeName);
        if (giant != null) {
            this.giants.add(giant);
            return true;
        } else {
            return false;
        }
    }

    public Giant getGiant(int index) {
        if (index >= 0 && index < this.giants.size()) {
            return this.giants.get(index);
        }
        else {
            return null;
        }
    }

    public void printAllGiants() {
        System.out.println("ALL GIANTS:");
        for (Giant giant : this.giants) {
            System.out.println("- " + giant.toString());
        }
    }

    public void printAllTrees() {
        System.out.println("ALL TREES:");
        for (Giant giant : this.giants) {
            if (giant instanceof Tree) {
                Tree tree = (Tree) giant;
                System.out.println("- " + tree.toString() + ": " + tree.speak());
            }
        }
    }

    public void printAllTrolls() {
        System.out.println("ALL TROLLS:");
        for (Giant giant : this.giants) {
            if (giant instanceof Troll) {
                Troll troll = (Troll) giant;
                System.out.println("- " + troll.toString() + ": " + troll.cook());
            }
        }
    }
}
