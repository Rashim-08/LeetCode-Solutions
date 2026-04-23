//My code:-------

class Solution {
    public int myAtoi(String s) {
       StringBuilder sb=new StringBuilder(s);
        boolean b=false;

    
        int zero=0;
        
        while(sb.length()>0){
           if(sb.charAt(0)=='-'){
                b=true;
                sb.deleteCharAt(0);
                break;
            }
            else if(sb.charAt(0)==' '){
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0)=='+'){
                sb.deleteCharAt(0);
                break;
            }
            else{
                break;
            }
        }
        int i=0;
        
        while(i<sb.length()){
            if(!Character.isDigit(sb.charAt(i))){
                //System.out.println(i);
                sb.delete(i,sb.length());
                break;
            } 
            i++;
        } 
        
        System.out.println(sb);
        long k=0; 

        for(int j=0;j<sb.length();j++){
            //int p=0;
            // while(i<10){
            //     if(sb.charAt(j)==(char)(p+'0')){
            //         k=k*10+p;
            //         //System.out.println(k);
            //         break;
            //     }
            //     p++;
            // }
            int d=sb.charAt(j)-'0';
            k=k*10+d;

            //overflow handling
            if(!b && k> Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(b && -k < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        if(b)k=-k;
        
        return (int) k;
    }
}


//Optimal solution-----used pointer
class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        long num = 0;
        int sign = 1;

        // Step 1: skip spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: handle sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // Step 3: build number
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

            // Step 4: overflow check
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * num);
    }
}