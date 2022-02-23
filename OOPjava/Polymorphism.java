package OOPjava;

public class Polymorphism {

    public static void main (String [] args) {

        Animal myAnimal = new Animal();

        Animal myPig = new Pig();

        Animal myDog = new Dog();

        myAnimal.animalSound();

        myPig.animalSound();

        myDog.animalSound();
    }
    
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The Pig is making some sound");
    }
}

class Dog extends Animal {
    
    public void animalSound() {
        System.out.println("The dog is barking");
    }
}
