import java.util.Scanner;

/*
Problem Statement - 

One number will be given
3 task to perform
I - Add a digit in this number
II - the new number after adding digit sould be divisible by 9
III - the number should be smallest of all possible numbers
*/


public class challenge_nine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String test_cases = scan.nextLine();
        int tc = Integer.parseInt(test_cases);
        int main_result[] = new int[100];
        for( int t = 0 ; t < tc ; t++ ){
            String orignal = scan.nextLine();
            String[] temp = orignal.split("");
            String new_num = "";
            int sum = 0;
            for(int i = 0 ; i < temp.length; i++)
            sum+=Integer.parseInt(temp[i]);
            if((sum%9)==0){
                new_num+=temp[0];
                new_num+="0";
                for(int k = 1 ; k < orignal.length() ; k++)
                    new_num+=temp[k];
                main_result[t] = Integer.parseInt(new_num);
            }
            else{
                int add = 9-(sum%9);
                int count = 0;
                for(int i = 0 ; i < orignal.length();i++){
                    if(Integer.parseInt(temp[i])>add && count == 0){
                        new_num+=""+add;
                        new_num+=temp[i];
                        count++;
                    }
                    else{
                        new_num+=temp[i];
                    }
                    if(i==orignal.length()-1 && count ==0){
                        new_num+=""+add;
                    }
                }
                main_result[t] = Integer.parseInt(new_num);
            } 
        }
        scan.close();
        for(int i = 0 ; i<tc ; i++)
            System.out.println("Case #"+(i+1)+": "+main_result[i]);
    }
}


/*

Old Solution

public class challenge_nine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String test_cases = scan.nextLine();
        int tc = Integer.parseInt(test_cases);
        int main_result[] = new int[100];
        for( int t = 0 ; t < tc ; t++ ){
            String orignal = scan.nextLine();
            String[] temp = orignal.split("");
            String[][] result = new String[orignal.length() + 1][orignal.length() + 1];
            String new_num = "";
            int sum = 0;
            for(int i = 0 ; i < temp.length; i++)
            sum+=Integer.parseInt(temp[i]);
            if((sum%9)==0){
                new_num+=temp[0];
                new_num+="0";
                for(int k = 1 ; k < orignal.length() ; k++)
                    new_num+=temp[k];
                main_result[t] = Integer.parseInt(new_num);
                
            }
            else{
                int min = 0;
                for(int i = 0 ; i <=orignal.length(); i++){
                    min+=9*(Math.pow(10,i));
                }
                int add = 9-(sum%9);
                for(int i = 0 ; i <=orignal.length(); i++){
                    for(int j = 0 ; j <=orignal.length() ; j++){
                        if(i==j){
                            result[i][j] = ""+add;
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
                String temp_num = "";
                for(int i = 0 ; i <=orignal.length(); i++){
                    for(int j = 0 ; j <=orignal.length() ; j++){
                        temp_num+=result[i][j];
                    }
                    if(min>Integer.parseInt(temp_num)){
                        min=Integer.parseInt(temp_num);
                    }
                    temp_num = "";
                }
                main_result[t] = min;
            } 
        }
        scan.close();
        for(int i = 0 ; i<tc ; i++)
            System.out.println("Case #"+(i+1)+": "+main_result[i]);
    }
}*/
/*
num = str(834)
print(num)
sum = 0
for digit in num:
    sum=sum+int(digit)
mod = sum%9
if mod == 0:
    print(num)
else:
    n = 9-mod
    for x in range(len(num)):
        if(n>=int(num[x])):
            print(num[::-1].replace(str(num[x]), str(n)+str(num[x]), 1)[::-1])
            exit(0)
*/