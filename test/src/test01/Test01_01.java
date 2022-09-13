package test01;

public class Test01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.10.(수)
		// 과제 1 : 강사님 해설
		
		int[] score = {50, 60, 36, 90, 100};
		int sum = 0;
		int count = 0;
		for(int i=0; i<score.length; i++) {
			if(score[i] >= 60) {
				sum +=score[i];
				count++;
				System.out.println((i+1)+"번 : 합격");
			}
		}System.out.println("합격자 평균 :" + sum/count);
		
		
		
		
		
		/*
		// 내가 쓴 코딩
		int[] scores = {50, 60, 36, 90, 100};
		int count = 0;
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>=60) {
				count++;
				sum += scores[i];
				System.out.println((i+1)+"번 : 합격");
			}
		}System.out.println("합격자 평균 :" + sum/count);
		*/
		
	}

}
