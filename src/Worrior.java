
public class Worrior {
	public static void main(String[] args) {
		전사 a전사 = new 전사();
		
		a전사.공격("마크", "칼");
	}
}

class 전사 {
	String last_who = "";
	String last_weapon = "";
	
	void 공격(String who,String weapon) {
		this.last_who = who;
		this.last_weapon= weapon;
		System.out.printf("%s 이(가) %s (으)로 공격합니다.\n", who, weapon);
	}
	
	void 재공격() {
		System.out.printf("%s 이(가) %s (으)로 공격합니다.\n", this.last_who, this.last_weapon);
	}
}