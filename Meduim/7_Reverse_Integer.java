class Solution {
    public int reverse(int x) {
        long r=0;
        int k=0;
        if(x<0){
            k=1;
            x=-x;
            }
        while(x>0){
            r=r*10+x%10;
            if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE)return 0;
            x/=10;
        }
        if(k==1)r=-r;
        return (int)r;
    }
}