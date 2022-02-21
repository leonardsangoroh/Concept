package OOPjava;



class Test {
    public static void main (String [] args) {
        Encapsulation newEnc = new Encapsulation();

        String jina = newEnc.getName();

        System.out.println(jina);
    }
}

public class Encapsulation {
    private String name = "Lee";

    public String getName () {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}