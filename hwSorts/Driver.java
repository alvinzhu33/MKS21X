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
    }
}
