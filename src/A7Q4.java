
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 elements.");                        //Requests user imput for the 10 elements
        int[] Array = new int[10];                                              //Creates array with 10 spaces
        int N = 10;                                                             //Creates control variable to operate code
        while(N > 0){                                                           //Accepts all 10 user inputs with array
            N = N - 1;                                                          
            Array[N] = input.nextInt();
        }
        boolean TF = false;                                                     //Boolean, used to control the next while statament
        while(TF == false){                                                     //While loop using boolean to ensure it continues to operate
            TF = true;
            N = 10;                                                             //Resets N to 10 for the next while loop
            while(N > 1){                                                       //Makes thus run for the number of elements given
                N = N - 1;                                                      //Reduces N value for next if
                if(Array[N] > Array[(N - 1)]){                                  
                    int X = Array[N];
                    int Y = Array[N - 1];
                    Array[N] = Y;
                    Array[N - 1] = X;
                    TF = false;
                }
            }
        }
        System.out.println("The elements in order are: ");
        N = 10;
        while(N > 0){
            N = N - 1;
            System.out.println(Array[N]);
        }
    }
}
