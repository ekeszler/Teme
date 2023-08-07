package Reluare_teme_Array;

public class Pb10Array {
    //10. Scrie un program care sa inverseze elementele unui array. Adica vrei ca utilizatorul sa poata vedea o lista de preturi de la coada la cap:
    //De exemplu, pentru {1, 7, 3, 10, 9}, sa va afisa in consola "9, 10, 3, 7, 1"
    public static void main(String[] args) {
        int[] priceList = {1, 7, 3, 10, 9};
        int[] newPriceList = new int[priceList.length];
        for (int i = priceList.length - 1; i >= 0; i--){
            int j = priceList.length - 1 - i;
                newPriceList[j] =  priceList[i];
        }
        for(int j = 0; j < newPriceList.length; j++){
            System.out.print(newPriceList[j] + " ");
        }
    }
}
