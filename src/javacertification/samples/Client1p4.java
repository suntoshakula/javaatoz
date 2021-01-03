package javacertification.samples;

public class Client1p4 {
	
	public static void main(String[] args) {
		CharStack1p2 stack = new CharStack1p2(40);
		
		String str = "!no tis ot nuf era skcatS";
		int length = str.length();
		System.out.println("orig string "+str);

		for(int i=0;i<length;i++) {
			stack.push(str.charAt(i));
		}
		
		System.out.println("reversed string");
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		System.out.println();
	}

}
