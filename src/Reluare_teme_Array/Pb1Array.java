package Reluare_teme_Array;

import java.util.Scanner;

public class Pb1Array {
    //1. Scrie un program care sa caute un numar de telefon intr-o lista de numere. Programul va printa “numarul a fost gasit” sau “numarul nu a fost gasit”
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] agenda = {
                "0745612387",
                "0721489547",
                "0734569874",
                "0731479524",
        };
        System.out.println("introduceti numarul cautat");
        String numarCautat = scanner.nextLine();
        boolean cautare = false;
        for (String numar : agenda) {
            if (numarCautat.equals(numar)) {
                cautare = true;
                break;
            }
        }
            if(cautare){
                System.out.println("numarul a fost gasit");
            }else{
                System.out.println("numarul nu a fost gasit");
            }
    }
}
