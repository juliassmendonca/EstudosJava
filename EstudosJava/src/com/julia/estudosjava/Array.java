package com.julia.estudosjava;
import java.util.Scanner;


public class Array {

    public static void main(String[] args) {

        double[] temperaturas = new double[365];

        temperaturas [0] = 32.9;
        temperaturas [1] = 30.2;
        temperaturas [2] = 31.1;
        temperaturas [3] = 33.4;
        temperaturas [4] = 30.7;

        System.out.println( " O valor da temperatura é" + temperaturas[3]);

        for(double temp: temperaturas){
            System.out.println(temp);
        }
    }
}