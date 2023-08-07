package Reluare_teme_Array;

public class Pb14Array {
    //14. Scrie un program care afiseaza produsul a cate 2 numere consecutive din array.
    //Daca numarul de elemente este impar, ultimul produs va fi numarul insusi.
    //De exemplu, pentru {1, 7, 3, 10, 9}, se va afisa in consola 7, 30, 9.
    //Explicatie: (7 = 1 * 7, 30 = 3 * 10, 9 = 1 * 9)\
    public static void main(String[] args) {
        int[] sir = {1, 7, 3, 10, 9};
        int produs = 0;
        for (int i = 0; i < sir.length - 1; i += 2) {
            produs = sir[i] * sir[i + 1];
            System.out.print(produs + " ");
        }
        if (sir.length % 2 != 0) {
            System.out.println(sir[sir.length-1]);
        }
    }
}
