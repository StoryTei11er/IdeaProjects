package com.company;

import java.util.Scanner;

public class DomahaDva {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number ");
        int number = scanner.nextInt();
        int[] nums = new int[number];
        for (int i = 0; i < nums.length; i++) {
            int randomNumber = (int) (Math.random() * (100 - 1) + 100);
            nums[i] = randomNumber;

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }

        Scanner lineScanner = new Scanner(System.in);
        System.out.print("Enter your zero line ");
        String line = lineScanner.nextLine();
        while (!line.equals("")) {
            line = scanner.nextLine();
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i = i + 2)) {
                System.out.println(nums[i] + " it`s your third number ");
            }
            if (nums[i] == (i = i + 2)){
                    break;
            }
        }
    }
}