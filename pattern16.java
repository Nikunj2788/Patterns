package patterns;

import java.util.Scanner;

public class pattern16 {
	public void simple16(int n) {
		int space = 2*(n-2);
		for(int i=0;i<2*n-1;i++) {
			//star
			int star = i;
			if(i>n) {
				star = 2*n-i;
			}

			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			//space
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
				
			//star
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<n) {
				space -= 2;
			}
			else {
				space +=2;
			}
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern16 t = new pattern16();
	int n = sc.nextInt();
	t.simple16(n);
}
}
