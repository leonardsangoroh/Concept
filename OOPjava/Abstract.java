package OOPjava;

class Normal extends Abstract {

    public void animalSound() {
        System.out.println("Make some noise");
    }

    public static void main (String [] args) {

        Normal myNormal = new Normal();

        myNormal.animalSound();

        myNormal.sleep();
    }
}

abstract class Abstract {

    public abstract void animalSound ();

    public void sleep () {
        System.out.println("Mimi nalala");
    }
}


