// Last updated: 8/12/2026, 9:01:05 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1;i*i<num;i++){
    if(num%i==0){
        if(i!=(num/i)){
            sum = sum + i;
            sum = sum + (num/i);
        }else{
        sum = sum + i;
        }
      }
    }
    if((sum-num) == num){
    return true;
}else{
    return false;
}
    }
}