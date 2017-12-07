package sortmania;

public class Team10SortCompetition {
	public static void main(String[] args)
	{
		/*String[] test4= {"one", "two", "four", "six", "zero","asaprocky","jcole","uzi","xxxtentacion", "yatchy"};
		bubbleSort(test4);
		for(String x: test4)
		{
			 System.out.print("["+ x +"]");
		}
		System.out.println("-------------");
		String[] test5= {"one", "two", "four", "six", "zero","asaprocky","jcole","uzi","xxxtentacion", "yatchy"};
		System.out.println("-------------");
		int test6 = containsString(test5, "jeff");
		System.out.println(test6);
		for(String x: test5)
		{
			System.out.print("["+ x +"]");
		}

		*/
		//CHALLENGE ONE
		int[] testOne = new int[10000];
		for (int i=0; i<testOne.length; i++)
		{
			testOne[i] = (int) Math.floor(Math.random()*10001);
		}
		long startTimeOne = System.nanoTime();
		double medianOne = challengeOne(testOne);
		long endTimeOne = System.nanoTime();
		long timeOne = endTimeOne-startTimeOne;
		for (int x : testOne)
		{
			System.out.print("["+x+"]");
		}
		System.out.println();
		System.out.println("Time in nanoseconds: "+timeOne);
		System.out.println("Median is "+medianOne);
		
		//CHALLENGE THREE
		int[] testThree = new int[10000];
		for (int i=0; i<testThree.length; i++)
		{
			testThree[i] = (int) Math.floor(Math.random()*10001);
		}
		long startTimeThree = System.nanoTime();
		double medianThree = challengeThree(testThree);
		long endTimeThree = System.nanoTime();
		long timeThree = endTimeThree-startTimeThree;
		for(int x: testThree)
		{
			System.out.print("["+x+"]");
		}
		System.out.println();
		System.out.println("Time in nanoseconds: "+timeThree);
		System.out.println("Median is "+medianThree);

	}
	
	public static double challengeOne(int[] arr)
	{
		insertionSort(arr);
		return findMedian(arr);
	}
	
	public static double challengeThree(int[] arr)
	{
		bubbleSort(arr);
		return findMedian(arr);
	}

	/*
	 * Find Median
	 * Finds the median of an array of integers.
	 * @param int[] arr
	 * @return double
	 */
	public static double findMedian(int[] arr)
	{
		if (arr.length % 2==0)
		{
			return (arr[arr.length/2]+arr[(arr.length/2)-1])/2;
		}
		return arr[(arr.length-1)/2];
	}
	
	/*
	 * Bubble Sort (integers)
	 * Sorts an array of integers by swapping adjacent numbers when needed until there is no more
	 * swaps needed.
	 * @param int[] list1
	 * @return void
	 */
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

	
	/*
	 * Insertion Sort 
	 * Sorts an array of integers by taking each element from the array and adding it to the front of the array
	 * in the correct order.
	 * @param int[] list1
	 * @return void
	 */
	public static void insertionSort(int[] list1)
	{
		for (int i=0; i<list1.length-1; i++)
		{
				if (list1[i+1]<list1[i])
				{
					boolean foundPlace= false;
					int j = i;
					while(!foundPlace)
					{
						if(j==-1)
						{
							foundPlace=true;
						}

						else if(list1[j]<list1[i+1])
						{
							foundPlace=true;
						}

						else
						{
							j--;
						}
					}
					
					int dummy= list1[i+1];
					moveOver(list1, j+1,i+1);
					list1[j+1]= dummy;
				}
			}
	}

	/*
	 * Move Over function
	 * Moves each item in the array over one position in the given interval.
	 * @param int[] array
	 * @param int x starting position of interval inclusive
	 * @param int y ending position of interval inclusive
	 * @return void
	 */
	public static void moveOver(int[]array, int x, int z)
	{
		int nextNum= array[x];
		for(int y=x; y<z; y++)
		{
			int dummy = array[y+1];
			array[y+1]= nextNum;
			nextNum = dummy;
		}
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
