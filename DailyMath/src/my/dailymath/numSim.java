package my.dailymath;

import java.util.Random;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Mathematics{
    public int counter = 0;
    public int score = 0;
    Scanner scan = new Scanner(System.in);
}

class Operation extends Mathematics {

    public void addition() {
        String num1, num2;
        int number1, number2, sum;
        int counter = 0;
        int score = 0;
        while (counter < 10) {
            int x = (int) Math.round(Math.random() * 10);
            int y = (int) Math.round(Math.random() * 10);
            num1 = JOptionPane.showInputDialog(x + "+" + y + "=");
            number1 = Integer.parseInt(num1);

            if (number1 == x + y) {
                score++;
                JOptionPane.showMessageDialog(null, "Correct. Your score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            } 
            else {
                JOptionPane.showMessageDialog(null, "Sorry, that's incorrect. Your current score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            }

        }
        System.exit(0); 
    }
    public void hardAddition() {
        String num1, num2;
        int number1, number2, sum;
        int counter = 0;
        int score = 0;
        while (counter < 10) {
            int x = (int) Math.round(Math.random() * 100);
            int y = (int) Math.round(Math.random() * 100);
            num1 = JOptionPane.showInputDialog(x + "+" + y + "=");
            number1 = Integer.parseInt(num1);

            if (number1 == x + y) {
                score++;
                JOptionPane.showMessageDialog(null, "Correct. Your score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            } 
            else {
                JOptionPane.showMessageDialog(null, "Sorry, that's incorrect. Your current score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            }

        }
        System.exit(0); 
    }
    public void subtraction() {
        String num1, num2;
        int number1, number2, sum;
        int counter = 0;
        int score = 0;
        while (counter < 10) {
            int x = (int) Math.round(Math.random() * 10);
            int y = (int) Math.round(Math.random() * 10);
            num1 = JOptionPane.showInputDialog(x + "-" + y + "=");
            number1 = Integer.parseInt(num1);

            if (number1 == x - y) {
                score++;
                JOptionPane.showMessageDialog(null, "Correct. Your score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            } 
            else {
                JOptionPane.showMessageDialog(null, "Sorry, that's incorrect. Your current score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            }

        }
        System.exit(0); 
    }
    public void hardSubtraction() {
        String num1, num2;
        int number1, number2, sum;
        int counter = 0;
        int score = 0;
        while (counter < 10) {
            int x = (int) Math.round(Math.random() * 100);
            int y = (int) Math.round(Math.random() * 100);
            num1 = JOptionPane.showInputDialog(x + "-" + y + "=");
            number1 = Integer.parseInt(num1);

            if (number1 == x - y) {
                score++;
                JOptionPane.showMessageDialog(null, "Correct. Your score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            } 
            else {
                JOptionPane.showMessageDialog(null, "Sorry, that's incorrect. Your current score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            }

        }
        System.exit(0); 
    }
        
    public void multiplication() {
        String num1, num2;
        int number1, number2, sum;
        int counter = 0;
        int score = 0;
        while (counter < 10) {
            int x = (int) Math.round(Math.random() * 10);
            int y = (int) Math.round(Math.random() * 10);
            num1 = JOptionPane.showInputDialog(x + "*" + y + "=");
            number1 = Integer.parseInt(num1);

            if (number1 == x * y) {
                score++;
                JOptionPane.showMessageDialog(null, "Correct. Your score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            } 
            else {
                JOptionPane.showMessageDialog(null, "Sorry, that's incorrect. Your current score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            }

        }
        System.exit(0); 
    }
    public void hardMultiplication() {
        String num1, num2;
        int number1, number2, sum;
        int counter = 0;
        int score = 0;
        while (counter < 10) {
            int x = (int) Math.round(Math.random() * 100);
            int y = (int) Math.round(Math.random() * 100);
            num1 = JOptionPane.showInputDialog(x + "*" + y + "=");
            number1 = Integer.parseInt(num1);

            if (number1 == x * y) {
                score++;
                JOptionPane.showMessageDialog(null, "Correct. Your score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            } 
            else {
                JOptionPane.showMessageDialog(null, "Sorry, that's incorrect. Your current score is: " + score, "Results", JOptionPane.PLAIN_MESSAGE);
                counter++;
            }

        }
        System.exit(0); 
    }
}


public class numSim {
    public static void main(String args[]){
        Operation test1 = new Operation();
        //test1.addition();
        //test1.subtraction();
        //test1.multiplication();
        test1.hardAddition();


    }
}





