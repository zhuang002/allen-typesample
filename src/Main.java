import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intSample();
		//doubleSample();
		//booleanSample();
		//arraySample();
		stringSample();
		//arrayListSample();*/
	}

	private static void stringSample() {
		// TODO Auto-generated method stub
		String s = "asdf;dsajf;asdfjsad;fjas";
		
		// split method
		String[] sar1 = s.split(";");
		for (String ele:sar1) {
			System.out.print(ele+" ");
		}
		System.out.println();
		sar1 = s.split("sa");
		for (String ele:sar1) {
			System.out.print(ele+" ");
		}
		System.out.println();
		sar1 = s.split("");
		for (String ele:sar1) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		// iterate characters.
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			System.out.print(c+" ");
		}
		System.out.println();
		
		int index = s.indexOf("sa");
		System.out.println("the first occurance of 'sa' is at "+index);
		
		index = s.indexOf("sa", index+2); 
		System.out.println("the second occurance of 'sa' is at "+index);
		
		index = s.lastIndexOf("sa");
		System.out.println("the last occurance of 'sa' is at "+index);
		
	}

	private static void arraySample() {
		// TODO Auto-generated method stub
		int[] ar = new int[10];
		
		for (int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		for (int i=0; i<ar.length;i++) {
			ar[i] = i*5;
		}
		for (int element:ar) {
			System.out.print(element+" ");
		}
		System.out.println();
		
	}
	
	
	

	private static void booleanSample() {
		// TODO Auto-generated method stub
		boolean a = sc.nextBoolean();
		boolean b = sc.nextBoolean();
		
		System.out.println("a && b="+(a && b));
		System.out.println("a || b="+(a || b));
		System.out.println("!a="+(!a));
		System.out.println("!b="+(!b));
		
		//logic operation
		System.out.print("Please input i and j:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("i>j="+(i>j));
		System.out.println("i<j="+(i<j));
		System.out.println("i==j="+(i==j));
		System.out.println("i<=j="+(i<=j));
		System.out.println("i>=j="+(i>=j));
		a = i<=j;
		b = i == j;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a && b="+(a && b));
		System.out.println("a || b="+(a || b));
		System.out.println("!a="+(!a));
		System.out.println("!b="+(!b));
		
		
	}

	private static void doubleSample() {
		// TODO Auto-generated method stub
		System.out.print("Please input a:");
		double a = sc.nextDouble();
		System.out.print("Please input b:");
		double b = sc.nextDouble();
		// general operations
		System.out.println("a+b="+(a+b));
		System.out.println("a*b="+(a*b));
		System.out.println("a-b="+(a-b));
		System.out.println("a/b="+(a/b));

		
		
	}

	private static void intSample() {
		// TODO Auto-generated method stub
		System.out.print("Please input a:");
		long a = sc.nextLong();
		System.out.print("Please input b:");
		long b = sc.nextLong();
		// general operations
		System.out.println("a+b="+(a+b));
		System.out.println("a*b="+(a*b));
		System.out.println("a-b="+(a-b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		// shift operations
		System.out.println("a>>b="+(a>>b));
		System.out.println("a<<b="+(a<<b));
		
		//bitwise operation
		System.out.println("a&b="+(a&b));
		System.out.println("a|b="+(a|b));
		System.out.println("a^b="+(a^b));
		
	}

}
