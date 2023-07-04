import java.util.Arrays;
import java.util.List;

public class QuickSort {
	
	
	private Double[] arr;
	public QuickSort(Double[] arr)
	{
		this.arr=arr;
	}
	public QuickSort(double[] arr)
	{
		this.arr=new Double[arr.length];
		for(int x=0;x<arr.length;x++)
			this.arr[x]=new Double(arr[x]);
	}
	public Runnable sortRunnable (){
	    return new Runnable(){
	       public void run(){
	        sortArray();
	       }
	    };
	}
	
	public void sortArray()
	{
		List<Double> list=Arrays.asList(arr);
		quickSort(list);
	}
	public void quickSort(List<Double> list)
	{
		if(list.size()>1)
		{
		Double pivot=list.get(0);
		int left=1;
		int right=list.size()-1;
		while (right>left)
		{
			while(list.get(left)<pivot)
				left++;
		
			
			while(list.get(right)>pivot)
				right--;
			
			if(right>left)
				swapListEl(list,left,right);
			
				right--;
				left++;	
			
		}
		if(list.get(left)<pivot)
			swapListEl(list,left,0);
			
		quickSort(list.subList(0, left));
		quickSort(list.subList(right,list.size()));
		}
	}
	public void swapListEl(List<Double> list, int i1,int i2)
	{
		Double temp=list.get(i1);
		list.set(i1, list.get(i2));
		list.set(i2, temp);
	}
	public void setArr(Double[] arr) {
		this.arr = arr;
	}
	public void setArr(double[] arr) {
		this.arr=new Double[arr.length];
		for(int x=0;x<arr.length;x++)
			this.arr[x]=new Double(arr[x]);
	}
	@Override
	public String toString() {
		String out="";
		for(int x=0;x<arr.length;x++)
			out+=x%10==9?arr[x]+", \n":arr[x]+", ";
		return out;
	}
}
