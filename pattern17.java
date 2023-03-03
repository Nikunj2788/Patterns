package patterns;

import java.util.Scanner;

public class pattern17 {
	public void simple17(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i == 0 || i == n-1 || j==0||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern17 t = new pattern17();
	int n = sc.nextInt();
	t.simple17(n);
}
}
