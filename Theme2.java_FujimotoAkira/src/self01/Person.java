package self01;

public class Person {
	//インスタンスフィールド
	String name;
	int age;
	double height;
	double weight;
	
	static int Count = 0;
	
	//コンストラクタ定義
	public Person(String name, int age, double height, double weight) {
		//インスタンスフィールドに値セット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Count++;
	}
	
	//bmiインスタンスメゾット
	public double bmi() {
		return this.weight / (this.height * this.height); //体重÷(身長×身長)
	}
	
	//インスタンスメゾットprint
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	// Math.floorで小数点以下を切り捨て
		double bmiValue = Math.floor(this.bmi());
		System.out.println(String.format("BMIは %.1f" , bmiValue));
	}
	
	//人数合計
	public static void printCount() {
		System.out.println("合計" + Count + "人です");
	}

}
