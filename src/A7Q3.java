
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N = 2;
        System.out.println("Please enter two integers.");
        int[] Array = new int[N];
        while(0 < N){
            N = N - 1;
            Array[N] = input.nextInt();
        }
        if(Array[0] < Array[1]){
            System.out.println(Array[0] + " " + Array[1]);
        } else {
            System.out.println(Array[1] + " " + Array[0]);
        }
    }
}

