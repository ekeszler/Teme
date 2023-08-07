package Reluare_teme_Array;

import java.util.Scanner;

public class Pb4Array {
    //4. Construieste un array bazat pe input-ul utilizatorului.
    //Cat timp utilizatorul introduce numere de la tastatura (maxim 100 de numere), adauga-le intr-un array si apoi afiseaza elementele array-ului.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cate numere doriti sa aveti in sir?");
        int n = scanner.nextInt();
        int[] sir = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("introduceti numerele");
            sir[i] = scanner.nextInt();
        }
        for(int i = 0; i<n; i++) {
            System.out.print(sir[i] + " ");
        }
    }
}
