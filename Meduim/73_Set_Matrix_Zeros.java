class Solution {
    public void setZeroes(int[][] a) {
        int x=1;
     int y=1;
     for(int i=0;i<a.length;i++){
        if(a[i][0]==0)x=0;
     }
     for(int i=0;i<a[0].length;i++){
        if(a[0][i]==0)y=0;
     }
     
     for(int i=0;i<a.length;i++){
        for(int j=1;j<a[0].length;j++){
            if(a[i][j]==0){
                a[0][j]=0;
                a[i][0]=0;
            }
        }
     }

 for(int i=1;i<a.length;i++){
        for(int j=1;j<a[0].length;j++){
           if(a[0][j]==0)a[i][j]=0;
           if(a[i][0]==0)a[i][j]=0;
        }
        
     }

     for(int i=0;i<a.length;i++){
        if(x==0)a[i][0]=0;
     }
     for(int i=0;i<a[0].length;i++){
        if(y==0)a[0][i]=0;
     }

    }
}