
public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello";
		//we want to reverse it.
		String str2 = "";
		//Get the length of the string and store it in i-1 (starts at 0th index). As long as i >=0 (we want 0th index), decrement i (5)
		for(int i=str.length()-1; i >=0; i--) {
			//Get the string at position i and add/store it into str2 
			str2 =str2 + str.charAt(i);
		}
		System.out.println(str2);
		
	}

}
