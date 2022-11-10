package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
//        9.1
        System.out.println("Nhập số nguyên n");
          int n = sc.nextInt();
        
       if (n>0) {
        	System.out.println("Là số dương");
        }else{     
		    if (n==0) {
        		System.out.println("Không phải âm hay dương");
        }else {     
        		System.out.println("Là số âm");
        	}
		    }
	}}


