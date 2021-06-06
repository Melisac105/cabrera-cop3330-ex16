/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Program 16 - Legal Driving Age
You can test for equality, but you may need to test to see how a number compares to a known value and display a message if the number is too low or too high.

Write a program that asks the user for their age and compare it to the legal driving age of sixteen. If the user is sixteen or older, then the program should display "You are old enough to legally drive." If the user is under sixteen, the program should display "You are not old enough to legally drive."

Example Output
What is your age? 15
You are not old enough to legally drive.

Or

What is your age? 35
You are old enough to legally drive.

Constraints
Use a single output statement.
Use a ternary operator to write this program. If your language doesn’t support a ternary operator, use a regular if/else statement, and still use a single output statement to display the message.
 */


import util.Calculations;
import util.Output;
import util.UsrInput;

public class App {

    public static void main(String[] args) {
        int age = UsrInput.getAge();
        int validAge = Calculations.validateAge(age);
        Output.printOutput(validAge);
    }
}
