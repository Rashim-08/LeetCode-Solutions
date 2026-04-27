class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> m=new ArrayList<>();
    
   for(int i=0;i<numRows;i++){
        List<Integer> row =new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(j==0 || j==i)row.add(1);
            else{
                int sum =m.get(i-1).get(j-1)+m.get(i-1).get(j);
                row.add(sum); 
                }
            }
            m.add(row);//additing a row 
        }
    return m;
    }
}
