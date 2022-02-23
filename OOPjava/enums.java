package OOPjava;

// Enums - enumerations meaning specifically listed

public class enums {
    
    enum Level {
        LOW,
        HIGH,
        medium
    }


    public static void main(String [] args ) {
        Level myVar = Level.medium;

        System.out.println(myVar);
    }
}

// ===================================================================================


enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  //There can't be more than one main class in one file
  
/*  public class Random {
    public static void main(String[] args) {
      Level myVar = Level.MEDIUM;
  
      switch(myVar) {
        case LOW:
          System.out.println("Low level");
          break;
        case MEDIUM:
           System.out.println("Medium level");
          break;
        case HIGH:
          System.out.println("High level");
          break;
      }
    }
  } */