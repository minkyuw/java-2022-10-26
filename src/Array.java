
public class Array {
	public static void main(String[] args) {
		int a = 3;

		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = a * 10;
		arr[2] = arr[0] + arr[1];

		System.out.print("====== result ====== \n\n");
		System.out.printf("Array 1 : %d \nArray 2 : %d \nArray 3 : %d", arr[0], arr[1], arr[2]);

		System.out.print("\n\n=======\n\n");

		boolean[] arrb = new boolean[3];
		arrb[0] = true;
		arrb[1] = false;

		int[] arr3 = new int[10];
		for (int i = 1; i < arr3.length; i++) {
			arr3[i-1] = i;
		}
		for (int i = 1; i < arr3.length; i++) {
			System.out.printf("arr3[%d] : arr3[%d]\n", arr3[i - 1], arr3[i]);
		}
		System.out.print("\n\n=======\n\n");
		
		// 철수, 영희, 영수 10, 20, 30
		int[] ages = new int[3];
		
		ages[0] = 10;
		ages[1] = 20;
		ages[2] = 30;
		
		// 이름, 나이, 키, 결혼여부
		// 문자, 정수, 상수, 불린
		
		// 창조 타입
		철수 a1 = new 철수();
		a1.이름 = "김철수";
		a1.나이 = 22;
		a1.키 = 180.5;
		a1.결혼여부 = true;
		
		IntArr3 IArr = new IntArr3();
		IArr.key0 = 30;
		IArr.key1 = 20;
		IArr.key2 = 10;
	}
}

class 철수 {
	String 이름;
	int 나이;
	double 키;
	boolean 결혼여부;
}
class IntArr3 {
	int key0;
	int key1;
	int key2;
}
