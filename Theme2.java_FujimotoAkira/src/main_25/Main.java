package main_25;

import java.util.Scanner;

import char_25.Hero;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("名前を入力してください：");
		String inputName = sc.nextLine();
		
		Hero hero = new Hero(inputName);
		
		System.out.println("\nこんにちは「" + hero.getName() + "」さん"); // \nは改行
		System.out.println("ステータス");
		System.out.println("HP：" + hero.getHp());
		System.out.println("MP：" + hero.getMp());
		System.out.println("攻撃力：" + hero.getAttack());
		System.out.println("素早さ：" + hero.getSpeed());
		System.out.println("防御力：" + hero.getDefense());
		
		System.out.println("\nさあ冒険に出かけよう！");
		
		sc.close();
	}

}
