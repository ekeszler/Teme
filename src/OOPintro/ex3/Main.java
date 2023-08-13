package OOPintro.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printMenu();
        performSelectedAction();
}

    public static void performSelectedAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti optiunea");
        int option = scanner.nextInt();
        Cat cat = getCat();
        switch (option){
            case 1:
                cat.getNumberOfCats();
//            case 2:
//                break;
            default:performSelectedAction();
        }
    }

    public static void printMenu(){
        System.out.println("Meniu");
        System.out.println("1. Adaugati pisica");
        System.out.println("2. Iesire");
    }

    public static Cat getCat(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("introduceti numele pisicii");
    String name = scanner.nextLine();
    return new Cat(name);
    }
}
