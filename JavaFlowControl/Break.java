package JavaFlowControl;

public class Break {
    
    public static void main(String [] args) {
        //Break statement breaks out of a loop when a condition is met

        for(int i = 1; i <= 10; ++i) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }
    }
}
