package Reluare_teme_Array;

public class Pb11Array {
    //    11.Scrie un program care sa afiseze cate numere pare si cate numere impare se afla intr-un array:
//    De exemplu, pentru {1, 7, 3, 10, 9}, sa va afisa in consola Odd=4; Even=1
    public static void main(String[] args) {
        int[] sir = {1, 7, 3, 10, 9};
        int odd = 0;
        int even = 0;
        for (int i = 0; i < sir.length; i++) {
            if (sir[i] % 2 == 0){
                even = even + 1;
            }else{
                odd = odd + 1;
            }
        }
            System.out.println("numarul elementelor pare este: " + even);
            System.out.println("numarul elementelor impare este: " + odd);

    }
}
