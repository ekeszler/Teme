import java.util.Scanner;

public class Teme_sesiunea3 {
    //1. [LIVE] Citeste de la tastatura doua numere si afiseaza-l la consola pe cel mai mare dintre ele.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti primul numar");
//        int a = scanner.nextInt();
//        System.out.println("Introduceti al doilea numar");
//        int b = scanner.nextInt();
//        if (a > b) {
//            System.out.println("numarul mai mare este " + a);
//        } else if (b > a) {
//            System.out.println("numarul mai mare este " + b);
//        }
//    }

    //2. [LIVE] Produci software pentru un fierbator de apa. Citeste de la tastatura temperatura curenta a apei si:
    //Var1: afiseaza un mesaj corespunzator daca temperatura este mai mare de 100 de grade (apa fierbe)
    //Var2: afiseaza un mesaj corespunzator daca apa fierbe, si un alt mesaj corespunzator in caz contrar
    //Var3: afiseaza un mesaj corespunzator daca temperatura este mai mare de 100 de grade (apa fierbe), un alt mesaj daca temperatura este mai mica decat 50 de grade (apa este in curs de fierbere) si un altul daca apa are temperatura intre 50 si 100 de grade (apa este aproape fiarta)

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti temperatura");
//        int temp = scanner.nextInt();
//        if(temp > 100){
//            System.out.println("apa fierbe");
//        } else if (50<temp && temp<100) {
//            System.out.println("apa este aproape fiarta");
//        } else if (0<temp && temp<=50) {
//            System.out.println("apa este in curs de fierbere");
//        }else{
//            System.out.println("nu ne intereseaza");
//        }
//    }

    //3.[LIVE] Citeste de la tastatura un caracter care reprezinta da sau nu. In functie de acest input, afiseaza in consola “de acord” sau “nu sunt de acord”.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Sunteti de acord? (Y/N)");
//        String caracter = scanner.nextLine();
//        //char majuscula = caracter.toUpperCase();
//        if(caracter == "da"){
//            System.out.println("de acord");
//        } else if (caracter == "nu") {
//            System.out.println("nu sunt de acord");
//        }
//
//    }

    //4. Avand la dispozitie o variabila care stocheaza un numar, afiseaza in consola daca numarul este par sau impar.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti numarul");
//        int numar = scanner.nextInt();
//        if(numar%2==0){
//            System.out.println("numarul este par");
//        }else {
//            System.out.println("numarul este impar");
//        }
//    }

//    5.Construieste un calculator de baza.
//    Citeste de la tastatura 2 numere si un caracter care reprezinta operatia pe care vrei sa o            realizezi: +, -, * sau /. Apoi afiseaza rezultatul calculului respectiv in consola. Ai grija sa       tratezi cazul in care se face impartire la 0.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("introduceti primul numar");
//        int nr1 = scanner.nextInt();
//        System.out.println("Introduceti al doilea numar");
//        int nr2 = scanner.nextInt();
//        System.out.println("Introduceti operatorul");
//        String operator = scanner.nextLine();
//        int rezultat;
//        if (operator == "+"){
//            adunare();
//        } else if (operator == "-") {
//            scadere();
//        } else if (operator == "*") {
//            inmultire();
//        } else if (operator == "/") {
//           impartire();
//        }else {
//            System.out.println("nu ne intereseaza");
//        }
//    }
//
//    public static int adunare(int nr1 , int nr2 , String operator ){
//        int sum = nr1 + nr2;
//        return sum;
//    }
//
//    public static int scadere (int nr1 , int nr2){
//        int dif = nr1 - nr2;
//        return dif;
//    }
//
//    public static int inmultire (int nr1 , int nr2){
//        int inmultire = nr1 * nr2;
//        return inmultire;
//    }
//
//    public static int impartire (int nr1, int nr2){
//        if(nr2 == 0){
//            System.out.println("cannot divide by 0");
//        }else{
//            int impartire = ((nr1 / nr2) + (nr1 % nr2));
//            return impartire;
//        }
//    }
}
