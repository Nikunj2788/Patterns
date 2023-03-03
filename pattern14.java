package patterns;

import java.util.Scanner;

public class pattern14 {
	public void simple14(int n) {
		int space = 0;

		for(int i =0;i<n;i++) {
			//star
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			//space
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			space +=2;
			System.out.println();
		}
		for(int i =0;i<n;i++) {
			//star
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			//space
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			space -=2;
			System.out.println();
		}
		
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern14 t = new pattern14();
	int n = sc.nextInt();
	t.simple14(n);
}
}
