package Reluare_teme_Array;

import java.util.Scanner;

public class Pb3Array {
    //3. Scrie un program care sa afiseze de cate ori apare un anumit numar n (citit de la tastatura) intr-un array.
    //De exemplu, pentru {1, 2, 2, 3, 3, 3, 4, 4, 4, 4} si n=3, se va afisa "3 apare de 3 ori".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti numarul");
        int n = scanner.nextInt();
        int[] sir = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int counter = 0;
        for(int i = 0; i < sir.length; i++){
            if(n == sir[i]){
                counter++;
            }
        }
        System.out.println("numarul " + n + " se regaseste in sir de " + counter + " ori");
    }
}
