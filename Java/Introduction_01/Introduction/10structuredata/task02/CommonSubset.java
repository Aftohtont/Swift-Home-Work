package таск02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CommonSubset {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner((System.in));
		
		System.out.print("enter number of Numbers");
		int n=sc.nextInt();
		
		List fList=new ArrayList<>();
		System.out.print("enter number of Numbers");
		int m=sc.nextInt();
		
	
		List sList=new ArrayList<>();

			addItems(fList, sList,n,m);
		
		if (n <= 0) {
			throw new InputMismatchException("Num must be positive");
		} 
		
		boolean hasCommonItem=false;
		for (Object item: fList) {
			if(sList.contains(item)){
				System.out.print(item+" ");
				hasCommonItem=true;
			}
		}
			if(!hasCommonItem){
				System.out.println("No");
			}
	}
	
	private static void addItems(List fList,List sList,int n,int m) {


		for (int i = 0; i < n+m; i++) {
			System.out.print("Enter num");
			int a=new Scanner(System.in).nextInt();
			if(i<n){
				fList.add(a);
			}else{
				sList.add(a);
			}
		}
	}
}
