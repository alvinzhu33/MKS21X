import java.util.*;

public class Driver{
    public static void main(String[]args){
	int[] tester= new int[10];
	Random ran = new Random(1);
	for(int x=0; x<tester.length; x++){
	    tester[x]=ran.nextInt()%100;
	}
	int[] tester2= new int[10];
	/*for(int x=0; x<tester.length; x++){
	    tester2[x]=tester[x];
	    }*/

	Sorts.printArray(tester);
	//Sorts.selectionSort(tester);
	//Sorts.insertionSort(tester2);
	Sorts.bubbleSort(tester);
	Sorts.printArray(tester);

	int[] i1= new int[]{-12,6,2,6,73,174,23,8,2,-11,73,-111};
	Sorts.printArray(i1);
	//Sorts.selectionSort(i1);
	Sorts.bubbleSort(i1);
	Sorts.printArray(i1);
    }
}
