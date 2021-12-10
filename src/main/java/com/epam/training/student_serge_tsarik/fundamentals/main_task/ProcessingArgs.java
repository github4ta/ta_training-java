package com.epam.training.student_serge_tsarik.fundamentals.main_task;

public class ProcessingArgs {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        for(String argument : args) {
            sum  += Integer.valueOf(argument);
            product *= Integer.valueOf(argument);
            System.out.printf("%s ", argument);
        }

        System.out.printf("\nSum = %s", sum);
        System.out.printf("\nProduct = %s", product);
    }
}
