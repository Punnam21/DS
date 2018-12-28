package test;
/*
 * find the smallest of the array and replace the the first element with it.
 * repeat this for entire array
 * 
 * 
 * */
public class SelectionSort {

	public static void main(String[] args){
	int a[] = {10,2,9,8,12,5,1};
	
	for(int i=0;i< a.length-1;i++){
		int temp = a[i], k = i;
		//System.out.println("a["+i+"]" + a[i]);
		for(int j =i ;j<a.length-1;j++){
		if(temp > a[j+1] ){
		
			temp = a[j+1]; k=j+1;
			//System.out.println("temp["+(j+1)+"]" + a[j+1]);
		}
			
		}
		if(k !=i	){
		a[k] = a[i];
		a[i] = temp;
		}
	}
	
	for(int l: a){
		System.out.println(l);
	}
	
	}
			
}
