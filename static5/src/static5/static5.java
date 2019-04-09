package static5;
//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/203660?start=405
class thing{
	public String name;
	public static String car;
//sign variable and put the number with final = 15
	public static final int number = 15;

public void show(){System.out.println(name);}
public static int count = 0;
public thing(){count++;}
	

}

public class static5 {
	public static void main(String[] args) {
System.out.println("count befor the object: " + thing.count);	
		thing thing1 = new thing();
		thing thing2 = new thing();
System.out.println("count after object: "+ thing.count);		
		
		thing1.name = "bob";
		thing2.name = "sue";
		System.out.println(thing1.name);
		System.out.println(thing2.name);
//access to public static car		
		thing.car ="i am static String car diffrenet access";
		System.out.println(thing.car);
// access public void show
		thing1.show();
		thing2.show();
//example for use static		
		System.out.println(Math.PI);
		System.out.println("the variable number : " + thing.number);
	}

}
