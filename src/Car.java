
public class Car {
	public static void main(String[] args) {
		자동차 a자동차 = new 자동차();
		자동차 b자동차 = new 자동차();
		a자동차.HV = 100;
		b자동차.HV = 200;
		
		a자동차.번호 = 1;
		b자동차.번호 = 2;
		
		
		a자동차.최고속력();
		b자동차.최고속력();
		
		boat.달리기();
	}
}

class 자동차 {
	int HV;
	int 번호;
	void 최고속력() {
		System.out.printf("%s의 최고속력은 %dKm/s 입니다.\n", this, this.HV);
	}
	void 달리기() {
		System.out.printf("%d번 자동차 %s가 %dKm/s의 속도로 달립니다", this.번호, this, this.HV);
	}
}

class boat {
	static void 달리기() {
		System.out.println("달리기");
	}
}