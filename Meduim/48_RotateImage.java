class Solution {
    static void swap(int[][] a,int i,int j){
        int temp=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
    }
    static void reverse(int[][] a,int i){
        int p1=0;
        int p2=a.length-1;
        while(p1<p2){
            int temp=a[i][p1];
            a[i][p1]=a[i][p2];
            a[i][p2]=temp;
            p1++;
            p2--;
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix,i);
        }
    }
}
