package my.dailymath;

import java.util.Random;
import java.io.*;
import java.util.Scanner;

class Mathematics{
    public int counter = 0;
    public int score = 0;
    Scanner scan = new Scanner(System.in);
}

class Operation extends Mathematics {

    public void addition() {
        while (counter < 10) {
            int x = (int) Math.round(10 * Math.random());
            int y = (int) Math.round(10 * Math.random());
            System.out.println(x + " + " + y + " =");
            int answer = scan.nextInt();
            if (x + y == answer) {
                counter++;
                score++;
                System.out.println("Correct Answer.");
                System.out.println("Your current score is: " + score);
            } else {
                System.out.println("Sorry. That answer was not correct.");
                System.out.println("Your current score is: " + score);
                counter++;
            }
        }
    }
    public void hardAddition() {
        while (counter < 10) {
            int x = (int) Math.round(100 * Math.random());
            int y = (int) Math.round(100 * Math.random());
            System.out.println(x + " + " + y + " =");
            int answer = scan.nextInt();
            if (x + y == answer) {
                counter++;
                score++;
                System.out.println("Correct Answer.");
                System.out.println("Your current score is: " + score);
            } else {
                System.out.println("Sorry. That answer was not correct.");
                System.out.println("Your current score is: " + score);
                counter++;
            }
        }
    }
    public void subtraction() {
        while (counter < 10) {
            int x = (int) Math.round(10 * Math.random());
            int y = (int) Math.round(10 * Math.random());
            System.out.println(x + " - " + y + " =");
            int answer = scan.nextInt();
            if (x - y == answer) {
                counter++;
                score++;
                System.out.println("Correct Answer.");
                System.out.println("Your current score is: " + score);
            } else {
                System.out.println("Sorry. That answer was not correct.");
                System.out.println("Your current score is: " + score);
                counter++;
            }
        }
    }
    public void hardSubtraction() {
        while (counter < 10) {
            int x = (int) Math.round(100 * Math.random());
            int y = (int) Math.round(100 * Math.random());
            System.out.println(x + " - " + y + " =");
            int answer = scan.nextInt();
            if (x - y == answer) {
                counter++;
                score++;
                System.out.println("Correct Answer.");
                System.out.println("Your current score is: " + score);
            } else {
                System.out.println("Sorry. That answer was not correct.");
                System.out.println("Your current score is: " + score);
                counter++;
            }
        }
    }
    public void multiplication() {
        while (counter < 10) {
            int x = (int) Math.round(10 * Math.random());
            int y = (int) Math.round(10 * Math.random());
            System.out.println(x + " * " + y + " =");
            int answer = scan.nextInt();
            if (x * y == answer) {
                counter++;
                score++;
                System.out.println("Correct Answer.");
                System.out.println("Your current score is: " + score);
            } else {
                System.out.println("Sorry. That answer was not correct.");
                System.out.println("Your current score is: " + score);
                counter++;
            }
        }
    }
    public void hardMultiplication() {
        while (counter < 10) {
            int x = (int) Math.round(100 * Math.random());
            int y = (int) Math.round(100 * Math.random());
            System.out.println(x + " * " + y + " =");
            int answer = scan.nextInt();
            if (x * y == answer) {
                counter++;
                score++;
                System.out.println("Correct Answer.");
                System.out.println("Your current score is: " + score);
            } else {
                System.out.println("Sorry. That answer was not correct.");
                System.out.println("Your current score is: " + score);
                counter++;
            }
        }
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




