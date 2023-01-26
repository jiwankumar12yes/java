package Milestone1.Lecture6Patterns2;
import java.util.*;
public class StarPattern {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            int p=i-1;
            j=1;
            while(j<=i-1){
                System.out.print("*");
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
