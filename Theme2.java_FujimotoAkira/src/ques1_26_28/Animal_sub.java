package ques1_26_28;

public class Animal_sub {
	//フィールド(持っている情報)
	private String name; //動物名
	private double weight; //体重
	private int speed; //速度
	private String gakumei; //学名
	
	//コンストラクタ(new Animal(...)した時に自動でセットされる初期化用のメゾット、newした時に呼ばれるやつ)
	public Animal_sub(String name, double weight, int speed, String gakumei) {
		this.name = name;
		this.weight = weight;
		this.speed = speed;
		this.gakumei = gakumei;
	}
	
	//出力用メゾット
	public void printInfo() { //printInfoは出力用の処理をまとめてひとまとめにして再利用できる
		System.out.println("動物名：" + name);
		System.out.println("体重：" + weight + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + gakumei);
		System.out.println(); //空白で区切る
	}

}
