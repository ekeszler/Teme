package OOPintro.ex1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Dog dog1 = getDog();
        System.out.println(dog1.toString());
        System.out.println(dog1.run());
        System.out.println(dog1.bark());
        Dog dog2 = getDog();
        System.out.println(dog2.toString());
        System.out.println(dog2.run());
        System.out.println(dog2.bark());

    }

    public static Dog getDog(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele cainelui:");
        String name = scanner.nextLine();
        System.out.println("Introduceti culoarea cainelui:");
        String color = scanner.nextLine();
        System.out.println("introduceti rasa cainelui:");
        String breed = scanner.nextLine();
        return new Dog(name, color, breed);
    }
}
