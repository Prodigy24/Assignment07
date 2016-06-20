
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        System.out.println("How many heights are being read?");
        int N = input.nextInt();
        int C = N;
        int[] Outof = new int[N];
        System.out.println("Please enter their heights.");
        int[] Heights = new int[N];
        while(0 < C){
            C = C - 1;
            Heights[C] = input.nextInt();
        }
        C = N;
        int Avg = 0;
        while(C > 0){
            C = C - 1;
            Avg = Avg + (Heights[C]);
        }
        C = N;
        Avg = Avg/N;
        System.out.println("Overall Average height is about " + Avg);
        while(0 < C){
               C = C - 1;
            if(Heights[C] > Avg){
                System.out.println(Heights[C] + " is above average.");
            }      
        }
    }
}

   
