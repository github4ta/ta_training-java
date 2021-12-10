package com.epam.training.student_serge_tsarik.fundamentals.main_task;

import org.apache.commons.lang3.ArrayUtils;

public class ReverseArgs {
    public static void main(String[] args) {
        ArrayUtils.reverse(args);
        for(String argument : args) {
            System.out.printf("%s ", argument);
        }
    }
}
