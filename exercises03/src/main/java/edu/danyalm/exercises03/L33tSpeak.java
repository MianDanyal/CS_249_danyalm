package edu.danyalm.exercises03;

import java.util.*;

public class L33tSpeak {

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String line = "";
        do
        {
            System.out.println("Enter message:");
            line = input.nextLine();
            line = line.trim();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < line.length(); i++)
            {
                char c = line.charAt(i);


                char nc = switch(c) {
                    case 'a', 'A' -> '4';
                    case 'b', 'B' -> '3';
                    case 'i', 'I' -> '1';
                    case 'o', 'O' -> '0';
                    default -> c;
                };

                sb.append(nc);
            }

            System.out.println(sb.toString());
        }
        while(line.length() != 0);
        {

        }

    }
}
