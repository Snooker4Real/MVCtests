package fr.snooker4real;

import fr.snooker4real.controller.NumberController;
import fr.snooker4real.model.Number;
import fr.snooker4real.view.NumberView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVCtestsMain {
    public static void main(String[] args) {

        Number model = recupererNombre();

        NumberView view = new NumberView();
        NumberController controller = new NumberController(model, view);

        controller.updateNumber();

        JFrame aJFrame = new JFrame("Test simple de MVC");
        aJFrame.setLayout(new BorderLayout());
        aJFrame.setMinimumSize(new Dimension(400, 400));
        aJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel aView = new JLabel("", JLabel.CENTER);
        JButton aIncrementButton = new JButton("+");
        JButton aDecrementButton = new JButton("-");

        aJFrame.add(aIncrementButton, BorderLayout.NORTH);
        aJFrame.add(aView, BorderLayout.CENTER);
        aJFrame.add(aDecrementButton, BorderLayout.SOUTH);

        aIncrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //aView.setText("increment pushed");
                aView.setText(controller.updateNumber());

            }
        });

        aDecrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aView.setText("decrement pushed");
            }
        });

        aJFrame.setVisible(true);

    }

    public static Number recupererNombre(){
        Number number = new Number();
        number.setNumber(1);
        return number;
    }

}
