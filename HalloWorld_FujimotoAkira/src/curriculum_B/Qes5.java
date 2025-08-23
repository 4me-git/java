package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		for (int j = 1; j < 10; j++) { //掛ける数
		for(int i = 1; i < 21; i++) {//段(初期化式; 条件式; 変化式）
			
			System.out.print(String.format("%03d * %03d = %03d", i, j, i*j)); //String.formatで01,02の表示指定
			
			if (i != 9) System.out.print(" || "); //*9以外は区切りを入れる
		}
		System.out.println(); //掛け終わったら改行
		}
}
}
