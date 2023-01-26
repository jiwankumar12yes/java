package Milestone1.Lecture6Patterns2;
import java.util.*;
public class TriangleofNumbers {
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
            int temp=i;
            while(j<=i){
                System.out.print(temp);
                j++;
                temp++;
            }
            j=1;
            
            temp=temp-2;
            while(j<=i-1){
                System.out.print(temp);
                
                temp--;
                j++;
                
            }
            System.out.println();
            i++;
        }
    }
}
