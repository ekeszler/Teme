package Reluare_teme_Array;

import java.util.Scanner;

public class Pb16Array {
    //16. Esti programator si dezvolti un magazin online. Vrei sa ii arati utilizatorului care este cel mai apropiat pret (dintr-o lista de preturi) de bugetul utilizatorului.
    //Scrie un program care afiseaza cel mai apropiat element din array de un numar introdus de la tastatura, n. Daca exista mai multe numere la fel de apropiate,se afiseaza oricare dintre ele. De exemplu, pentru n=12 si array-ul {1, 7, 3, 10, 9, 18, 0} se va afisa 10. De exemplu, pentru n=5 si array-ul {1, 7, 3, 10, 9, 18, 0} se va afisa 7 sau 3.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] priceList = {1, 7, 3, 10, 9, 18, 0};
        System.out.println("introduceti bugetul dvs");
        int n = scanner.nextInt();
        int diferenta = 0;
        for(int i = 0; i < priceList.length; i++){
            diferenta = Math.abs(n - priceList[i]);
            System.out.println(diferenta);
        }
    }
}
