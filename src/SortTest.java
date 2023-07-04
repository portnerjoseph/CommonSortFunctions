import java.util.Arrays;
import java.util.stream.IntStream;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] small=Arrays.stream(genRandArr(1000, 1, 1000000)).asDoubleStream().toArray();
	     double[] medium=Arrays.stream(genRandArr(10000, 1, 1000000)).asDoubleStream().toArray();
	     double[] large=Arrays.stream(genRandArr(100000, 1, 1000000)).asDoubleStream().toArray();
     SelectionSort seltest=new SelectionSort(small);
     SelectionSort quicktest=new SelectionSort(small);
     System.out.printf(String.format("%s %30s %20s %20s", "SORT","Time for 1000 #","Time for 10000 #","Time for 100000 #\n"));
     System.out.printf(String.format("%s","Selection Sort"));
     System.out.printf(String.format("%20d",getInsertTime(seltest.sortRunnable())));
     seltest.setArr(medium);
     System.out.printf(String.format("%20d",getInsertTime(seltest.sortRunnable())));
     seltest.setArr(large);
     System.out.printf(String.format("%20d\n",getInsertTime(seltest.sortRunnable())));
     //////
     System.out.printf(String.format("%s","Quick Sort"));
     System.out.printf(String.format("%20d",getInsertTime(quicktest.sortRunnable())));
     quicktest.setArr(medium);
     System.out.printf(String.format("%20d",getInsertTime(quicktest.sortRunnable())));
     quicktest.setArr(large);
     System.out.printf(String.format("%20d\n",getInsertTime(quicktest.sortRunnable())));
     

 
	}
     public static long getInsertTime(Runnable obj) //need another method for other sort
     { //needs to go in runner
     		long startTime=System.currentTimeMillis();
     		obj.run();
     		long stopTime=System.currentTimeMillis();
     		return (stopTime-startTime);
     		
     	}
     
	
	public static int[] genRandArr(int size,int randStart,int randEnd)
	{
		int[] arr=new int[size];
		for(int x=0;x<arr.length;x++)
			arr[x]=(int) ((Math.random()*(randEnd-randStart))+randStart);
		return arr;
	}

}
