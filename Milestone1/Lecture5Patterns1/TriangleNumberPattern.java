package Milestone1.Lecture5Patterns1;
import java.util.*;
public class TriangleNumberPattern{
    public static void main(String args[])
    {
       
		
            /* Your class should be named Solution.
             * Read input as specified in the question.
             * Print output as specified in the question.
            */
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int i=1;
            while(i<n){
                int j=1;
                while(i>=j){
                    System.out.print(i);
                    j++;
                }
                System.out.println();
                i++;
            }
        
    }
}