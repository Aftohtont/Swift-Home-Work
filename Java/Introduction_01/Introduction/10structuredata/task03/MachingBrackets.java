package task03Stack;

import java.util.Stack;

public class MachingBrackets {
	
public static void main(String[] args) {
	
	System.out.println("Enter exspression whit brackets");
	
	String bracket=new Scanner(System.in).nextLine();
	
	Stack st=new Stack<>();
	
	
	for (int i = 0; i < bracket.length(); i++) {
		
		if(bracket.charAt(i)=='['||bracket.charAt(i)=='('||bracket.charAt(i)=='{'){
			st.push(bracket.charAt(i));
		}else{
			if(!st.isEmpty()&&(st.peek().equals('[')&&bracket.charAt(i)==']'||st.peek().equals('(')&&bracket.charAt(i)==')'||st.peek().equals('{')&&bracket.charAt(i)=='}')){
				st.pop();
			}
		}
	}
	
	if(st.isEmpty()){
		System.out.println(true);
	}else
		System.out.println(false);
}
}
