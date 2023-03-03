package patterns;

import java.util.Scanner;

public class pattern18 {
	public void simple18(int n) {
		for(int i=0;i<2*n-1;i++){
		  	for(int j=0;j<2*n-1;j++) {
		  		int top = i;
		  		int left =j;
		  		int right = (2*n-2) -j;
		  		int down = (2*n-2) - i;
		  		System.out.println(n-);
		  	}
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	pattern18 t = new pattern18();
	int n = sc.nextInt();
	t.simple18(n);
}
}
