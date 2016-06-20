
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A7Q1 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int N = input.nextInt();
        int C = N;
        int[] Outof = new int[N];
        System.out.println("Please enter their grades.");
        int[] Marks = new int[N];
        while(0 < C){
            C = C - 1;
            Marks[C] = input.nextInt();
        }
        C = N;
        double Avg = 0;
        while(C > 0){
            C = C - 1;
            Avg = Avg + (Marks[C]);
        }
        Avg = Avg/N;
        System.out.println("Overall Average: " + Avg);
    }
}
