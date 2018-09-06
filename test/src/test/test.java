package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int[] number = null;
		Scanner x=new Scanner(System.in);
	     while(x.hasNext()){
	         int m=x.nextInt();
	         number=new int[m];
	         for(int i=0;i<m;i++){
	             number[i]=x.nextInt();
	         }
	     }
	     maopao(number);
	     
	     for(int i=0; i<number.length; i++) {
	    	 System.out.println(number[i]);
	     }
	     
	     //2
	}
	
	public static void maopao(int []arr) {
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0;j<arr.length-i-1;i++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
