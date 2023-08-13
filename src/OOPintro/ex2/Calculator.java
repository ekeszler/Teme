package OOPintro.ex2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti primul numar");
        double n1 = scanner.nextDouble();
        System.out.println("introduceti al doilea numar");
        double n2 = scanner.nextDouble();
        System.out.println("introduceti numarul pentru care doriti aflarea factorialului");
        double n3 = scanner.nextDouble();
        Operatii operatii = new Operatii();
        System.out.println(operatii.Sum(n1, n2));
        System.out.println(operatii.difference(n1, n2));
        System.out.println(operatii.factorial(n3));
    }
}
