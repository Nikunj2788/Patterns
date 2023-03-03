package patterns;

import java.util.Scanner;

public class pattern1 {
	public void simple(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	pattern1 p = new pattern1();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	p.simple(n);
}
}
