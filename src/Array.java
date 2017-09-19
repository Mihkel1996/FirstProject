	import java.util.Arrays;

	public class Array {

		public static void main(String[] args) {
		// Massiivid, mõlemas on kolm elementi (arvu).
		// Proovi muuta koodi, ise midagi testida, proovida teha.
		int[] arrayFirst = { 1, 2, 3 };
		int[] arraySecond = { 3, 2, 1 };

		// Prindib konsooli välja need meetodid allpool.
		System.out.println(firstLast6(arrayFirst));
		System.out.println(commonEnd(arrayFirst, arraySecond));
		System.out.println(Arrays.toString(reverse3(arrayFirst)));
				}

		// Kontrollib kas masiivis on esimene või viimane element (arv) number 6.
		// Kui üks või mõlemad neist on, tagastab 'true', kui mitte, tagastab
		// 'false'.
		public static boolean firstLast6(int[] nums) {
		// Faster solution - return nums[0] == 6 || nums[nums.length - 1] == 6;
		if (nums[0] == 6) {
			return true;
					}

		if (nums[nums.length - 1] == 6) {
			return true;
					}
		return false;
				}

	// Kontrollib kas kahe erineva massiivi elementite algused või lõpud on
	// samasugused.
	public static boolean commonEnd(int[] a, int[] b) {
		int sameStartA = a[0];
		int sameStartB = b[0];

		int sameEndA = a[a.length - 1];
		int sameEndB = b[b.length - 1];

		return sameStartA == sameStartB || sameEndA == sameEndB;
				}

	// Keerab massiivi tagurpidi, ehk siis { 3, 2, 1 } prinditakse välja { 1, 2,
	// 3 }.
	public static int[] reverse3(int[] nums) {
		int[] endresult = new int[nums.length];
		int arrayLength = nums.length - 1;
		for (int i = 0; i < endresult.length; i++) {
			endresult[i] = nums[arrayLength - i];
					}
		return endresult;
				}
	//Võtab massiivi null elemendi (esimene arv) ning esimese elemendi (teine arv) ning liidab nad kokku.
	public static int sum2elements(int[] nums) {
		int sum = nums[0] + nums[1];
		return sum;
				}

	}

