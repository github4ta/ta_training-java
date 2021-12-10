package com.epam.training.student_serge_tsarik.fundamentals.main_task;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input user name: ");
        String user = in.nextLine();

        System.out.printf("Hello %s.\n", user);
        in.close();
    }
}
