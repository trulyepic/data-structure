package ds.stack;

public class App {

	public static void main(String[] args) {
		
		System.out.println(reversString("Kenneth"));

	}
	
	
	
	public static String reversString(String str) {
		
		int lentStr = str.length();
		
		Stack theStack = new Stack(lentStr);
		
		for(int i = 0; i<lentStr; i++) {
			
			char ch = str.charAt(i);
			
			theStack.push(ch);
		}
		
		String result = "";
		
		while(!theStack.isEmpty()) {
			char ch =theStack.pop();
			
			result+=ch;
		}
		
		return result;
	}

}
