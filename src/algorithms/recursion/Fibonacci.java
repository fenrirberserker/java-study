/**
 * Print the result of a fibonacci sequence
 */
package algorithms.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static void main(String[] args) {

        int num = readInput();
        System.out.println("result " + fibonacci(num));

    }

    public static int fibonacci(int n){

        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
        else if (n==1) {  // caso base
            return 1;
        }
        else if (n==0){  // caso base
            return 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }

    }

    public static int readInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = null;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }
}
