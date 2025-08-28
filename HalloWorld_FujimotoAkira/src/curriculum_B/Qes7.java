package curriculum_B;

import java.util.Scanner; //入力受け取りインポート

public class Qes7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //キーボードからの入力を受け取り
		
		String[] subjects = {"英語","数学","理科","社会"}; //配列
		
		System.out.print("生徒の人数を入力してください(2以上):"); //printinは出力したあと自動的に改行するやつ printは出力するだけ
		int n = sc.nextInt();
		
		int[][] scores = new int[n][subjects.length]; //二次元配列　[人数][科目数]
		
		for(int i = 0; i < n; i++) { //生徒ごとでループ
			for(int j = 0; j < subjects.length; j++) { //科目ごとにループ
				System.out.print((i + 1) + "人目の「" + subjects[j] + "」の点数を入力してください：");
				scores[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println();
		
		//各生徒の平均点
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < subjects.length; j++) {
				sum += scores[i][j];
			}
			double avg = (double)sum / subjects.length; //一人分の合計を科目数で割る
			System.out.println((i + 1) + "人目の平均点は" + avg + " 点です。");
		}
		System.out.println();
		
		//各科目の平均点
		for (int j = 0; j < subjects.length; j++) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += scores[i][j];
			}
			double avg = (double)sum / n; //一人分の合計を科目数で割る
			System.out.println(subjects[j]+ "の平均点は" + avg + " 点です。");
		}
		System.out.println();
		
		//全体の平均点を計算
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < subjects.length; j++) {
				totalSum += scores[i][j];
			}
		}
		double totalAvg = (double)totalSum / (n * subjects.length);
		System.out.println("全体の平均点は" + totalAvg + " 点です。");
		
		sc.close();
	}

}
