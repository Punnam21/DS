/**
 * 
 */
package test;

/**
 * @author punna
 *
 */
public class SearchSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {10,5,8,4,7,6,45,1};
		int temp = 1, j=0;
		int[] tempA = InsertionSort.sorted(a);
		for(int i:tempA)
		System.out.print(i+":");
		int minIndex = 0, MaxIndex = tempA.length , currentIndex=0;
		
		while (j <= 3 ){
		currentIndex = (minIndex + MaxIndex)/2;
		System.out.println("");
		System.out.println(currentIndex);
		if(tempA[currentIndex] == temp){
			System.out.println("");
			System.out.println("found");
			break;
		}else if(tempA [currentIndex] < temp){
			minIndex = currentIndex;
		}else{
			MaxIndex = currentIndex;
		}
		j++;
		}
		
	}

}
