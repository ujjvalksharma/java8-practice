
interface Calculator1{
	public void switchOn(); //cannot be static
}

interface Calculator2{
	public int add(int a, int b); //cannot be static
}

interface Calculator3 extends Runnable{
	
}
public class CalculatorImpl {
	
	public static void main(String[] args) {
		
		Calculator1 calLamda1=()->System.out.println("calculator is On");
		
		calLamda1.switchOn();
		int a1=1;
		int b1=2;
//Calculator2 calLamda2=(a1,b)->a1+b; //complie error: incorrect we can assign value to lamda function
Calculator2 calLamda2=(a,b)->a+b; // we need to give defination to lamda function

System.out.println("add: "+calLamda2.add(a1,b1));

Calculator3 calLamda3=()->System.out.print("off");
calLamda3.run();
	}

}
