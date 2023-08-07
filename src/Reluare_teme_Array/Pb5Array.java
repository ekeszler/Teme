package Reluare_teme_Array;

public class Pb5Array {
    //    5. Scrie un program care sa afiseze pretul mediu pe metru patrat, dintr-o lista de preturi ale unor proprietati imobiliare:
//    De exempu, pentru {1, 7, 3, 10, 9}, se va afisa in consola valoarea 6
    public static void main(String[] args) {
        double[] prices = {1, 7, 3, 10, 9};
        double med = 0;
        double sum = 0;
      for(int i = 0; i < prices.length; i++){
          sum = sum + prices[i];
      }
      med = sum/ prices.length;
        System.out.println("pretul mediu este " + med);

    }
}
