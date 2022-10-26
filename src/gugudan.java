
public class gugudan {
	public static void main(String[] args) {
		print_gugudan(8, 30);
	}
	
	static void print_gugudan(int dan, int limit){
		System.out.println("dan : " + dan);
		for (int i = 1; i <= limit; i ++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
}