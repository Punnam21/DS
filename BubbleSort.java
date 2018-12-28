/**
 * 
 */
package test;

/**
 * @author punna
 *Ex:10,5,8,4,7,6

Bubble sort will compare two adjacent values and replace right one with greater value.

Algorithm:

Step1: compare adjacent values.
step2: if right values is greater go to step 1, if left values go to step 3.
step3: copy right value in to temp variable, left value in place of right value and assign temp variable value to left.
step4: repeat this process from step 1 to step3 till given array is sorted.

for (int i=0; i< Barray.length-1; i++){

for (int j=0; j< Barray.length-2; j++){

if(Barry[j] > Barry[j+1]){

temp = Barry[j];

Barry[j+1]= Barry[j] ; 

Barry[j]  = temp;

}
}
}

 */
public class BubbleSort {	
	
	public static void main (String[] arg){
		int[] Barray = {10,5,8,4,7,6,45,10,1}; 
		int temp = 0;
		for (int i=0; i< Barray.length-1; i++){

			for (int j=0; j<= Barray.length-2; j++){

			if(Barray[j] > Barray[j+1]){

			temp = Barray[j+1];

			Barray[j+1]= Barray[j] ; 

			Barray[j]  = temp;

			}
			//}
		}
		//System.out.println("Result:" +Barray.toString());
		}
		for (int k : Barray) {
			System.out.println(k+" ");
		}
}
}