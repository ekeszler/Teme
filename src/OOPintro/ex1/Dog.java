package OOPintro.ex1;

public class Dog {

    String name;
    String color;
    String breed;

    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public String bark(){
        return "woof";
    }

    public String run(){
        return "dog is running";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}

