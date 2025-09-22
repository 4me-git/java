package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void printmsg(String msg1, String msg2, int x) { //printmsgという名前のメゾットを作成、String msgとint xが引数
		System.out.println(msg1 + " " + msg2 + " " + x);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void printnum(int x, int y) { //printnumという名前のメゾットを作成、int x,y引数
		System.out.println(x * y);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArr(int[] arr) { //printArrという名前のメゾットを作成、int[] arrは配列を受け取る引数
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); //arr[i]は配列i番目の値
		}
	}	
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void printnum(double x, double y) { //printnumという名前のメゾットを作成、int x,y引数
		System.out.println(x + y);
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] random(int count) { //randomという名前のメゾットを作成、int countは空の配列の引数、引数でいくつの配列にするかを受け取る
		Random rand = new Random(); //乱数生成器の変数rand宣言
		int[] arr = new int[count]; //countの大きさの配列を用意
		
		for(int i = 0; i < count; i++) { //count回繰り返し
			arr[i] = rand.nextInt(100) + 1; //nextInt(100)→0~99 +1で1~100 1~100の乱数を作る
			System.out.println(arr[i]);
		}
		return arr; //配列を返す(返り値)
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double getAverage(int[] arr) { //引数で配列を受け取る
		int sum = 0; //合計を入れる変数
		for(int i = 0; i < arr.length; i++) { //配列の長さ分繰り返し
			sum += arr[i]; //配列の値を１つずつ足す
		}
		return (double) sum / arr.length; //平均を計算
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean checkAverage(double avg) {
		return avg >= 50;
	}
	
	
	
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
	printmsg("Hello","JavaSE",11); //01
	
	printnum(10, 20); //02
	
	int[] Arr = {1,2,3,4,5};
	printArr(Arr); //03
	
	printnum(2.5, 2.5); //04
	
	int[] result = random(5); //05
	
	double avg = getAverage(result);
	System.out.println(avg);//06
	
	boolean over50 = checkAverage(avg); 
	System.out.println(over50);//07
	
	
	
	}
}
