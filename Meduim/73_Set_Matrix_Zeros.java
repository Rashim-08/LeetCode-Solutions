class Solution {
    public void setZeroes(int[][] matrix) {
       int [][] mi=new int[matrix.length][matrix[0].length];

    int m=matrix.length;//row
    int n=matrix[0].length;//column
    
    HashSet<Integer> k=new HashSet<>();//for row
    HashSet<Integer> h=new HashSet<>();//for column

    //collecting zeros
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                k.add(i);
                h.add(j);
            }
        }
    }
    //creating answer
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(k.contains(i) || h.contains(j)){
                mi[i][j]=0;
            }
            else{
                mi[i][j]=matrix[i][j];
            }
        }
    }
    //updating the given matix
   for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        matrix[i][j] = mi[i][j];
    }
}
    }
}


//optimal solution
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Step 1: check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Step 2: check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        // Step 3: mark rows & columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 4: fill zeros using markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: handle first row
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 6: handle first column
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}