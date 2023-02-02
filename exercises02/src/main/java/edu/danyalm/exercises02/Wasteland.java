package edu.danyalm.exercises02;

public class Wasteland {
    public static void main(String [] args)
    {
        NPC bob = new NPC("Bobby", 96);
        NPC joe = new NPC("Joe", 76);

        bob.setName("Bob");
        joe.setName("Joe");
        bob.setHealth(100);
        joe.setHealth(75);

        System.out.println(bob.getName() + ", " + bob.getHealth());
        System.out.println(joe.getName() + ", " + joe.getHealth());

        bob.setName("Bobert");

        System.out.println(bob.getName() + ", " + bob.getHealth());
        System.out.println(joe.getName() + ", " + joe.getHealth());

        bob.takeDamage(5);
    }
}
