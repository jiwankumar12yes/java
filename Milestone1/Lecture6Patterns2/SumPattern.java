package Milestone1.Lecture6Patterns2;
import java.util.*;
public class SumPattern {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int sum=i;
        while(i<=n){
            int t=1;
            int j=1;
            while(j<=i){
                if(t<i){
                    System.out.print(t+"+");
                    t++;
                    j++;
                }
                else{
                    System.out.print(t+"="+sum);
                    j++;
                }
                System.out.println();
                i++;
                sum=sum+i;
            }
        }

    }
}
