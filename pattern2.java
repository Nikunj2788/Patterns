package patterns;

import java.util.Scanner;

public class pattern2 {
	public void simple1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern2 t = new pattern2();
	int n = sc.nextInt();
	t.simple1(n);
}
}
