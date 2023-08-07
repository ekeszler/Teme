package Reluare_teme_Array;

public class Pb9Array {
    //9. Scrie un program care sa afiseze cel mai mare si cel mai mic pret dintr-o lista de preturi.
    //De exemplu, pentru {1, 7, 3, 10, 9}, se vor afisa in consola valorile 1 si 10
    public static void main(String[] args) {
        int[] priceList = {1, 7, 3, 10, 9};
        int max = priceList[0];
        int min = priceList[0];
        for(int i = 0; i < priceList.length; i++){
            if(priceList[i]>max){
                max = priceList[i];
            } else if (priceList[i] < min) {
                min = priceList[i];
            }
        }
        System.out.println("minimul din sir este: " + min);
        System.out.println("maximul din sir este: " + max);
    }
}
