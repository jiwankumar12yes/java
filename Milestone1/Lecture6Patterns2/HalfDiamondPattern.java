package Milestone1.Lecture6Patterns2;
import java.util.*;
public class HalfDiamondPattern {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=1){
                System.out.print("*");
                j++;
            }
            j=2;
            int k=1;
            while(j<=n/2){
                System.out.print(k);
                k++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
