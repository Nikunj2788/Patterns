package patterns;

import java.util.Scanner;

public class patern12 {
	public void simple12(int n) {
		int space = 2*(n-1);
		for(int i=0;i<n;i++) {
			//pattern
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			
			//space
			for(int j=0;j<=space;j++) {
				System.out.print(" ");
			}
			
			//pattern
			for(int j=i;j>=0;j--) {
				System.out.print(j);
			}
			System.out.println();
			space -=2;
		}
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	patern12 t = new patern12();
	int n = sc.nextInt();
	t.simple12(n);
}
}
