package backjoon;

import java.util.Scanner;

public class back1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1>n2) System.out.println(">");
		else if(n1<n2) System.out.println("<");
		else System.out.println("==");
	}

}
