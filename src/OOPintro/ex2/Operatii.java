package OOPintro.ex2;

import java.util.Scanner;

public class Operatii {

    public double Sum(double n1, double n2){
        double sum = n1 + n2;
        System.out.println("suma este:");
        return sum;
    }

    public double difference(double n1, double n2){
        double dif = n1 - n2;
        System.out.println("diferenta este:");
        return dif;
    }

    public double factorial(double n3){
        double fact = 1;
        for( int i = 1; i <= n3; i++){
            fact = fact * i;
        }
        System.out.println("factorialul numarului este:");
        return fact;
    }
}
