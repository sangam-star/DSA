

public class fibo {
    public static void main(String[] args) {

        System.out.println(" The fibonacci of 5th item is " + fibo(5));
        System.out.println( " The fibonacci of 6th item " +fibo(6));

        
    }

    static  int fibo (int n){
        // Base case
        if(n < 2){   // i this if n is 1 or 0 then return n: 0th item is 0 and 1st item is 1
                     
            return n;
        }

        return fibo(n-1) + fibo(n-2);


    }
    
}
