package Reluare_teme_Array;

import java.util.Scanner;

public class Pb8Array {
    //8. Vrei sa vezi cat studiezi saptamanal pentru programare
    //Citeste de la tastatura numarul de zile pe care le-ai petrecut invatand programare.
    //Citeste apoi cate ore ai invatat in fiecare din aceste zile.
    //Calculeaza media de studiu pe zi.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de zile");
        int n = scanner.nextInt();
        int[] daysNumber = new int[n];
        for (int i = 0; i < daysNumber.length; i++) {
            daysNumber[i] = daysNumber[i] + i + 1;
        }
        System.out.println("Zilele sunt:");

        for (int i = 0; i < daysNumber.length; i++) {
            System.out.print(daysNumber[i] + " ");
        }
        System.out.println();
        System.out.println("introduceti numarul orelor de studiu pe zi");
        int[] studyHours = new int[n];
        for (int j = 0; j < studyHours.length; j++) {
            System.out.println("ziua " + (j + 1));
            studyHours[j] = scanner.nextInt();
        }
        System.out.println("orele de studiu pe zi sunt:");
        for (int j = 0; j < studyHours.length; j++) {
            System.out.print(studyHours[j] + " ");
        }
        int media = 0;
        int sum = 0;
        System.out.println("Media de studiu pe zi este:");
        for(int j = 0; j< studyHours.length; j++){
            sum = sum + studyHours[j];
        }
        System.out.println("media de studiu pe zi este: " + (sum/n));
    }
}
