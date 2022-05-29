import java.util.*;
class temp{
    public static void main(String[] args) {
     
      int  t = 1;
      for(int q=0; q<t; q++)
      {
          int n = 333;
          int c =n;
          int dinn =0;
          int sum=0;
          while(c>0)
{
    sum+=c%10;
    c=c/10;
    dinn++;
}          
          
          if(n%9==0)
          {
              n=n*10;
              System.out.println(n);
          }
          else {
              int ans=n;
          int d =dinn;
             int nearest= 0;
             if(sum>9)
             nearest = 9-sum%9;
             else
             nearest = 9-sum;
             boolean b=false;
              String s = Integer.toString(n);
             for(int i=0; i<s.length(); i++)
             {
                 double p1= Math.pow(10, dinn-1);
                 int p=(int)p1;
                 c=Character.getNumericValue(s.charAt(i));
                 if(c>nearest)
                 {
                   
                      p1= Math.pow(10, dinn);
                  p=(int)p1;
                    n= n+ nearest*p;
                     b =true;
                     break;
                 }
                 dinn--;
                 if(b)
                 break;
             }
             if(ans==n)
             { 
                 ans=n*10+nearest;
                 System.out.println(ans);
             }
             else
              System.out.println(n);
          }
      }
      
    }
} 
