
public class Practice1 {

	public static void main(String[] args) {
		//Example String: Payment $100 paid 
		//Short syntax only works for String class
		String str = "Payment $100 paid";
		/*Full syntax
		String str2 = new String("Payment $100 paid");*/
		//print the 8th index of the str string which is $
		System.out.println(str.charAt(8));
		String str1 = "Payments $100 paid";
		//print the index where $ is present
		System.out.println(str1.indexOf("$"));
		//print the string of str from the 8th index
		System.out.println(str.substring(8));
		
	}

}
