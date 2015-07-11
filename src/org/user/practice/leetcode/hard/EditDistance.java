package org.user.practice.leetcode.hard;

public class EditDistance {


	public int minDistance(String word1, String word2) {
    
		int lLen = word1.length();
		int pLen = word2.length();
		
		//if(lLen == 0 || pLen ==0) return 0;
		
		int [][] T = new int[lLen+1][pLen+1];
		
		for(int i =0;i<=pLen;i++) T[0][i] = i;
		
		for(int i = 1;i<=lLen;i++){
			T[i][0] = i;
			for(int j=1;j<=pLen;j++){
				int t1 = T[i-1][j] +1;
				int t2 = T[i][j-1] +1;
				int t3 = word1.charAt(i-1)==word2.charAt(j-1)?T[i-1][j-1]:T[i-1][j-1]+1;
				T[i][j] = Math.min(t1, Math.min(t2,t3));
			}
		}
		
		return T[lLen][pLen];
    }
	
	public static void main(String[] args){
		EditDistance cd = new EditDistance();
		String word1 = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef"
				 ,word2="bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefg";
		System.out.println(cd.minDistance(word1, word2));
	}
}
