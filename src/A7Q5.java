
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements.");             //Requests user input for how many elements
        int C = input.nextInt();                                                //Accepts user input
        int[] Array = new int[C];                                               //Creates sized array based on number of elements
        int N = C;                                                              //All "10" replaced with C to impliment the user's number of elements
        System.out.println("Please enter the elements.");
        while(N > 0){
            N = N - 1;
            Array[N] = input.nextInt();
        }
        boolean TF = false;
        int X = 0;
        int Y = 0;
        while(TF == false){
            TF = true;
            N = C;
            while(N > 1){
                N = N - 1;
                if(Array[N] > Array[(N - 1)]){
                    X = Array[N];
                    
                    Y = Array[N - 1];
                    Array[N] = Y;
                    Array[N - 1] = X;
                    TF = false;
                }
            }
        }
        System.out.println("The elements in order are: ");
        N = C;
        while(N > 0){
            N = N - 1;
            System.out.println(Array[N]);
        }
        int Mid = (C / 2);                                                      //Acquires the halfway point as an int, meaning if it's uneven it will round the .5 down
        double Median = (C / 2);                                                //Acquires halfway point as a double, meaning it will not round the .5
        System.out.println(Median);                     
        System.out.println(Mid);
        if(Mid == Median){                                                      //If they are equal, the middle must be an even number, as otherwise the int would round down making them different
            int M = Mid + 1;                                                    //If the middle is equal, ther will be two. M now represents the higher middle value (I.e. if the # of elements is 4, half is two, int rounds to 2, 2 + 1 = 3, thus we have both halfway ints)
            System.out.println(Array[C - M]);                                   //Because the array was created coutning down, we need to subtract the halfs in order to get the actual halfway points.
            System.out.println(Array[C - Mid]);
        } else {
            System.out.println(Array[Mid]);                                     //If the # of elements is odd, there will only be one middle value, thus this is simple.
        }
    }
}
    
