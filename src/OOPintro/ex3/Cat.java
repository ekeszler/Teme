package OOPintro.ex3;

import java.util.Scanner;

public class Cat {

    String name;
    int counter;

    public Cat(String name) {
        this.name = name;
    }

    public int getNumberOfCats(){
        counter = 0;
        counter++;
        System.out.println("numarul pisicilor este: " + counter);
        return counter;
    }

    @Override
        public String toString () {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", counter=" + counter +
                    '}';
        }
    }
