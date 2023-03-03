package patterns;

import java.util.Scanner;

public class pattern5 {
	public void simple5(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern5 t = new pattern5();
	int n = sc.nextInt();
	t.simple5(n);
}
}
