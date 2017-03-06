package ASSIGNMENT2b;

import java.util.Scanner;

public class IncreasingDecreasingSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = s.nextInt();
		System.out.println("Enter first number : ");
		int prev = s.nextInt();
		int count = 2, current;
		boolean isDec = true;

		while(count <= n) {
			current = s.nextInt();
			count++;
			if(current < prev) {
				if(isDec == false) {
					System.out.println("Invalid Sequence !");
					return;
				}
			}
			else {
				if(isDec == true) {
					isDec = false;
				}
			}
			prev = current;
		}
		System.out.println("Sequence valid !");
	}
}
