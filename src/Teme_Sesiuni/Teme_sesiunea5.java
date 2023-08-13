package Teme_Sesiuni;

import java.util.Scanner;

public class Teme_sesiunea5 {
//    public static void main(String[] args) {
//        //1. Scrie un program care sa caute un numar de telefon intr-o lista de numere. Programul va printa “numarul a fost gasit” sau “numarul nu a fost gasit”
//
//        public static String Agenda () {
//            String[] agenda = {
//                    "0745612345",
//                    "0789542365",
//                    "0787945216",
//                    "0721678945",
//                    "0700054978",
//                    "0788845621",
//            };
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti numarul de telefon:");
//        String yourNumber = scanner.nextLine();
//
//        boolean foundNumber = false;
//        for(String number : Agenda){
//            if(number.equals(yourNumber)){
//                foundNumber = true;
//            }break;
//        }
//
//        if (foundNumber){
//            System.out.println("Numarul cautat a fost gasit");
//        }else{
//            System.out.println("Numarul cautat nu a fost gasit");
//        }
//    }

    //2. Scrie un program care sa adune toate preturile dintr-o lista (ca mai apoi sa fie afisata suma totala in cosul de cumparaturi):

//    public static void main(String[] args) {
//        int[] priceList = {1, 7, 3, 10, 9};
//        int sum = 0;
//        for (int i = 0; i < priceList.length; i++){
//            sum = sum + priceList[i];
//        }
//        System.out.println("suma elementelor din cos este "+sum);
//    }

//    3. Scrie un program care sa afiseze de cate ori apare un anumit numar n (citit de la tastatura) intr-un array.
//    De exemplu, pentru {1, 2, 2, 3, 3, 3, 4, 4, 4, 4} si n=3, se va afisa "3 apare de 3 ori".

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti numarul cautat");
//        int number = scanner.nextInt();
//        int[] list = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
//        int counter = 0;
//        for(int i = 0; i < list.length; i++){
//            if (number == list[i]){
//                counter = counter + 1;
//            }
//        }
//        System.out.println(number + " apade de "+ counter + " ori");
//    }

    //4. Construieste un array bazat pe input-ul utilizatorului.
    //Cat timp utilizatorul introduce numere de la tastatura (maxim 100 de numere), adauga-le intr-un array si apoi afiseaza elementele array-ului.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Cate numere doriti sa introduceti?");
//        int n = scanner.nextInt();
//
//        int[] lista = new int[n];
//        System.out.println("Introduceti numerele");
//
//            for (int i = 0; i < n; i++) {
//                lista[i] = scanner.nextInt();
//            }
//
//        System.out.println("Numerele din lista sunt:");
//            for (int i = 0; i < n; i++) {
//                System.out.print(lista[i] + " ");
//            }
//
//    }

    //5. Scrie un program care sa afiseze pretul mediu pe metru patrat, dintr-o lista de preturi ale unor proprietati imobiliare:
    //De exempu, pentru {1, 7, 3, 10, 9}, se va afisa in consola valoarea 6

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] preturi = {1 ,7,  3, 10, 9};
//        int pretMediu = 0;
//        int sum = 0;
//        int counter=0;
//        for (int i =0; i < preturi.length; i++){
//            sum = sum + preturi[i];
//            counter++;
//        }
//        for(int i = 0; i < preturi.length; i++){
//            pretMediu = (sum / counter);
//        }
//        System.out.println("pretul mediu este: "+pretMediu);
//    }

    //6. Scrie un program care sa calculeze produsul numerelor impare din intervalul x si y, unde numerele x si y sunt introduse de la tastatura

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti primul numar din interval");
//        int x = scanner.nextInt();
//        System.out.println("Introduceti ultimul numar din interval");
//        int y = scanner.nextInt();
//        int length = y;
//        int[] sir = new int[length];
//        for(int i = 0; i < length; i++){
//            sir[i] = x + i;
//        }
//        int produs = 1;
//        for(int i = 0; i < length; i++){
//            if(sir[i] % 2 != 0) {
//                produs = produs * i;
//            }
//        }
//        System.out.println("produsul numerelor impare este "+ produs);
//    }
    // Aici daca incep sirul cu 0 functioneaza perfect, daca incep sirul cu un numar mai mare decat 0 nu functioneaza corect si nu inteleg de ce

    //7. Vrei sa pui un discount de n lei (n fiind citit de la tastatura), pentru fiecare produs.
    //De exemplu, pentru n = 2 si lista de preturi {3, 7, 3, 10, 9}, lista de preturi va deveni {1, 5, 1, 8, 7}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("introduceti valoarea discountului");
//        int discount = scanner.nextInt();
//        int[] listaPreturi = {3, 7, 3, 10, 9};
//        for(int i = 0; i < listaPreturi.length; i++){
//            listaPreturi[i] = listaPreturi[i] - discount;
//        }
//        for(int i = 0; i < listaPreturi.length; i++) {
//            System.out.print(listaPreturi[i] + " ");
//        }
//    }

    //8. Vrei sa vezi cat studiezi saptamanal pentru programare
    //Citeste de la tastatura numarul de zile pe care le-ai petrecut invatand programare.
    //Citeste apoi cate ore ai invatat in fiecare din aceste zile.
    //Calculeaza media de studiu pe zi.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti numarul de zile");
//        int n = scanner.nextInt();
//        int[] ore = new int[n];
//        for(int i = 0; i < 24; i++){
//            ore[n] = scanner.nextInt();
//        }
//        for(int i = 0; i < 24; i++ ){
//            System.out.println(ore[n]);
//        }
// Asta deocamdata nu merge dar ma mai gandesc... nu imi dau seama cum sa fac o asociere intre zi si numarul de ore, de exemplu ziua 1 sa fie asociata cu 4 ore si tot asa... dar ma mai gandesc.

    //}
}
