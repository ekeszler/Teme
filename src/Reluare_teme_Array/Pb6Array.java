package Reluare_teme_Array;

import java.util.Scanner;

public class Pb6Array {
    //6. Scrie un program care sa calculeze produsul numerelor impare din intervalul x si y, unde numerele x si y sunt introduse de la tastatura
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti primul numar din sir");
        int x = scanner.nextInt();
        System.out.println("introduceti ultimul numar din sir");
        int y = scanner.nextInt();
        int[] sir = new int[y - x + 1];
        int produs = 1;
        for (int i = 0; i < sir.length; i++) {
            sir[i] = x + i;
            if (sir[i] % 2 != 0){
                produs = produs * sir[i];
            }
        }
        System.out.println("sirul dvs este:");
        for (int i = 0; i < sir.length; i++) {
            System.out.print(sir[i] + " ");
        }
        System.out.println();
        System.out.print("produsul numerelor impare este: " + produs);

    }
}
