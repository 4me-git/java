package Vehicle_Person;

public class Vehicle {
	private String owner; //privateでクラスフィールド
	
	public String getOwner() { //値を読むメゾットgetter
		return owner; //ownerの値を返す
	}
	
	public void setOwner(String owner) { //値を変更するメゾットsetter
		this.owner = owner; //ownerの値を更新する
	}

}
