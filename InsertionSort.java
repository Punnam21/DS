/**
 * 
 */
package test;

/**
 * @author punna
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {10,5,8,4,7,6,45,10,1}; 
		int [] tempA = sorted(a);
		for(int x: tempA){
			System.out.println(x +":");
		}
	}
	
	public static int[] sorted(int[] a){
		int tempA[] = new int[a.length];
		tempA[0] = a[0];
		int temp =0, k;
		for(int i=1;i<a.length;i++){
			k=i; temp = a[i];
			if(temp > tempA[k-1]){
				tempA[k] = temp;				
			}else
			while(k > 0 && temp < tempA[k-1] ){
				
					tempA[k] = tempA[k-1];
					tempA[k-1] = temp; k--;
					
				}
				
			
		}
		return tempA;
	}

}
