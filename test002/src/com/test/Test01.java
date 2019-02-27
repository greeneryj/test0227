package com.test;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 300; 
		int count = 0;
		
		String chcNum = String.valueOf(a);
		
		String[] arr = chcNum.split("");
		
		for(int i=0; i<arr.length; i++)
		{
			int num = Integer.parseInt(arr[i]);
			
			if((num%3==0||num%6==0||num%9==0) && num!=0)
			{
				count++;
			}
		}
		
		
		for(int i=0; i<count; i++)
		{
			System.out.print("짝");
			System.out.println("");
		}

	}

}
