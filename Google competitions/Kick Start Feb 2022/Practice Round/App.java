import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();
        int T = Integer.parseInt(c);
        Integer[] y = new Integer[99];
        for(int i = 0; i < T; i++) {
            String a = scan.nextLine(); // "7 3" N = 7;M = 3;
            String[] b = a.split(" ");
                int N = Integer.parseInt(b[0]);
                int M = Integer.parseInt(b[1]);
                String q = scan.nextLine();
                String[] r = q.split(" ");
                int sum = 0;
                for (int j = 0; j < r.length; j++) {
                    int C = Integer.parseInt(r[j]);
                    sum += C;
                }
                y[i] = sum % M;
            }
        for(int k = 0; k < T; k++) {
            System.out.println("Case #" + (k + 1) + ": " + y[k]);
        }
        scan.close();
    }
}
