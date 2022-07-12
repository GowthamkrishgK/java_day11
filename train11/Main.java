package train11;

import java.util.function.BiFunction;
interface f{
	public Integer add(int a,int b);
}
interface g{
	public Integer add1(int a,int b);
}

public class Main {
public static Integer method1(Integer a,Integer b) {
	int n=a*b;
	n=n-b;
	
	return n;
}
public  Integer method2(Integer a,Integer b) {
	int n=a*b;
	n=n-b;
	
	return n;
}
public static void main(String[] args) {

	BiFunction<Integer, Integer, Integer> ar=Main::method1;
	int res=ar.apply(2,3);
	System.out.println(res);
	f obj=Main::method1;
	g obj1=new Main()::method2;
	System.out.println(obj.add(2,3));
	
	System.out.println(obj1.add1(4,5));
}
}
