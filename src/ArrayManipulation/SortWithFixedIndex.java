package ArrayManipulation;


import java.awt.List;
import java.util.ArrayList;

// 4.Write a program for the below
// I/P:Arraylist[] arraylist={1,8,5,12,9,2}
// O/P: 1 should be placed at first value and the other numbers should be sorted as a descending order?

public class SortWithFixedIndex {
	public void sortArray(ArrayList<Integer> arraylist){
		for (int i = 1; i < arraylist.size(); i++) {

	          for (int j = arraylist.size() - 1; j > i; j--) {
	              if (arraylist.get(i) < arraylist.get(j)) {

	                  int tmp = arraylist.get(i);
	                  arraylist.set(i,arraylist.get(j)) ;
	                  arraylist.set(j,tmp);
	              }

	          }

	      }
		System.out.println(arraylist);
		System.out.println("Hello sanjay");
		
		
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(8);
		arr.add(5);
		arr.add(12);
		arr.add(9);
		arr.add(2);
		SortWithFixedIndex obj = new SortWithFixedIndex();
		obj.sortArray(arr);
	}
}
