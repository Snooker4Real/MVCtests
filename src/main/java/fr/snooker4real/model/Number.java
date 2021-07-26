package fr.snooker4real.model;

import java.awt.event.KeyEvent;

public class Number {

    private int myNumber;


    public int getNumber() {
        return myNumber;
    }

    public int getNumberMinus(){
        return myNumber--;
    }

    public int getNumberPlus(){
        return myNumber++;
    }

    public void setNumber(int myNumber) {
        this.myNumber = myNumber;
    }


}
