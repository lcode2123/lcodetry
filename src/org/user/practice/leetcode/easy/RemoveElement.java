package org.user.practice.leetcode.easy;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
    
		if(nums.length == 0) return 0;
		int lastIndex;
		for(lastIndex = nums.length -1; lastIndex>=0 && nums[lastIndex] == val;lastIndex--);
		if(lastIndex == 0) return 0;
		
		for(int i =0; i<lastIndex; i++){
			if(nums[i]!=val) continue;
			nums[i] = nums[lastIndex];
			nums[lastIndex] = val;
			while(lastIndex>=0&&nums[lastIndex]==val)lastIndex --;
			
			
		}
		
		if(nums[lastIndex]==val) return 0;
		return lastIndex+1;
    }
	
	
	public static void main(String[] args){
		int [] test = {1,1,1};
		RemoveElement t2 = new RemoveElement();
		System.out.println(t2.removeElement(test, 1));
	}

}
