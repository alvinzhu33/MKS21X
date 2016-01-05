public class Driver{
    public static void main(String[]args){
	int[] i1= new int[]{6,2,7,1,2,6};
	int[] i2= new int[]{-12,6,2,6,73,174,23,8,2,-11,73,-111};

	Sorts.selectionSort(i1);
	Sorts.printArray(i1);
	Sorts.selectionSort(i2);
	Sorts.printArray(i2);
    }
}
