package J20190122;

public class Variable_test {
	public static void main(String args[]) {
		char c = 'a';
		System.out.println("C = " +c);
		//System.out.printf("C = %d",  c);
		double d = 10.123;
		System.out.println("D = " +d);
		String s = "HELLO WORLD";
		System.out.println("S = " +s);
		
		
		//casting
		
		byte b = 10;
		int i = b;
		System.out.println("B = " +b);
		System.out.println("I = " +i);
		
		int iVar = 1234;
		byte bVar = (byte)iVar;
		System.out.println("B = " +bVar);
		System.out.println("I = " +iVar);
	}
}
