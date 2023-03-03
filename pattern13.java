package patterns;

import java.util.Scanner;

public class pattern13 {
	public void simple13(int n) {
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num +" ");
				num = num+1;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pattern13 t = new pattern13();
		int n = sc.nextInt();
		t.simple13(n);
	}
}
