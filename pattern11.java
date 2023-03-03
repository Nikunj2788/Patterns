package patterns;

import java.util.Scanner;

public class pattern11 {
	public void simple11(int n) {
		int star = 1;
		for(int i=0;i<n;i++) {
			
			if(i%2 == 0) {
				star =1;
			}
			else {
				star = 0;
			}
			for(int j=1;j<=i;j++) {
				System.out.print(star);
				star =1-star;
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern11 t = new pattern11();
	int n = sc.nextInt();
	t.simple11(n);
}
}
