public class secondLargest {
    int a[]={5,6,7,10,33,45,98,22,101,100,78};
    int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
    for(int i:a){
        if(i>max1){
            max2=max1;
            max1=i;
        }
        else if(i>max2 && i!=max1){
            max2=i;
        }
    }
    System.out.println(max2);
}
