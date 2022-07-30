package _03_if_else._1_unbirthday;

import javax.swing.*;

public class Unbirthday {
    public static void main(String[] args) {

        String birthday = JOptionPane.showInputDialog(null, "What day is your B-day? mm, dd, by the way.");
        String today = "7/30";
        if (birthday.equals(today)){
            JOptionPane.showMessageDialog(null,"Happy birthday to you!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Merry UNbirthday!");
        }
    }
}