package fr.snooker4real.controller;

import fr.snooker4real.model.Number;
import fr.snooker4real.view.NumberView;

import java.awt.event.KeyEvent;

public class NumberController {
    private Number model;
    private NumberView view;

    public NumberController(Number model, NumberView view) {
        this.model = model;
        this.view = view;
    }

    public void setMyNumber(int number) {
        model.setNumber(number);
    }

    public int getMyNumberPlus(){
        return model.getNumberPlus();
    }

    public int getMyNumberMinus(){
        return model.getNumberMinus();
    }

    public String updateNumberPlus(){
        int a = model.getNumberPlus();
        String s = String.valueOf(a);
        view.printNumber(s);
        return s;
    }

    public String updateNumberMinus(){
        int a = model.getNumberMinus();
        String s = String.valueOf(a);
        view.printNumber(s);
        return s;
    }

}