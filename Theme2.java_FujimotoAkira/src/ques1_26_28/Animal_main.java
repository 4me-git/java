package ques1_26_28;

import java.util.Scanner;

public class Animal_main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //System.in(キーボード)から受け取る
		
		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine(); //ユーザーが入力、その文字をinputに格納
		
		String[] animalDataList = input.split(","); //カンマで分割し各動物に配列　例(ライオン:2.1:80)
		
		for(String animalData : animalDataList) { //↑で配列した各要素を1つずつ処理するループ
			String[] parts = animalData.split(":"); //コロンで分割
			
			String name = parts[0]; //分割した配列(ライオン:2.1:80)の０番目は名前なのでnameに代入
			double weight = Double.parseDouble(parts[1]); //１番目をdoubleに変換してweightに代入
			int speed = Integer.parseInt(parts[2]); //２番目をintに変換してspeedに代入
			String gakumei = Animal_dic.getGakumei(name);
			
			//Animalオブジェクト生成
			Animal_sub animal = new Animal_sub(name, weight, speed, gakumei);
			
			//情報出力
			animal.printInfo();
			
		}
		scanner.close();
	}
}
