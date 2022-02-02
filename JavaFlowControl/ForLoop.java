package JavaFlowControl;

public class ForLoop {
    
    public static void main(String [] args) {
        //Used to run a block of code for a certain number of times
        int n = 4;

        for (int i = 1; i<= n; ++i) {
            System.out.println(i);
        }

        int sum = 0;
        int limit = 1000;

        for(int i = 1; i<=limit; ++i) {
            sum += i;
        }

        System.out.println(sum);
    }
}
