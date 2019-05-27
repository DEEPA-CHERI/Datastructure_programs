// BubbleSort
import java.util.Scanner;
class BubbleSort{
	public static void bubbleSort(int elements[])
	{
		int size = elements.length;
		int flg=0;
		for(int j=size-1;j>0; j--)
		{
			for(int k=0; k<=j-1 ; k++)
			{
				if(elements[k]>elements[k+1])
				{
					flg=1;
					int temp = elements[k];
					elements[k] = elements[k+1];
					elements[k+1] = temp;
				}
			}
			if(flg==0)
			{
				System.out.println("elements are already  sorted");
				break;

			}

		}

		System.out.println("Printing sorted elements");
		for(int i=0;i<size;i++)
			System.out.print(elements[i]+" ");
		System.out.println();
		
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int elements[] = new int[size];

		for(int i = 0; i< size ; i++)
			elements[i] = scanner.nextInt();
		// calling Bubble-Sort function to sort the elements in the array
		bubbleSort(elements);

	}
}