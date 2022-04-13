package seleniumConcepts;

public class Demo1 {

	public static void main(String [] args) {
		
		String name= "Vishal Ghule";
		
		String[] name1 = name.split(" ");

		for(int i=name1.length-1;i>=0;i--) {
			System.out.print(name1[i]);
			System.out.print(" ");
		}
	}
	
}
