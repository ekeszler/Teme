package Reluare_teme_Array;

public class Pb2Array {
    //2. Scrie un program care sa adune toate preturile dintr-o lista (ca mai apoi sa fie afisata suma totala in cosul de cumparaturi):
    //De exemplu, pentru {1, 7, 3, 10, 9}, se va afisa in consola valoarea 30.
    public static void main(String[] args) {
        int[] prices = {1, 7, 3, 10, 9};
        int pricesSum = 0;
        for(int i = 0; i< prices.length; i++){
            pricesSum = pricesSum + prices[i];
        }
        System.out.println("suma produselor din cos este " + pricesSum);
    }
}
