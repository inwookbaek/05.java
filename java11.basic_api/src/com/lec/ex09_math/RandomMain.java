package com.lec.ex09_math;

import java.util.Arrays;
import java.util.Random;

/*
	Random클래스
	
	java.util.Random()클래스는 다양한 난수를 얻기 위해 다양한 메서드를 제공한다.
	Math.random()메서드는 "0.0 <= 난수 < 1.0" 사이의 실수타입의 난수 1개를 리턴
	하는 반면 Random클래스는 boolean, long, float, double등의 난수를 리턴한다.
	또 다른 차이점은 Random클래스는 seed(종자)값을 설정하여 동일한 난수값을 얻
	을 수가 있다.
	
	seed값을 설정하면 난수가 발생이 될 때 항상 동일한 난수를 리턴한다.
*/
public class RandomMain {

	public static void main(String[] args) {
		
		// 로또번호생성하기
		int[] selectNumber = new int[6];
		Random random = new Random(42);
		System.out.print("로또번호 = ");
		for(int i=0;i<6;i++) {
			selectNumber[i] = random.nextInt(45) + 1; // 0<= 난수 < 45
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random(42);
		// seed값은 난수를 만드는 알고리즘에 사용되는 값으로 
		// 동일한 난수를 얻기 위해서 사용한다. 즉, seed값이 동일하면
		// 동일한 난수를 얻을 수 있다.
		System.out.print("당첨번호 = ");
		for(int i=0;i<6;i++) {
			winningNumber[i] = random.nextInt(45) + 1; // 0<= 난수 < 45
			System.out.print(winningNumber[i] + " ");
		}	
		System.out.println();
	
		// 당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨여부 = ");
		if(result) {
			System.out.println("로또에 당첨되었습니다!! 인생역적!!!");
		} else {
			System.out.println("꽝!!!!!!!!!!!!!!!!!!!!!");
		}
	}

}






















