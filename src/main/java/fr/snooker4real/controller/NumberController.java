package fr.snooker4real.controller;

import fr.snooker4real.model.Number;
import fr.snooker4real.view.NumberView;

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

    public int getMyNumber(){
        return model.getNumber();
    }

    public String updateNumber(){
        int a = model.getNumber();
        String s = String.valueOf(a);
        view.printNumber(s);
        return s;
    }

}
