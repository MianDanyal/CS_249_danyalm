package edu.danyalm.assign03;

public class Letterhead {
    private String name;
    private String[] sloganLines;
    private char boundaryChar;

    public Letterhead(String name, String[] sloganLines, char boundaryChar) {
        this.name = name;
        this.boundaryChar = boundaryChar;

        this.sloganLines = new String[sloganLines.length];
        for (int i = 0; i < sloganLines.length; i++) {
            this.sloganLines[i] = sloganLines[i];
        }
    }


    public String getName() {
        return name;
    }
    public char getBoundaryChar() {
        return boundaryChar;
    }
    public String getSlogan() {
        StringBuilder sb = new StringBuilder();
        for (String line : sloganLines) {
            sb.append(line + "\n");
        }
        return sb.toString();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }
    public void setSlogan(String[] sloganLines) {
        this.sloganLines = new String[sloganLines.length];
        for (int i = 0; i < sloganLines.length; i++) {
            this.sloganLines[i] = sloganLines[i];
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //Top
        for (int i = 0; i < 40; i++) {
            sb.append(boundaryChar);
        }
        sb.append('\n');

        //Business name
        sb.append(boundaryChar + " " + name);
        int numSpaces = 37 - name.length();
        for (int i = 0; i < numSpaces; i++) {
            sb.append(' ');
        }
        sb.append(boundaryChar + "\n");

        //Blank line
        sb.append(boundaryChar);
        for (int i = 0; i < 38; i++) {
            sb.append(' ');
        }
        sb.append(boundaryChar + "\n");

        //Slogan lines
        for (String line : sloganLines) {
            sb.append(boundaryChar + " " + line);
            int numSpaces2 = 37 - line.length();
            for (int i = 0; i < numSpaces2; i++) {
                sb.append(' ');
            }
            sb.append(boundaryChar + "\n");
        }

        //Blank lines
        for (int i = 0; i < 5 - (sloganLines.length + 1); i++) {
            sb.append(boundaryChar);
            for (int j = 0; j < 38; j++) {
                sb.append(' ');
            }
            sb.append(boundaryChar + "\n");
        }

        //Bottom
        for (int i = 0; i < 40; i++) {
            sb.append(boundaryChar);
        }
        sb.append('\n');

        return sb.toString();
    }


}

