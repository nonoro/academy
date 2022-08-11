package ex0811.study.GUIEventinner;


class Cat {
    void speak() {
        System.out.println("야옹");
    }
}

class Dog {
    void speak() {
        System.out.println("멍멍");
    }
}

class Sheep {
    void speak() {
        System.out.println("메에~");
    }
}

class Cow {
    void speak() {
        System.out.println("음메~");
    }
}

class Zoo {
    Cat cat = new Cat();
    Dog dog = new Dog();
    Sheep sheep = new Sheep();
    Cow cow = new Cow();
}

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.cat.speak();
        zoo.dog.speak();
        zoo.cow.speak();
        zoo.sheep.speak();
    }
}
