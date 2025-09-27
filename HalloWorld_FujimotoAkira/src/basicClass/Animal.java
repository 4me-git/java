package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog1 = new Dog(); //new Dog();でDogクラスのインスタンスを作成
		System.out.println(dog1.name); //nameフィールドを参照
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(3); 
		System.out.println(dog2.count);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime now = LocalDateTime.now(); //日時を取得
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); //フォーマット指定
		String formattedNow = now.format(formatter); //文字列に変換 format(formatter)で指定
		System.out.println(formattedNow);
	}
}