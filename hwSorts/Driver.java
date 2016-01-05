import java.util.*;

public class Driver{
    public static void main(String[]args){
	int[] tester= new int[1000];
	Random ran = new Random(1);
	for(int x=0; x<tester.length; x++){
	    tester[x]=ran.nextInt();
	}

	Sorts.printArray(tester);
	Sorts.selectionSort(tester);
	Sorts.insertionSort(tester);
	Arrays.sort(tester);
	Sorts.printArray(tester);

	int[] i1= new int[]{-12,6,2,6,73,174,23,8,2,-11,73,-111};
	Sorts.printArray(i1);
	Sorts.selectionSort(i1);
	Sorts.insertionSort(i1);
	Arrays.sort(i1);
	Sorts.printArray(i1);
    }
}
