
public class Customer {
	public static void main(String[] args) {
		Person a = new Person();
		a.age = 30;
		a.name = "철수";
		a.isMarried = false;
		a.introduce();
	}
}

class Person {
	int age;
	String name;
	boolean isMarried;
	int a = 3;
	void introduce() {
		System.out.printf("== 자기소게 == \n이룸 : %s \n나이 : %d \n결혼여부 : %b", this.name, this.age, this.isMarried);
	}
}