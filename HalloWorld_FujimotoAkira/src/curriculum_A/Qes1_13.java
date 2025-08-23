package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		/*1,2,3*/
		byte b = 10;
		short s = 100;
		int i = 1000;
		long l = 10000;
		float f = 9.5f;
		double d = 10.5;
		char c = 'a';
		String str = "ハロー";
		boolean flag = true;
		/*4*/
		System.out.println(b+s+i+l);
		System.out.println(b+b);
		System.out.println(c+str+flag);
		System.out.println(b+s+i+l+f+d);
		System.out.println(b*s*i*l);
		System.out.println(d/s);
		System.out.println(b-s);
		
		/*5*/
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		
		/*6*/
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		/*8*/
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		
		/*9*/
		age += 24;
		height += 168.5;
		weight += 64.2;
		
		System.out.println("「初めまして"+name+"です」");
		/*10*/
		System.out.println("「年齢は"+(age >= 25)+"です」");
		System.out.println("「身長は"+height+"です」");
		System.out.println("「体重は"+weight+"です」");
		System.out.println("「好きな食べ物は"+food+"です」");
		/*7*/
		System.out.println("「BMIは"+weight / ((height / 100)*(height / 100))+"です」");
		
		/*11*/
		age = 24;
		String text1 = String.valueOf(age);
		System.out.println(text1);
		
		height = 168.5;
		String text2 = String.valueOf(height);
		System.out.println(text2);
		
		weight = 64.2;
		String text3 = String.valueOf(weight);
		System.out.println(text3);
		
		/*12*/
		int parsedInt = Integer.parseInt(text1);
		int parsedDouble = (int)Double.parseDouble(text2);
		System.out.println(parsedInt);
		System.out.println(parsedDouble);
		
		/*13*/
		System.out.println(parsedInt == 25 || parsedDouble >= 160);
		
		
	}
}
