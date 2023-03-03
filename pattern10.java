package patterns;

import java.util.Scanner;

public class pattern10 {
	public void simple10(int n) {
		for(int i=0;i<=2*n-1;i++) {
			int star = i;
			if(i>n) {
				star = 2*n-i;
			}
			for(int j=1;j<=star;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern10 t = new pattern10();
	int n = sc.nextInt();
	t.simple10(n);
}
}
