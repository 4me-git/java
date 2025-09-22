package ques1_26_28;

import java.util.HashMap;
import java.util.Map;

public class Animal_dic {
	//学名を保存するMap(動物名、学名)
	private static final Map<String, String> gakumei = new HashMap<>(); //gakumeiはMapルールに従う、HashMapという箱作る
	
	//データ登録
	static {
		gakumei.put("ライオン", "パンテラ・レオ");
		gakumei.put("ゾウ", "ロキソドンタ・サイクロティス");
		gakumei.put("パンダ", "アイルロポダ・メラノレウカ");
		gakumei.put("チンパンジー", "パン・トゥログロディテス");
		gakumei.put("シマウマ", "チャップマンシマウマ");
		gakumei.put("インコ", "不明");
	}
	
	//
	public static String getGakumei(String name) {
		return gakumei.getOrDefault(name, "不明"); //Mapから取り出すメゾット、gakumeiがあればnameなければデフォルト(不明)を返す
	}
	

}
