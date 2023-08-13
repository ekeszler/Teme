package OOPintro.ex3;

import java.util.Scanner;

public class Cat {

    String name;
    static int counter = 0;

    public Cat(String name) {
        this.name = name;
        counter++;
    }

    public static int getNumberOfCats(){
        System.out.println("numarul pisicilor este: " + counter);
        return counter;
    }

    @Override
        public String toString () {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
