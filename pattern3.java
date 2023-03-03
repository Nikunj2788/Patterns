package patterns;

import java.util.Scanner;

public class pattern3 {
	public void simple3(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern3 t = new pattern3();
	int n = sc.nextInt();
	t.simple3(n);
}
}
