package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.*;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String firstriddle = JOptionPane.showInputDialog(null, "What can travel the world while staying in a corner? Make sure to write all your answers in lowercase.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (firstriddle.equals("stamp")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "The answer was actually a stamp.");
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}
		// 6. Add some more riddles
		String secondriddle = JOptionPane.showInputDialog(null, "What kind of room has no doors or windows?");
		if (secondriddle.equals("mushroom")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		} else {
			JOptionPane.showMessageDialog(null, "The answer was actually mushroom");
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}
		String thirdriddle = JOptionPane.showInputDialog(null, "Which word in the dictionary is spelled incorrectly?");
		if (thirdriddle.equals("incorrectly")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		} else {
			JOptionPane.showMessageDialog(null, "The answer was actually incorrrectly");
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}
		// 2. Make a pop up to show the score.

	}
}
