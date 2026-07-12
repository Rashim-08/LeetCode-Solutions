 int num=sc.nextInt();
    int sum=0;
    int l=0;
    int n = num;
    while(n>0){
        l++;
        n=n/10;
    }
    int k=num;
    while(num>0){
        sum+=Math.pow(num%10, l);
        num/=10;
    }
    if(k==sum)System.out.println("true");
    else System.out.println("false");