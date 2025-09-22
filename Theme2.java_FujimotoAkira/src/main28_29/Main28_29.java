package main28_29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import model28_29.Prefecture;

public class Main28_29 {
	public static void main(String[] args) {
		Prefecture[] data = {
				new Prefecture("北海道", "札幌市", 83424),
				new Prefecture("青森県", "青森市", 9646),
				new Prefecture("岩手県", "盛岡市", 15275),
				new Prefecture("宮城県", "仙台市", 7278),
				new Prefecture("秋田県", "秋田市", 11638),
				new Prefecture("山形県", "山形市", 9323),
				new Prefecture("福島県", "福島市", 13784),
				new Prefecture("茨城県", "水戸市", 6097),
				new Prefecture("栃木県", "宇都宮市", 6408),
				new Prefecture("群馬県", "前橋市", 6362),
				new Prefecture("埼玉県", "さいたま市", 3798),
		};
		
		Scanner sc = new Scanner(System.in);
		
		//番号入力
		System.out.print("番号を入力してください:");
		String input = sc.nextLine().trim(); //前後の空白をtrim()で取り除いてinputに格納
		String[] inputs = input.split(","); //カンマで区切ってinputsに格納
		
		//順番入力
		System.out.print("昇順asc, 降順ならdescと入力してください:");
		String order = sc.nextLine();
		
		//入力された番号(文字列)をリストに
		List<Integer> indices = new ArrayList<>(); //整数を入れるための空リストindicesを用意
		for(String s : inputs) { //入力した番号(文字列)を1つずつ処理
			indices.add(Integer.parseInt(s.trim())); //Stringをintに変換してリストに追加
		}
		
		//ソート(並び替え)
		if(order.equalsIgnoreCase("asc")) {
			Collections.sort(indices); //リストを小さい順に並び替え
		}
		else {
			Collections.sort(indices, Collections.reverseOrder()); //リストを大きい順に並び替え
		}
		
		//出力
		for(int idx : indices) { //ソート済の番号を1つずつ取り出す
			data[idx].printInfo(); //番号に対応するデータを出力
		}
		sc.close();
	}

}
