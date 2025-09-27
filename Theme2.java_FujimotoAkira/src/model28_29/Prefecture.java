package model28_29;

public class Prefecture {
	//フィールド(持っている情報)
	private String name; //都道府県名
	private String capital; //県庁所在地
	private double area; //面積
	
	//コンストラクタ(初期化用のメゾット)
	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	
	//ゲッター(外から読み取る時に使う)
	public String getName() {return name;}
	public String getCapital() {return capital;}
	public double getArea() {return area;}
	
	//出力用メゾット
	public void printInfo() { //printInfoは出力用の処理をまとめてひとまとめにして再利用できる
		System.out.println("都道府県名：" + name);
		System.out.println("県庁所在地：" + capital);
		System.out.println("面積：" + area + "km2\n"); //\nは改行
	}
}
