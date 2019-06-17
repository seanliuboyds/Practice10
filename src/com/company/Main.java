package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        int [] inputs = new int[10];
        int [] evens = new int[10];
        int [] odds = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 10; i++){
            //inputs[i] =
            System.out.println("\n \n Enter a value: ");
            inputs[i] = keyboard.nextInt();
        }
        for (int i = 0; i < 10; i++){
            if (inputs[i] == 0 || inputs[i] % 2 == 0){
                evens[evenCount] = inputs[i];
                evenCount++;
            } else {
                odds[oddCount] = inputs[i];
                oddCount++;
            }
        }
        System.out.print("Evens: ");
        for (int i = 0; i < evens.length; i++){
            System.out.print(evens[i] + ", ");
        }
        System.out.print("\n \n Odds: ");;
        for (int i = 0; i < odds.length; i++) {
           System.out.print(odds[i] + ", ");

        }
    }
}
