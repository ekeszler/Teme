package OOPintro.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = getCat();
        Cat cat1 = getCat();
        Cat cat2 = getCat();
        Cat.getNumberOfCats();
    }

    public static Cat getCat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti numele pisicii");
        String name = scanner.nextLine();
        return new Cat(name);
    }


}
