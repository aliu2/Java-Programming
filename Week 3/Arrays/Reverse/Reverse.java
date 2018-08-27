public class Reverse
{
	public static int[] reverseArray(int[] arr)
	{
		int tmp;
		for (int i = 0; i < arr.length/2; i++)
		{
			tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
		}
		return arr;
	}
}
