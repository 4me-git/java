package curriculum_B;

public class Qes4 {
	
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) { //段(初期化式; 条件式; 変化式）
		for(int j = 1; j < 10; j++) {//掛ける数
			
			System.out.print(String.format("%02d * %02d = %02d", i, j, i*j)); //String.formatで01,02の表示指定
			
			if (j != 9) System.out.print(" || "); //*9以外は区切りを入れる
		}
		System.out.println(); //段が終わったら改行
		}
}
}