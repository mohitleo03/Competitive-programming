import java.util.Scanner;
public class Punched_cards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine();
        int T = Integer.parseInt(t);
        String[][] result = new String[T][];
        if( T >= 1 && T <=81 ){
            for(int i = 0 ; i < T ; i++ ){
                String RxC = scan.nextLine();
                String[] rxc = RxC.split(" ");
                int R = Integer.parseInt(rxc[0]);
                int C = Integer.parseInt(rxc[1]);
                String[] mini_result = new String[(R+C+1)*2];
                if( R >=2 && R <= 10 &&  C >=2 && C <= 10){
                    for(int j = 0 ; j < (R * 2) + 1 ; j++ ){
                        for( int k = 0 ; k < (C * 2) + 1 ; k++ ){
                            if( (j + k) <=1 || ( j == 1 && k == 1 ) ){
                                mini_result[j+k] = ".";
                            }
                        }
                        //mini_result[j];
                    }
                }
            }
        }
        scan.close();
    }
}
