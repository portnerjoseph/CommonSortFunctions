
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectionSort {
private Double[] arr;
public SelectionSort(Double[] arr)
{
	this.arr=arr;
}
public SelectionSort(double[] arr)
{
	this.arr=new Double[arr.length];
	for(int x=0;x<arr.length;x++)
		this.arr[x]=new Double(arr[x]);
}

public void sortArray()
{
	List<Double> list= Arrays.asList(arr);
	for(int x=0;x<list.size()-1;x++)
	{
		Double temp=list.get(x);
		int index=list.lastIndexOf(Collections.min(list.subList(x,list.size())));
		list.set(x, list.get(index));
		list.set(index, temp);
	}
}
public Runnable sortRunnable (){
    return new Runnable(){
       public void run(){
        sortArray();
       }
    };
}
public Double[] getArr() {
	return arr;
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
