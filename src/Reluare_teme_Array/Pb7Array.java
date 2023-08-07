package Reluare_teme_Array;

import java.util.Scanner;

public class Pb7Array {
    //7. Vrei sa pui un discount de n lei (n fiind citit de la tastatura), pentru fiecare produs.
    //De exemplu, pentru n = 2 si lista de preturi {3, 7, 3, 10, 9}, lista de preturi va deveni {1, 5, 1, 8, 7}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] priceList = {3, 7, 3, 10, 9};
        System.out.println("introduceti discountul");
        int n = scanner.nextInt();
        int[] discountList = new int[priceList.length];
        for (int i = 0; i < priceList.length; i++) {
            discountList[i] = priceList[i] - n;
        }

        for (int i = 0; i < priceList.length; i++) {
            System.out.print(discountList[i] + " ");
        }
    }

}
