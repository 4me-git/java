package ques1_23;

public class Q1_23 {

	//フィールド
	private String name;
	private String weight;
	private String speed;
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getWeight() {
		return weight;
	}
	public String getSpeed() {
		return speed;
	}
	
	//mainメゾット(実行)
	public static void main(String[] args) {
		Q1_23 lion = new Q1_23(); //lionオブジェクト作成
		
		//setterを使ってフィールドに値を入れる
		lion.setName("ライオン"); //lionに対してsetName呼び出す
		lion.setWeight("2.1m");
		lion.setSpeed("80km/h");
		
		//getterを使って値取り出し、出力
		System.out.println("動物名：" + lion.getName());
		System.out.println("体重：" + lion.getWeight());
		System.out.println("速度：" + lion.getSpeed());
	}
}
