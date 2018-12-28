package test;

import java.io.IOException;

public class exceptionTest {

	public static void main(String[] args) {
		
		System.out.println("My First java");
		//System.out.println(5/0);
		String x = "Java";
		//x.concat(" SE 6 ");
		x.replace("6","7");
		System.out.println(x);
		
		try{
			System.out.println("its okay");
		}catch(StackOverflowError e){
			
		}catch(RuntimeException e){
			
		}
	
	}
	public void Mtest()throws IOException{
		System.out.println("its okay");
		throw new RuntimeException();
	
	}
}
