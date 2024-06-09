class Solution {
    public int numberOfChild(int n, int k) {
        boolean turn=true;
        int curr=0;
        while(k>0){
            if(turn==true){
                curr++;
            }else{
                curr--;
            }if(curr==0||curr==n-1){
                if(turn==true){
                    turn=false;
                }else{
                    turn=true;
                }
            }
            k--;
        }return curr;
    }
}