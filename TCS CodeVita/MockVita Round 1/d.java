import java.util.*;

public class d {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();
        int G = Integer.parseInt(c);
        if(G>0 && G<100000){
            String bh = scan.nextLine();
            String[] BH = bh.split(" ");
            if(isValid(BH)){
                int B = Integer.parseInt(BH[0]);
                int H = Integer.parseInt(BH[1]);
                String gl = scan.nextLine();
                String[] GL = gl.split(" ");
                if(isValid(GL)){
                    Integer[] lengths = new Integer[G];
                    int sum_length = 0;
                    for(int i = 0 ; i < G ; i++){
                        lengths[i] = Integer.parseInt(GL[i]);
                        sum_length+=lengths[i];
                    }
                    scan.close();
                    int A = 0;
                    int temp = 0;




                    for( int j = 0 ; j < G ; j++){
                        for( int k = 0 ; k < G ; k++){
                            if(lengths[j]<=lengths[k]){
                                temp+= lengths[j]*B;
                                System.out.println("temp area"+temp);
                            }
                            else{
                                break;
                            }
                        }
                        if(temp>=A){
                            A = temp;
                            System.out.println("big area"+A);
                        }
                        temp = 0;
                    }

                    /*for( int j = 0 ; j < G ; j++){
                        for( int k = 0 ; k < G ; k++){
                            if(lengths[j]<=lengths[k]){
                                temp+= lengths[j]*B;
                                System.out.println("temp area"+temp);
                            }
                            else{
                                for( int l = 0 ; l < G ; l++){
                                    if(lengths[j]>=lengths[l]){
                                        temp+= lengths[j]*B;
                                        System.out.println("temp area"+temp);
                                    }
                                    else{
                                        break;
                                    }
                                }
                            }
                        }
                        if(temp>=A){
                            A = temp;
                            System.out.println("big area"+A);
                        }
                        temp = 0;
                    }*/



                    int result = (sum_length*B*H) - (A*H);
                    System.out.print(result);
                }
                else{
                    Invalid_Input();
                }
            }
            else{
                Invalid_Input();
            }
        }
        else{
            Invalid_Input();
        }
    }
    private static boolean isValid(String[] str) {
        for (int j = 1; j < str.length; j++) {
            char[] charArray = str[j].toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (!Character.isDigit(charArray[i])) {
                    return false;
                }
            }
        }
        return true;
    }
    private static void Invalid_Input(){
        System.out.println("Invalid Input");
    }
}
