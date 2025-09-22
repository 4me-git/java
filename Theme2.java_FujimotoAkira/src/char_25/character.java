package char_25;

public class character {
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;
	
	//コンストラクタ
	public character(String name) {
		this.name = name;
	}
	
	//setter 値を代入するsetterメゾット
	public void setHp(int hp) {this.hp = hp;} //引数hpをフィールドhp(this.hp)に代入する
	public void setMp(int mp) {this.mp = mp;} 
	public void setAttack(int attack) {this.attack = attack;} 
	public void setSpeed(int speed) {this.speed = speed;} 
	public void setDefense(int defense) {this.defense = defense;} 
	
	//getter 外から読み取る時に使う
	public String getName() {return this.name;}
	public int getHp() {return this.hp;}
	public int getMp() {return this.mp;}
	public int getAttack() {return this.attack;}
	public int getSpeed() {return this.speed;}
	public int getDefense() {return this.defense;}

}
