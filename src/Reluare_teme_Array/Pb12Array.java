package Reluare_teme_Array;

public class Pb12Array {
    //12. Scrie un program care sa verifica daca un array este sortat crescator
    public static void main(String[] args) {
        int[] sir = {1, 7, 3, 10, 9};
        boolean ascending = true;
        for (int i = 0; i < sir.length - 1; i++) {
            if (sir[i] > sir[i + 1]) {
                ascending = false;
                break;
            }
        }
        if(ascending){
            System.out.println("sirul este ordonat crescator");
        }else{
            System.out.println("sirul este ordonat descrescator");
        }
    }
}
