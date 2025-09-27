package char_25;

import java.util.Random;

public class Hero extends Character { //extends characterでcharacterを継承(サブクラス)
	private Random rand = new Random();
	
	//
	public Hero(String name) {
		super(name); //スーパークラスのコンストラクタを呼び、nameを初期化
		setRandomStatus(); //ステータスをランダムにセット
	}
	
	//
	private void setRandomStatus() {
		setHp(rand.nextInt(1000)); //0~99
		setMp(rand.nextInt(1000));
		setAttack(rand.nextInt(1000));
		setSpeed(rand.nextInt(1000));
		setDefense(rand.nextInt(1000));
	}
}
