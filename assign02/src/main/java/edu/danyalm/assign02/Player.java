package edu.danyalm.assign02;

public class Player {
    private String firstName = "";
    private String lastName = "";
    private int height;
    private double weight;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public void setFirstName(String first) {
        firstName = first;
    }
    public void setLastName(String last) {
        lastName = last;
    }
    public void setHeight(int totalInches) {
        height = totalInches;
    }
    public void setWeight(double pounds) {
        weight = pounds;
    }
    public int calculateBMI() {
        double k = ((703 * weight) / (height * height));
        int BMI = (int)k;
        return BMI;
    }

    public String getNameString() {
        return (getLastName() + ", " + getFirstName());
    }

    public String getHeightString() {
        int feetheight = getHeight() / 12;
        int inchheight = getHeight() % 12;
        return feetheight + "'-" + inchheight + "\"";
    }

    public String getWeightString() {
        return getWeight() + " lbs.";
    }
    public String toString() {

        String everything = ("NAME: " + getNameString() + "\n"
                            + "WEIGHT: " + getWeightString() + "\n"
                            + "HEIGHT: " + getHeightString() + "\n"
                            + "BMI: " + calculateBMI() + "\n");
        return everything;
    }
}
