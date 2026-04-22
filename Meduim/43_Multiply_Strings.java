//CODE UPDATED AND NEW TOPIC LEARNED

class Solution {
    public String multiply(String num1, String num2) {
      if(num1.equals("0") || num2.equals("0")){
         return "0";
       }
     
     int n=num1.length();
     int m=num2.length();
     int []result=new int[n+m]; //array created

     //multiplying the characters
     for(int i=n-1;i>=0;i--) {
        for(int j=m-1;j>=0;j--){
            int d1=num1.charAt(i)-'0';
            int d2=num2.charAt(j)-'0';
            int sum=d1*d2+result[i+j+1];
            result[i+j+1]=sum%10;
            result[i+j]+=sum/10;

        }
     }
      int start = 0;
    while(start < result.length && result[start] == 0){
        start++;
    }

    // Create char array manually
    char[] ans = new char[result.length - start];

    int idx = 0;
    for(int i = start; i < result.length; i++){
        ans[idx++] = (char)(result[i] + '0');
    }

    return new String(ans);
      
    }
}






// CODE WRITTEN BY ME 
String num1="498828660196";
 String num2="840477629533";
 if(num1.equals("0") || num2.equals("0")){
 System.out.println("0");;
 }
  String p="";
 
  long k=0;
 
     for(int j=0;j<num1.length();j++) {
        int i=0;
        while(i<10){
          if(num1.charAt(j)==(char)(i+'0')){
            System.out.println("-"+i);
            k=(long)(i*(Math.pow(10, num1.length()-j-1)))+k;
            System.out.println(k);
            break;
          }
          i++;    
     }
    }
    System.out.println("--"+k);
    long z=0;
     for(int j=0;j<num2.length();j++) {
        int i=0;
        while(i<10){
          if(num2.charAt(j)==(char)(i+'0')){
            System.out.println("-"+i);
            z=(long)(i*(Math.pow(10, num2.length()-j-1)))+z;
            System.out.println(z);
            break;
          }
          i++;    
     }
    }
      k=k*z;
      System.out.println("/"+k);
      while(k>0){
        p=(char)(k%10+'0')+p;
        k=k/10;
     }
    System.out.println(p);
    int x=0;
     if(num1.startsWith("-") && num2.startsWith("-"))x=0;
     else if((num1.startsWith("-") && num2.startsWith("")) || (num1.startsWith("") && num2.startsWith("-")))x=1;
   
     if(x==1){
        p= "-"+ p;
     }
    
     System.out.println(p);

    


