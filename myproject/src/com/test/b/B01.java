package com.test.b;

import java.util.Scanner;

public class B01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 ");
		int su1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요 ");
		int su2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요 ");
		int su3 = s.nextInt();
		
		int top=0;
		int low=0;
		if(su1 > su2 && su1 > su3)
			top = su1;
		else if(su2 > su1 && su2 > su3)
			top = su2;
		else if(su3 > su1 && su3 > su2)
			top = su3;
		
		if(su1 < su2 && su1 < su3)
			low = su1;
		else if(su2 < su1 && su2 < su3)
			low = su2;
		else if(su2 < su1 && su2 < su3)
			low = su2;
		
		System.out.println("가장 큰 수는 "+top+"이고, 가장 작은 수는 "+low+"입니다.");
	

	}

}
