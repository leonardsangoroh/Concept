package JavaFlowControl;

public class WhileLoop {
    
   public static void main(String [] args) {
        int i = 1;
        int n = 5;
        int j = 1;

        while (i<=n) {
            System.out.println(i);

            i++;
        }

        do {
            System.out.println(j);
        } while (j<=n);
   }
}
