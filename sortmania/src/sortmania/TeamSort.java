package sortmania;

public class TeamSort {
	public static void main(String[] args)
	{
		/*String[] test4= {"one", "two", "four", "six", "zero","asaprocky","jcole","uzi","xxxtentacion", "yatchy"};
		bubbleSort(test4);
		for(String x: test4)
		{
			System.out.print("["+ x +"]");
		}
		*/
		/*
		String[] test4= {"one", "two", "four", "six", "zero","asaprocky","jcole","uzi","xxxtentacion", "yatchy"};
		containsString(test4,"one");
		for(String x: test4)
		{
			System.out.print("["+ x +"]");
		}
		*/
		int[] testThree = new int[10000];
		for (int i=0; i<testThree.length; i++)
		{
			testThree[i] = (int) Math.floor(Math.random()*10001);
		}
		double test = challengeThree(testThree);
		for(int x: testThree)
		{
			System.out.print("["+x+"]");
		}
		System.out.println();
		System.out.println(test);
	}
	
	
//	public static int challengeOne(int[] arr)
	{
		
	}
//	public static int challengeTwo(string[]arr,string query)
	{
		
	}
	
	public static double challengeThree(int[] arr)
	{
		bubbleSort(arr);
		return findMedian(arr);
	}
	
	public static double findMedian(int[] arr)
	{
		if (arr.length % 2==0)
		{
			return ((arr[arr.length/2])+(arr[(arr.length/2)-1]))/2;
		}
		return arr[(arr.length-1)/2];
	}
	public static  int containsString(String[]list1, String Value)
	{
		for(int i=0; i<list1.length; i++)
		{
			if(list1[i]==Value)
				return i;
		}
		return -1;
		//jk;lkj
    }
	
	public static void bubbleSort(int[] list1)
	{
		boolean swapZero = false;
		while(!swapZero)
		{
			int numSwap=0;
			for(int i=0; i<list1.length-1; i++)
			{
				
				if(list1[i]>list1[i+1])
				{
					int dummy= list1[i];
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
