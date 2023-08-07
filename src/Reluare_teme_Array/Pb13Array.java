package Reluare_teme_Array;

public class Pb13Array {
    //13. Scrie un program care verifică dacă un array este palindrom.
    //Un array este palindrom daca ordinea elementelor este aceeași dacă o parcurgem de la început la sfârșit, sau de la sfârșit la început.
    public static void main(String[] args) {
        int[] sir = {1, 7, 3, 7, 1};
        boolean marker = true;
        for (int i = 0; i< sir.length; i++){
            int j = sir.length-1-i;
            if(sir[i] == sir[j]){
                marker = true;
            }else{
                marker = false;
                break;
            }
        }
        if(marker){
            System.out.println("sirul este palindrom");
        }else{
            System.out.println("sirul nu este palindrom");
        }
    }
}
