package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
	
	/*入力を受け取る System.inはキーボードからの入力を意味*/
	Scanner scanner = new Scanner(System.in);
	/*乱数生成用のRandom*/
	Random random = new Random();
	/*変数userNameを宣言*/
	String userName = "";
	
	/*Whileで反復*/
	while (true) {
	System.out.println("ユーザー名を入力してください");
	/*入力されたユーザー名１行取得*/
	userName = scanner.nextLine();
	
	/*条件*/
	/*文字数が10文字より大きい場合 length()は文字数数えるやつ*/	
	if (userName.length() > 10) {
		System.out.println("「名前を10文字以内にしてください」");
	}
	
	/*ユーザー名が半角英数字以外の場合 !はfalseの時にturu ^は文字列先頭 $は文字列末尾 +は1文字以上*/
	else if (!userName.matches("^[a-zA-Z0-9]+$")) {
		System.out.println("「半角英数字のみで名前を入力してください」"); 	
	}
	
	/*null または 文字数が0文字以下の場合*/
	else if (userName  == null || userName.length() < 0) {
		System.out.println("「名前を入力してください」"); 
	}
	
	/*正常な値だった場合*/
	else {
		System.out.println("ユーザー名「" + userName + "」を登録しました"); 
		break;
	}
	}
	
	/*じゃんけん*/
	int count = 0;// 回数カウント
	String[] hands = {"グー","チョキ","パー"};// 手の名前を配列で管理
	
	while (true) {// 反復（無限）
		System.out.println("じゃんけんの手を入力してください（0:グー 1:チョキ 2:パー）:");
		
		int playerHand;// プレイヤーの手（0,1,2のどれか）
		if (scanner.hasNextInt()) { // 入力が整数なら代入
			playerHand = scanner.nextInt();
		} else {// 入力が整数以外
			System.out.println("0〜2の数字で入力してください");
			continue;// 最初に戻る
		}
		if (playerHand < 0 || playerHand > 2) {
			System.out.println("0〜2の数字で入力してください");
			continue;
		}
		
		int enemyHand = random.nextInt(3);// 0〜2の乱数で相手の手を決める
		count++;// じゃんけん回数を１回増やす
		
		System.out.println(userName + "の手は「" + hands[playerHand] + "」");
		System.out.println("相手の手は「" + hands[enemyHand] + "」");
		
		if (playerHand == enemyHand) {
			System.out.println("DRAW あいこ もう一回しましょう！");
		}
		else if(
				(playerHand == 0 && enemyHand == 1) ||
				(playerHand == 1 && enemyHand == 2) ||
				(playerHand == 2 && enemyHand == 0)
				) {
			System.out.println("やるやん。");
			System.out.println("次は俺にリベンジさせて");
			break;
		}
		else {
			System.out.println("俺の勝ち！");
			if (enemyHand == 0) {
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			}else if (enemyHand == 1) {
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("そらやったら次も、俺が勝ちますよ");
			}else {
				System.out.println("なんで負けたか、明日までに考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
			}		
		}
	}
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
		
		scanner.close();
	}
}
