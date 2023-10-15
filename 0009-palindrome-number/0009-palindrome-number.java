class Solution {
    public boolean isPalindrome(int x) {
    int temp=x, reverse,sum=0;
    while(x>0){   
        reverse=x%10;  
        sum=(sum*10)+reverse;   
        x=x/10;    
  }
  if(sum==temp){
      return true;
  }   
  else{
      return false;
  }  
    }
}