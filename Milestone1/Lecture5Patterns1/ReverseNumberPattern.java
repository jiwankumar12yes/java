package Milestone1.Lecture5Patterns1;
import java.util.*;
public class ReverseNumberPattern {
    
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;i>=j;j++){
				System.out.print(i-j+1);
			}
			System.out.println();
		}
		
	}

    
}
