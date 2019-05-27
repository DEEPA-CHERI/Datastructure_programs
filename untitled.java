// QuickSort
import java.util.Scanner;
class QuickSort
{

	public static void quickSort(int elements[],int low , int high)
	{
		int pivot = Partition(elements,low,high)
		quicksort(elements,low,pivot-1);
		quicksort(elements,pivot+1,high);
	}
	public static int Partition(int elements[],int start, int end)
	{
		int pivotItem = elements[end],index=start;

		for(int i=start; i<end; i++)
		{
			if(elements[i]<=pivotItem)
			{
				int temp = elements[i];
				elements[i] = elements[index];
				elements[index++] = temp;
				
			}

		}
        int temp = elements[end];
        elements[end] = elements[index];
        elements[index++] = temp;

        return index;
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int elements[] = new int[size];

		for(int i=0;i<size;i++)
			elements[i] = scanner.nextInt();

		quickSort(elements,0,size-1);

		System.out.println("Sorted elements");

		for(int i=0; i<size; i++)
			System.out.print(elements[i]);

	}
}