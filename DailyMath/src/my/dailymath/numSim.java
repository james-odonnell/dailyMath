package my.dailymath;

import javax.swing.JOptionPane;

class Mathematics{
    public int counter = 0;
    public int score = 0;
    String num1, num2;
    int number1, number2, sum;
}

class Operation extends Mathematics {

    public void addition() {
        while (counter < 10) {
            int x = (int) Math.round(Math.random() * 10);
            int y = (int) Math.round(Math.random() * 10);
            num1 = "";
            while (num1.equals("")){
                num1 = JOptionPane.showInputDialog(x + "+" + y + "=");
                if (num1 == null)
                    System.exit(0);
                if (num1.equals(""))
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
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
        //System.exit(0); 
    }
    public void hardAddition() {
        while (counter < 20) {
            int x = (int) Math.round(Math.random() * 100);
            int y = (int) Math.round(Math.random() * 100);
            num1 = "";
            while (num1.equals("")){
                num1 = JOptionPane.showInputDialog(x + "+" + y + "=");
                if (num1 == null)
                    System.exit(0);
                if (num1.equals(""))
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
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
        //System.exit(0); 
    }
    public void subtraction() {
        while (counter < 20) {
            int x = (int) Math.round(Math.random() * 10);
            int y = (int) Math.round(Math.random() * 10);
            num1 = "";
            while (num1.equals("")){
                num1 = JOptionPane.showInputDialog(x + "-" + y + "=");
                if (num1 == null)
                    System.exit(0);
                if (num1.equals(""))
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
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
        //System.exit(0); 
    }
    public void hardSubtraction() {
        while (counter < 20) {
            int x = (int) Math.round(Math.random() * 100);
            int y = (int) Math.round(Math.random() * 100);
            num1 = "";
            while (num1.equals("")){
                num1 = JOptionPane.showInputDialog(x + "-" + y + "=");
                if (num1 == null)
                    System.exit(0);
                if (num1.equals(""))
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
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
        //System.exit(0); 
    }
        
    public void multiplication() {
        while (counter < 20) {
            int x = (int) Math.round(Math.random() * 10);
            int y = (int) Math.round(Math.random() * 10);
            num1 = "";
            while (num1.equals("")){
                num1 = JOptionPane.showInputDialog(x + "*" + y + "=");
                if (num1 == null)
                    System.exit(0);
                if (num1.equals(""))
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
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
        //System.exit(0); 
    }
    public void hardMultiplication() {
        while (counter < 20) {
            int x = (int) Math.round(Math.random() * 100);
            int y = (int) Math.round(Math.random() * 100);
            num1 = JOptionPane.showInputDialog(x + "*" + y + "=");
            while (num1.equals("")){
                num1 = JOptionPane.showInputDialog(x + "*" + y + "=");
                if (num1 == null)
                    System.exit(0);
                if (num1.equals(""))
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
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
        //System.exit(0); 
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





