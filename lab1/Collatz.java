/** Class that prints the Collatz sequence starting from a given number.
 *  @author moon
 */
public class Collatz {

    /** Correct implementation of nextNumber */
    public static int nextNumber(int n) {
        //Check if n already 1
        if(n==1){
            return 1;
        }
        //check if n even
        else if(n % 2==0){
            //return n/2
            return n/2;
        }
        //if n odd
        else{
            //return 3n+1
            return (3*n)+1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

