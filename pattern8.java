package patterns;

import java.util.Scanner;

public class pattern8 {
	public void simple8(int n) {
		for(int i=0;i<n;i++) {
			
		    //space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			//star
			for(int j=0;j<2*n-(2*i+1);j++) {
				System.out.print("*");
			}
			
			//space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern8 t = new pattern8();
	int n = sc.nextInt();
	t.simple8(n);
}
}
