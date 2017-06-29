package gk;
import java.util.*;
public class armstrongnumber {
	public static void main(String args[]){
		for(int n=10; n<500; n++){
			int sum=0;
			int num=n;
			int org=num;
			while(num>0){
				int t=num%10;
				sum=sum+t*t*t;
				num=num/10;
				if(sum==org){
					System.out.println("arg");
				}
			}
		}
	}

}
