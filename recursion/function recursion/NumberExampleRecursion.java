
// A program to demonstrate recursion in Java
// This program prints numbers from 1 to 5 using recursion

public class NumberExampleRecursion {
    public static void main(String[] args){

        print( 1);
    }
    

    static void print(int n){

        if (n == 5){
            System.out.println(n);
            return;
        }
            System.out.println(n);


          print(n+1);
    }
}
