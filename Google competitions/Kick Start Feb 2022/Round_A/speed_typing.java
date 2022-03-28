import java.util.Scanner;
/*
Sample Input - 
2   //test cases
Ilovecoding //orignal string
IIllovecoding   //string written by typer
KickstartIsFun  //orignal string
kkickstartiisfun    //string written by typer


*/

public class speed_typing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String test = scan.nextLine();
        int t = Integer.parseInt(test);
        int[] result = new int[t];
        if(t>=1 && t<=100){
            for( int m = 0 ; m<t ; m++ ){
                int miss_typed = 0;
                String I = scan.nextLine();
                String P = scan.nextLine();
                String[] orignal = P.split("");
                String[] speed_typed = I.split("");
                String[] extracted = new String[orignal.length];
                if(speed_typed.length<orignal.length){
                    result[m] = -1;
                }
                else{
                    
                }
            }
        }
        for(int i = 0 ; i<t ; i++){
            if(result[i]==-1){
                System.out.println("Case #"+(i+1)+": IMPOSSIBLE");
            }
            else{
                System.out.println("Case #"+(i+1)+": "+result[i]);
            }
        }
        
        scan.close();
    }
}
