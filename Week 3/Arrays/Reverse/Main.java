public class Main
{
	public static void main(String[] args)
	{
		int[] nums = {2, 3, 5, 7, 11, 13, 17};
		int[] reverseNums = Reverse.reverseArray(nums);

		System.out.print("The numbers reverse are:");
		for (int i: reverseNums)
		{
			System.out.printf(" %d", i);
		}

		System.out.println();
	}
}
