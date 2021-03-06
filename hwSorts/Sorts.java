import java.util.*;

public class Sorts{
    public static void printArray(int[]data){
      String show="[ "+data[0];
      for(int i=1; i<data.length; i++){
         show+=", "+data[i];
      }
      show+="]";
      System.out.println(show);
      //print the array like:  [ 1, 2, 3, 4]
   }

   public static int getIndex(int[] data, int value){
      int i=1;
      if(value<data[0]){
         return 0;
      }
      /*for(; i<data.length;){
         while(value>data[i]){
            i+=1;
         }
      }*/
      while(value>data[i] && i<data.length && data[i]!=0){
         i+=1;
      }
      return i;
   }

   public static int[] add(int[] data, int value){
      int index= getIndex(data, value);
      int[] copy = new int[data.length];
      if(index==data.length){
         for(int i=0; i<data.length; i++){
            copy[i]=data[i];
         }
         copy[copy.length-1]=value;
      }
      for(int i=0; i<data.length; i++){
         if(i<index){
            copy[i]=data[i];
         }
         if(i==index){
            copy[i]=value;
         }
         if(i>index){
            copy[i]=data[i-1];
         }
      }
      return copy;
   }

    public static void insertionSort(int[]data){
	for(int index=1; index<data.length; index++){
	    int value=data[index];
	    int swapIndex =index;
	    while(swapIndex>0 && data[swapIndex-1]>value){
		data[swapIndex]=data[swapIndex-1];
		swapIndex--;
	    }
	    data[swapIndex]=value;
	    //printArray(data);
	}
    }
    
    public static void fillRandom(int[] data){
	for(int x=0; x<data.length; x++){
	    int pm = (int)Math.pow(-1,(int)Math.random()*2);
	    data[x]= pm*(int)(Math.random()*Integer.MAX_VALUE);
	}
    }


    public static void selectionSort(int[] data){
	for(int index=0; index<data.length; index++){
	    int next=data[index];
	    int storeValue=data[index];
	    int storeIndex=-1;
	    for(int searcher=index; searcher<data.length; searcher++){
		if(data[searcher]<=next){
		    next=data[searcher];
		    storeIndex=searcher;
		}
	    }
	    data[index]=next;
	    data[storeIndex]=storeValue;
	    //printArray(data);
	}
    }

    public static void bubbleSort(int[]data){
	for(int place=1; place<data.length; place++){
	    int index=1;
	    while(index+place<=data.length){
		int storeValue=data[index-1];
		if(data[index-1]>data[index]){
		    data[index-1]=data[index];
		    data[index]=storeValue;
		}
		index++;
	    }
	    //printArray(data);
	}
    }
}
