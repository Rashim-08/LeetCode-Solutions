class Solution {
    public void sortColors(int[] a) {
       int low=0;
       int mid=0;
       int high=a.length-1;

       while(mid<=high){
        if(a[mid]==0){
            int temp=a[low];
            a[low]=a[mid];
            a[mid]=temp;
            low++; 
            mid++;
        }
        else if(a[mid]==2){
            int temp1=a[mid];
            a[mid]=a[high];
            a[high]=temp1;
            high--;
        }
        else if(a[mid]==1)mid++;
       }
    
    }
}