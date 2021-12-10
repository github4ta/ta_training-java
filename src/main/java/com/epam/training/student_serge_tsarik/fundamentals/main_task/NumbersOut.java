package com.epam.training.student_serge_tsarik.fundamentals.main_task;

import com.epam.training.student_serge_tsarik.utils.ReadArg;

public class NumbersOut {
    public static void main(String[] args) {
        int amount = ReadArg.asInt();

        for(int i = 0; i < amount; i++) {
            System.out.printf("%s ", (int) (Math.random() * 100));
        }

        for(int i = 0; i < amount; i++) {
            System.out.printf("\n%s", (int) (Math.random() * 100));
        }
    }
}
