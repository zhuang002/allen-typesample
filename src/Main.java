import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intSample();
		//doubleSample();
		//booleanSample();
		//arraySample();
		//stringSample();
		//arrayListSample();
		//passByRefVal();
		//setSample();
		//hashMapSample();
		stackSample();
		
	}

	private static void stackSample() {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		stack.add("Peter");
		stack.add("David");
		stack.add("Alice");
		stack.add("Helen");
		
		System.out.println(stack);
		
		String top = stack.pop();
		System.out.println("poped:"+top + " stack:" +stack);
		
		top = stack.peek();
		System.out.println("poped:"+top + " stack:" +stack);
		
		
		
	}

	private static void hashMapSample() {
		// TODO Auto-generated method stub
		HashMap<String, Human> map = new HashMap<>();
		Human person1 = new Human("Peter", "Male", 12);
		Human person2 = new Human("Allen", "Male", 17);
		Human person3 = new Human("Helen", "Female", 18);
		Human person4 = new Human("David", "Male", 16);
		
		map.put(person1.name, person1);
		map.put(person2.name, person2);
		map.put(person3.name, person3);
		map.put(person4.name, person4);
		
		System.out.println(map.get("Peter"));
		System.out.println(map.get("Derek"));
		System.out.println(map.containsKey("Alice"));
		
		System.out.println("=================");
		for (String key:map.keySet()) {
			System.out.println(map.get(key));
		}
		
		
	}

	private static void setSample() {
		// TODO Auto-generated method stub
		HashSet<Integer> iSet = new HashSet<>();
		iSet.add(3);
		iSet.add(4);
		iSet.add(5);
		iSet.add(6);
		
		Set<Integer> iSet2 = new HashSet<>();
		iSet2.add(1);
		iSet2.add(2);
		iSet2.add(3);
		iSet2.add(4);
		
		System.out.println(iSet.contains(1));
		System.out.println(iSet.contains(3));
		
		System.out.println(iSet);
		iSet.remove(3);
		System.out.println(iSet);
		iSet.remove(3);
		System.out.println(iSet);
		iSet.add(3);
		iSet.add(3);
		System.out.println(iSet);
		
		iSet.addAll(iSet2);
		System.out.println(iSet);
		
		iSet.remove(1);
		iSet.remove(2);
		
		iSet.retainAll(iSet2);
		System.out.println(iSet);
		
		iSet.add(5);
		iSet.add(6);
		
		iSet.removeAll(iSet2);
		System.out.println(iSet);
		
	}

	private static void passByRefVal() {
		// TODO Auto-generated method stub
		MyClass cls = new MyClass(3,"abc");
		int a = 3;
		String s = "abc";
		
		changeValue(cls, a, s);
		System.out.println(cls.a + "," + cls.b +","+ a+","+s);
		
	}

	private static void changeValue(MyClass pCls, Integer pa, String ps) {
		// TODO Auto-generated method stub
		pCls.a = 100;
		pCls.b = "def";
		
		pa = 100;
		ps = "def";
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

class MyClass {
	public int a;
	public String b;
	public MyClass(int i,String s) {
		this.a = i;
		this.b = s;
	}
	
}

class Human {
	String name;
	String gender;
	int age;
	
	public Human(String n, String g, int a) {
		name = n;
		gender = g;
		age = a;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	
}
