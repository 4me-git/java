package plan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Plan_01 {
	public String Hello; //フィールをpublicにして外からアクセス可能(アクセス修飾子)
	public String sushiComment;
	public String sushiinfo;
	public String now;

	public Plan_01() {
		this.Hello = "こんにちは！ここは日本です！";
		this.sushiComment = "この寿司はうまい";
		this.sushiinfo = "寿司は和食です";
		this.now = LocalDateTime.now()
			.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}
	
	public void printAll() {
		System.out.println(this.Hello);
		System.out.println(this.sushiComment);
		System.out.println(this.sushiinfo);
		System.out.println("今の現在日時は" + this.now + "です"); 
	}
}
