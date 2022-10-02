import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intSample();
		//doubleSample();
		//booleanSample();
		//arraySample();
		//stringSample();
		arrayListSample();
	}

	private static void arrayListSample() {
		// TODO Auto-generated method stub
		int[] ari = new int[100];
		int[] ari2 = {1,2,3,4,5};
		System.out.println(ari.length);
		
		ArrayList<Integer> ali = new ArrayList<>();
		ali.add(1);
		ali.add(2);
		ali.add(3);
		
		
		for (int i=0;i<ali.size();i++) {
			System.out.print(ali.get(i)+ " ");
		}
		System.out.println();
		
		ali.remove(1);
		//arraylist and arrys are iterable
		for (int ele:ali) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("a");
		al.add(true);
		
		for (Object ele:al) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		System.out.println(al.contains(1));
		System.out.println(al.contains(2));
		
		al.remove("a");
		for (Object ele:al) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		al.add(1,"b");
		al.add(1,"c");
		al.add("b");
		for (Object ele:al) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		System.out.println(al.indexOf("b"));
		System.out.println(al.lastIndexOf("b"));
		
		String s = "adfasfdaj;jkk;fa";
		int idx = s.indexOf("fa");
		while (idx>=0) {
			System.out.print(idx+",");
			idx = s.indexOf("fa", idx+1);
		}
		System.out.println();
		
		al.remove("b");
		for (Object ele:al) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		
		ali.clear();
		ali.add(8);
		ali.add(7);
		ali.add(15);
		ali.add(11);
		
		for (int ele:ali) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		Collections.sort(ali);
		for (int ele:ali) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		ArrayList<String> als = new ArrayList<>();
		als.add("abc");
		als.add("123");
		als.add("ABC");
		als.add("bbb");
		for (String ele:als) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		Collections.sort(als, Collections.reverseOrder());
		for (String ele:als) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		Collections.reverse(als);
		for (String ele:als) {
			System.out.print(ele+" ");
		}
		System.out.println();
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
		
		/*
		 *  int -- Integer
		 *  char -- Character
		 *  double -- Double
		 *  boolean -- Boolean
		 */
		
		int i = Integer.parseInt("123");
		double d = Double.parseDouble("3.5");
		boolean b = Boolean.parseBoolean("true");
		
		
		
		
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
