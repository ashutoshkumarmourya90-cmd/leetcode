class Solution{
  Public int removeeElement(int[]  nums, Val){
    int i = 0;
    for(int j=1;j<nums.length;j++){
      if(nums[j]!=Val){
        nums[i]=nums[j];
        i++;
        
      }
     }
    return i;
  }
}
