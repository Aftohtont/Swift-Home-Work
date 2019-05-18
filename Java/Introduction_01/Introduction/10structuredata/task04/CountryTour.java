package task04;

import java.util.Scanner;

public class CountryTour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter towns:");
		int n=sc.nextInt();
		
		int [] distances=new int[n];
		int[] foods=new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("enter distance:");
			distances[i]=sc.nextInt();
			System.out.print("enter food:");
			foods[i]=sc.nextInt();
		}
		
			
		
	for (int town = 0; town < n; town++) {
		
		int food=foods[town];
		
		for (int day = 1; day <=n ; day++) {
			
			int distance=distances[(town+day)%n];
			food-=distance;
			if(food<0){
				break;
			}
			food+=foods[(town+day)%n];
		}
		if(food>=0){
			System.out.println(town+1);
			return;
		}
	}
		System.out.println("No");
	}
}
