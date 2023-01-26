package Milestone1.Lecture6Patterns2;
import java.util.*;
public class MirrorImageNumberPattern {
    public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
            int star=1;
			int j=1;
			while(j<=n-i){
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n){
				System.out.print(star);
                star++;
				j++;
			}
			System.out.println();
			i++;
            // star++;
		}
        s.close();
		
	}
}
