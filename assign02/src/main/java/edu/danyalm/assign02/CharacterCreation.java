package edu.danyalm.assign02;
import java.util.*;
public class CharacterCreation {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Player p = new Player();

        System.out.println("Enter name:");

        String firstName = input.next();
        String lastName = input.next();

        System.out.println("Enter height in inches:");
        int totalInches = input.nextInt();

        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();

        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setHeight(totalInches);
        p.setWeight(pounds);
        System.out.println(p.toString());

    }
}
