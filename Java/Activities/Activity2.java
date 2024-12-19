
public class Activity2 {
	public static void main(String[] args) {
		int[] numbers= {10, 77, 10, 54, -11, 10};
		
		boolean result = isSumOfTensEqualToThirty(numbers);

        System.out.println(result);
	}
	
	public static boolean isSumOfTensEqualToThirty(int[] arr) {
		 int sum = 0;

	           for (int num : arr) {
	           
	            if (num == 10) {
	                sum += num;
	            	}

	        	}
	        return sum == 30;
	}
}