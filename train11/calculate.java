package train11;


import java.util.HashMap;
import java.util.Scanner;
class Marks{
	 Integer physics;
	   Integer chemistry;
	   Integer maths;
	   Integer english;
	public Marks(Integer physics, Integer chemistry, Integer maths, Integer english) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
		this.english = english;
	}
	   
}
public class calculate {
	public static void marks(HashMap<String,Marks> arr,String name) {
		Marks m;
		m=arr.get(name);
		Integer marks=marks(m.chemistry, m.english, m.maths, m.physics);
	int p=percentage(m.chemistry, m.english, m.maths, m.physics);
	System.out.println("Total Marks Obtained by "+name+" is"+marks);
	System.out.println("Percentage Obtained by "+name+" is"+p);
	
		if(p==100)
			System.out.println(name +" Obtained O grade");
		if(p>90 && p<100) 
			System.out.println(name +" Obtained A grade");
		if(p>40 && p<90)
			System.out.println(name +" Obtained B grade");
		if(p<40)
			System.out.println(name +" Failed");
	}
	
	public static int percentage(Integer chem,Integer math,Integer english,Integer phy) {
		int marks=chem+math+english+phy;
		int p=(marks/4);
		
	
		return p;
	}
	public static void checkInput(int mark) throws InputException{
		String e=mark+"";
		if(mark>100) {
			throw new InputException(e);
		}if(mark<0) {
			throw new InputException(e);
		}
	}
	public static Integer marks(Integer chem,Integer math,Integer english,Integer phy) {
		return (chem+math+english+phy);
	}
public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Name of person ");
	   String name=sc.next();
	   try {
	   System.out.println("Enter MArks inPhysics ");
	   Integer physics=Integer.valueOf(sc.nextInt());
	   checkInput(physics);
	   System.out.println("Enter MArks in Chemistry ");
	   Integer chemistry=Integer.valueOf(sc.nextInt());
	   checkInput(chemistry);
	   System.out.println("Enter MArks in Maths ");
	   Integer maths=Integer.valueOf(sc.nextInt());
	   checkInput(maths);
	   System.out.println("Enter MArks in English ");
	   Integer english =Integer.valueOf(sc.nextInt());
	   checkInput(english);
	   
	
	  
	          Marks m=new Marks(physics, chemistry, maths, english);
	          HashMap<String,Marks> hm=new HashMap<>();
	          hm.put(name, m);
	          marks(hm,name);
	          
	   }catch(Exception e) {
		   System.out.println("please Input Integer"+e);
	   }         
}
}
