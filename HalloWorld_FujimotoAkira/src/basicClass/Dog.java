package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name; //フィールド　フィールドは情報を表すもの　車だと「排気量」「燃費」「走行距離」などの情報がフィールド
	
	// Q2：フィールドに動物の数の変数を定義してください。
	int count;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() { // コンストラクタ
		this.name = "犬"; //thisはこのクラスのフィールドを使うという意味
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int count) { // コンストラクタ
		this.count = count;
	}
}
