package curriculum_B;

import java.util.Random; //乱数生成器インポート
import java.util.Scanner; //入力受け取りインポート

public class Qes6 {
	private static final int MAX = 11; //残り台数の最大値(０〜MAX)のどれかが出る
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //キーボードからの入力を受け取る道具用意、System.in(キーボードからの入力)を使いやすくしてる
		String line = sc.nextLine().trim(); //入力された１行を文字列として読み取る、trim()は前後の余計な空白、改行を削除
		String[] items = line.split("、"); //sprit(区切り文字)"、"を使って分割、配列
		
		Random rand = new Random(); //乱数生成器の変数rand宣言
		
		/*拡張for文で配列の要素を1つずつ取り出して処理*/
		for (String raw : items) { //items(split"、"の配列)から順番に1つずつ取り出して処理、配列から取り出した要素の変数をraw
			String item = raw.trim(); //trim()で前後の余計な空白、改行を削除
			
		/*switch文で商品ごとの処理を分岐*/
		switch (item) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":{
				int remain = rand.nextInt(MAX +1); //ランダムに0~11　nextIntは0からn未満　MAX +1は12未満にするため
				System.out.printf("%sの残り台数は%d台です%n",item,remain); //printfはフォーマットを指定して出力
				//%s→文字列(itemが入る)、%d→整数(remainが入る)、％n→改行
				break; //switch文を抜ける
			}
			
			//テレビとディスプレイ
			case "テレビ":
			case "ディスプレイ": {
				int r = rand.nextInt(MAX + 1); //ランダムに0~11
				
				int remain = "ディスプレイ".equals(item) ? (MAX - r) : r; //条件演算子　条件式?真の値の場合:偽の値の場合
				//ディスプレイならMAX-r(11-r),それ以外ならr　//equalsはjavaで文字列を比べる時に使うもの(itemの中身がディスプレイか否か)
				System.out.printf("%sの残り台数は%d台です%n",item,remain);
				break;//switch文を抜ける
			}
			default: //どのケースにも当てはまらなかった場合
				System.out.printf("『%s』は指定の商品ではありません%n",item);
		}
		}
		sc.close();
	}

}
