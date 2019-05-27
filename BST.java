//Binary Search Tree
class Tnode
{
	int data;
	Tnode Left;
    Tnode Right;

	public Tnode( int data)
	{
		this.data = data ;
		this.Left = null;
		this.Right = null;
	}
}
class BST
{

	private  static Tnode root = null;
	public static void insertIntoTree(int data)
	{
		Tnode newnode = new Tnode(data);

		if(root==null)
		{
			root = newnode;
		}
		else
		{
			Tnode temp = root,prev=null;
			while(temp!=null)
			{
				prev = temp;
				if(temp.data>newnode.data)
					temp=temp.Left;	
				else
				    temp =temp.Right;
			}
			if(prev.data>data)
				prev.Left = newnode;
			else
				prev.Right = newnode;

		}

	}
	public static boolean binarySearch(Tnode root,int data)
	{
		if(root==null)
			return false;
		else if(root.data==data)
			return true;
		else if(root.data>data)
			return binarySearch(root.Left,data);
		else
			return binarySearch(root.Right,data);

	}
	public static void printTree(Tnode root)
	{
		if(root!=null)
		{
			printTree(root.Left);
			System.out.print(root.data+" ");
			printTree(root.Right);
		}

	}
	public static void main(String args[])
	{

		int elements[] = {7,5,34,565,232,9,0,342,31,1411};

		for(int i=0;i<elements.length;i++)
			insertIntoTree(elements[i]);
		printTree(root);
		System.out.println();
		if(binarySearch(root,232))
			System.out.println("232 is Present in the Tree");
		else
			System.out.println("232 is not present in the Tree");
		if(binarySearch(root,99))
			System.out.println("99 is Present in the Tree");
		else
			System.out.println("99 is not Present in the Tree");


	}
}