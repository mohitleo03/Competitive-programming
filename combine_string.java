import java.util.*;
public class combine_string {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter orignal string");
        String orignal = scan.nextLine();
        System.out.println("enter alphabet to be added");
        String add = scan.nextLine();
        String[] temp = orignal.split("");
        String[][] result = new String[orignal.length() + 1][orignal.length() + 1];
        for(int i = 0 ; i <=orignal.length(); i++){
            for(int j = 0 ; j <=orignal.length() ; j++){
                if(i==j){
                    result[i][j] = add;
                    for(int k = j ; k < orignal.length() ; k++){
                        result[i][k+1] = temp[k];
                    }
                    break;
                }
                else{
                    result[i][j] = temp[j];
                }
            }
        }
        scan.close();
        for(int i = 0 ; i <= orignal.length() ; i++){
            for(int j = 0 ; j <=orignal.length() ; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    } 
}
