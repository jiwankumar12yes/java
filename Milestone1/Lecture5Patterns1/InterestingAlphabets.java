package Milestone1.Lecture5Patterns1;
import java.util.*;
public class InterestingAlphabets {
    public static void main(String[] args) {
		//Your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char e='E';
		int i=1;
		while(i<=n){
			int j=1;
			while(i>=j){
				System.out.print((char)(e-i+1));
				j++;
                e++;
			}
			System.out.println();
			i++;
            e--;
		}
	}
}
