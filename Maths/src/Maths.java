
import java.util.Scanner;

class Maths {
	public static void main(String[] args) {
        String name="Carolyn";
        int age=41;
        double score=3.14;
        char group='C';
            System.out.println(name+" is "+age+" "+score+" "+group);
            System.out.println(name);
            System.out.println(age);
        ++age;
            System.out.println(age);
        ++age;
            System.out.println(age);
        ++age;
            System.out.println(age);
        ++age;
            System.out.println(age);
        ++age;
            System.out.println(age);
        ++age;
            System.out.println(age);
        ++age;
            System.out.println(age);
            System.out.println("----------");
        int num1=4;
        int num2=8;
        num2 += num1;
            System.out.println(num2 + name + "happy");
            System.out.println("----------");
		int a=12,b=5;
		double aa=12,bb=5;
			System.out.println("a = "+a+" and b = "+b);
		int sum1=a+b,sum2=a-b,sum3=a*b,sum4=a/b,sum5=a%b;
		double sum6=aa/bb;
			System.out.println("a + b = "+sum1);
			System.out.println("a - b = "+sum2);
			System.out.println("a * b = "+sum3);
			System.out.println("a / b = "+sum4+" with a remainder of "+sum5);
			System.out.println("a / b = "+sum6);
		++a; // add 1 to a
		++b; // add 1 to b
		++aa;
		++bb;
			System.out.println("a is now = "+a+" and b is now = "+b);
		a-=b; // subtract b from a
		b+=a; // add a to the new b
		aa-=bb;
		bb+=aa;
			System.out.println("a is now = "+a+" and b is now = "+b);
		int sum7=a+b,sum8=a-b,sum9=a*b,sum10=a/b,sum11=a%b;
		double sum12=aa/bb;
			System.out.println("a + b = "+sum7);
			System.out.println("a - b = "+sum8);
			System.out.println("a * b = "+sum9);
			System.out.println("a / b = "+sum10+" with a remainder of "+sum11);
			System.out.println("a / b = "+sum12);
			System.out.println(name+" knows how to do the maths!");
            System.out.println("----------");
        Scanner myVar = new Scanner(System.in);
        	System.out.print("This is where you input something interesting . . . : ");
			System.out.println("You input "+myVar.nextLine()+". Why?");
// But are you really?
/* Perhaps
Perhaps not */

	}
}