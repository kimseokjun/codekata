class Solution {
    public long solution(int price, int money, int count) {
        
        long totalpay = 0;
        
        for(int i =1; i<= count; i++){
            totalpay += (long)price * i;          
        }
        
        if(money > totalpay){
            return 0;
        }else{
            return totalpay - money;
        }

    }
}