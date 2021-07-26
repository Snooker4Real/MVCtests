package fr.snooker4real.model;

public class Number {

    private int myNumber;

    public int getNumber() {
        return myNumber++;
    }

    public void setNumber(int myNumber) {
        this.myNumber = myNumber;
    }
}
