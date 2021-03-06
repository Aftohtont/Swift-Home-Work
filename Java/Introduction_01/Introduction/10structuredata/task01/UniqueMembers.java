package task01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.naming.directory.InvalidAttributeValueException;

public class UniqueMembers {

	private static final List<Integer> nums = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// first variant use list

		System.out.print("Enter integer positive number:");

		int n = sc.nextInt();

		if (n <= 0) {
			throw new InputMismatchException("Num must be positive");
		} else {

			isUnique(n);
		}
		System.out.println(nums.toString());
		
	}

	private static void isUnique(int num) {


		for (int i = 0; i < num; i++) {
			System.out.print("Enter num");
			int m = sc.nextInt();
			if (!nums.contains(m)) {
				nums.add(m);
			}
		}
	}

}
