package com.epam.training.student_serge_tsarik.utils;

import java.util.Scanner;

public class ReadArg {
    public static int asInt() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        in.close();

        return number;
    }
}
