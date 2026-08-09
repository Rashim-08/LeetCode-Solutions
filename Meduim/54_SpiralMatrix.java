public class Solution {
    public List<Integer> spiralOrder(int[][] a) {
    int m=a.length;
    ArrayList<Integer> q=new ArrayList<>();
    int n=a[0].length;
    int top=0,bottom=m-1;
    int left=0,right=n-1;
    
    while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            q.add(a[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            q.add(a[i][right]);
        }
        right--;
        if(top<=bottom ){
            for(int i=right;i>=left;i--){
                q.add(a[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                q.add(a[i][left]);
            }
            left++;
        }
    }
   return q;
    }
} {
    
}
