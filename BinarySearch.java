//Binary Search Tree
import java.util
class Tnode
{
	int data;
	class Tnode Left;
	class Tnode Right;

	public Tnode(data)
	{
		this.data = data ;
		this.Left = null;
		this.Right = null;
	}
}
class BST
{

	private class Tnode root=null;
	public static void insertIntoTree(int data)
	{
		class Tnode newnode = new Tnode(data);

		if(root==null)
		{
			root = newnode;
		}
		else
		{
			class Tnode temp = root,prev=null;
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
	public static void print_Tree(class Tnode root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			print_Tree(root.Left);
			print_Tree(root.Right);
		}

	}
	public static void main(String args[])
	{

		int elements[] = [7,5,34,565,232,9,0,342,31,1411];

		for(int i=0;i<elements.length;i++)
			insertIntoTree(elements[i]);
		print_Tree(root);
	}
}