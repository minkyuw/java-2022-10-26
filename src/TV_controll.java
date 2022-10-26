
public class TV_controll {
	public static void main(String[] args) {
		표준TV aTV = new 삼성TV();
		aTV.켜기();
		
		삼성TV ltv = (삼성TV) aTV;
		ltv.켜기();
	}
}

class 표준TV {
	void 켜기() {}
	void 끄기() {}
}

class 샤오미TV extends 표준TV {
	void 켜기() {
		System.out.println("샤오미TV가 켜집니다.");
	}
	void 끄기() {
		System.out.println("샤오미TV가 꺼집니다.");
	}
}
class 삼성TV extends 표준TV {
	void 켜기() {
		System.out.println("삼성TV가 켜집니다.");
	}
	void 끄기() {
		System.out.println("삼성TV가 꺼집니다.");
	}
}
class LGTV extends 표준TV {
	void 켜기() {
		System.out.println("LGTV가 켜집니다.");
	}
	void 끄기() {
		System.out.println("LGTV가 꺼집니다.");
	}
}