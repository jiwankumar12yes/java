package Milestone1.Lecture5Patterns1;
import java.util.*;
public class CharacterPattern {
    public static void main(String args[]){
        	
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		
		while(i<=n){
			int j=1;
            int k=65;
			while(i>=j){
				System.out.print((char)(k+i-1));
                k++;
				j++;
                // k++;
			}
			System.out.println();
			i++;
		}
		
    }
    
}
