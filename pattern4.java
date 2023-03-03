package patterns;

import java.util.Scanner;

public class pattern4 {
	public void simple4(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern4 t = new pattern4();
	int n = sc.nextInt();
	t.simple4(n);
}
}
