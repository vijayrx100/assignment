	package assignment2;

public class Fibonnaciseries {

	public static void main(String[] args) {
	int range=8;		
	int fristNum=0;
	int secondNum=1;
	int sum;
	for(int i=1;i<=range;i++) {
		System.out.print(fristNum+",");
		sum=fristNum+secondNum;
		secondNum=fristNum;
		fristNum=sum;
		
	}
	}
	
}