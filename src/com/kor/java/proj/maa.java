package com.kor.java.proj;
import java.util.Scanner;

public class maa {
	public static void main(String[] args) {
		System.out.println("===프로그램 시작===");
		
		Scanner sc = new Scanner(System.in); //키보드의 입력값을 받아옴 (input)
		System.out.printf("명령어를 입력해주세요 : ");
		String command = sc.next();
		System.err.printf("입력된 명령어 : %s\n", command);
		
		System.out.printf("번호를 입력해주세요 : ");
		int num = sc.nextInt();
		System.err.printf("입력된 번호 : %d\n", num);
		
		sc.close();
		
		
		System.out.println("===프로그램 끝===");
	}
}
