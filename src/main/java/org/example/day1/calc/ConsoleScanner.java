package org.example.day1.calc;

import java.util.Scanner;

public class ConsoleScanner {
    boolean isPlaying = true;
    String operation = "";
    Scanner scanner = new Scanner(System.in);
    
    public void start() {
    System.out.println("Welcome to the console calculator");
    while (isPlaying) {
        operationSeleted();

    if (operation.equalsIgnoreCase("exit")) {
        System.out.println("Exiting...");
        isPlaying = false;
        break;
    }

    int firstNum = enterNumber("Please enter the first number: ");
    int secondNum = enterNumber("Please enter the second number: ");

    performOperation(firstNum, secondNum);


    }


    }
    public void operationSeleted() {
    System.out.println("PLEASE SELECT WHICH OPERATION YOU WANT TO PERFORM(Add, Subtract, Multiply, Divide , EXIT):  ");
    operation = scanner.nextLine().toLowerCase();
    }
    public int enterNumber(String question){
    System.out.println(question);
    int number = Integer.parseInt(scanner.nextLine());
    return number;

    }
    public void performOperation(int firstNumber, int secondNumber){
        if (operation.equalsIgnoreCase("add")) {
        System.out.println("Result: " + LogicMethods.add(firstNumber, secondNumber));

        } else if (operation.equalsIgnoreCase("subtract")) {
        System.out.println("Result: " + LogicMethods.sub(firstNumber, secondNumber));
        } else if (operation.equalsIgnoreCase("multiply")) {
        System.out.println("Result: " + LogicMethods.mul(firstNumber, secondNumber));
        } else if (operation.equalsIgnoreCase("divide")) {
        System.out.println("Result: " + LogicMethods.div(firstNumber, secondNumber));
        } else {
        System.out.println("Invalid Operation. Please select a valid operation from above");
            }
    }
    
    
}

