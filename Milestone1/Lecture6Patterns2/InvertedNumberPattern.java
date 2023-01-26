package Milestone1.Lecture6Patterns2;
import java.util.*;
public class InvertedNumberPattern {
    public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
        int temp=n;
		while(i<=n){
			int j=1;
			while(j<=n-i+1){
				System.out.print(temp);
				j++;
				
			}
			System.out.println();
            temp--;
			i++;
            // n--;
		}

		
	}
}
