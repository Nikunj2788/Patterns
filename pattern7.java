package patterns;

import java.util.Scanner;

public class pattern7 {
	public void simple7(int n) {
		for(int i=0;i<n;i++) {
			
		    //space
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			//star
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			
			//space
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern7 t = new pattern7();
	int n = sc.nextInt();
	t.simple7(n);
}
}
