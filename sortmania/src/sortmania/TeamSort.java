package sortmania;

public class TeamSort {
	public static void main(String[] args, String one)
	{
		/*String[] test4= {"one", "two", "four", "six", "zero","asaprocky","jcole","uzi","xxxtentacion", "yatchy"};
		bubbleSort(test4);
		for(String x: test4)
		{
			System.out.print("["+ x +"]");
		}
		*/
		String[] test4= {"one", "two", "four", "six", "zero","asaprocky","jcole","uzi","xxxtentacion", "yatchy"};
		containsString(test4,"one");
		for(String x: test4)
		{
			System.out.print("["+ x +"]");
		}
	}
	
	
//	public static int challengeOne(int[] arr)
	{
		
	}
//	public static int challengeTwo(string[]arr)
	{
		
	}
	public static  int containsString(String[]list1, String Value)
	{
		for(int i=0; i<list1.length; i++)
		{
			if(list1[i]==Value)
				return i;
		}
		return -1;
		
    }
	public static void bubbleSort(String[] list1)
	{
		boolean swapZero = false;
		while(!swapZero)
		{
			int numSwap=0;
			for(int i=0; i<list1.length-1; i++)
			{
				
				if((list1[i].compareToIgnoreCase(list1[i+1]))>0)
				{
					String dummy= list1[i];
					list1[i]=list1[i+1];
					list1[i+1]=dummy;
					numSwap++;
					
				}
			}
			if(numSwap==0)
			{
				swapZero=true;
			}
		}
	}
}
