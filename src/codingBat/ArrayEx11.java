package codingBat;

public class ArrayEx11 {

	public static void main(String[] args) {
				ArrayEx11 ae = new ArrayEx11();
				int[] Array = { 1, 2, 6};
				System.out.println(ae.firstLast6(Array));

			}
			
			public boolean firstLast6(int[] nums) {
				//TODO minu kood käib siia.
			{	return (nums[0] == 6 || nums[nums.length-1] == 6);	}
				
			}


	}

