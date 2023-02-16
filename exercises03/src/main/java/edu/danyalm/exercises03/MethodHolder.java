package edu.danyalm.exercises03;

public class MethodHolder {

    
    private String preamble = "MESSAGE: ";
        System.out.println(preamble + message);
    }

    public static void staticPrint(String message) {
        System.out.println(message);
    }

    public static void main(String [] args) {
        staticPrint("Hi");

        MethodHolder h = new MethodHolder();
        instancePrint("Hello");
    }
}
