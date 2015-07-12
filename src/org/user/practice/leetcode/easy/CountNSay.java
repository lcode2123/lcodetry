package org.user.practice.leetcode.easy;

public class CountNSay {


	public String countAndSay(int n) {
    
		if(n == 0) return new String("");
		
		String str ="1";
		
		for(int t =0;t<n;t++){
			
			
			int i = 0;
			char lastC = str.charAt(0);
			StringBuilder nextStr = new StringBuilder();
			do{
				int count = 0;
				while(i<str.length()&&str.charAt(i)==lastC){i++;count++;}
				
				nextStr.append(count);
				nextStr.append(lastC);
				lastC = str.charAt(i);
			}while(i<str.length());
			
			str = nextStr.toString();
		}
		
		return str;
    }
	
	public static void main(String[] args){
		CountNSay cc = new CountNSay();
		System.out.println(cc.countAndSay(3));
	}
}
