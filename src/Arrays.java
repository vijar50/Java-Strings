
public class Arrays {

	public static void main(String[] args) {
		// Store these numbers in an 1D array called c[]
		int c[] = {2,5,8,7,4};
		int sum = 0;
		//increment through the c[] array from position 0 - 4 (5 times)
		/*for (int i=0;i<c.length;i++) {
			//add and store the int in the array position i
			sum = sum + c[i];
		}
		System.out.println(sum);*/
		//Loop through the Array and print the index containing the value 7
		for (int j=0;j<c.length;j++) {
			if(c[j] == 7) {
				System.out.println("7 is located at the following index: " + j);
				break; // break out of the loop once the value is found
			}
		}
	}

}
