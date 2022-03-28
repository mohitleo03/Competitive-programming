import java.io.BufferedReader;
import java.io.InputStreamReader;

public class c {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            try{
        String N = reader.readLine();
        int n = Integer.parseInt(N);
        String STR = reader.readLine();
            String M = reader.readLine();
            int m = Integer.parseInt(M);
                String subsets = reader.readLine();
                String[] splitArray = subsets.split(" ");
                    int[] s = new int[splitArray.length];
                    for (int i = 0; i < splitArray.length; i++) {
                        s[i] = Integer.parseInt(splitArray[i]);
                    }
                    int result = 0;
                    for(int i = 0 ; i < s.length ; i++){
                        for( int j = 0 ; j<STR.length()-s[i]+1 ; j++){
                            result+= palindrome(STR.substring(j, j+s[i]));
                        }
                    }
                    System.out.println(result);
            }
            catch( Exception err){
                System.out.println(err);
            }
    }

    public static int palindrome(String str) {
        String reverseStr = "";
        int strLength = str.length();
        for ( int i = strLength - 1; i >= 0; i-- )  
        reverseStr = reverseStr + str.charAt(i);  
        if (str.equals(reverseStr))  
            return 1;
        else  
            return 0; 
    }
}