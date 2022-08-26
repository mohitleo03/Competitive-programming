import java.util.Scanner;

public class CinemaTicketBookingMaxProfit {

    static int maxProfit(int N, int M, int[] A, int[] B) {
        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < M; i++) {
            int end = 0;
            int start = 0;
            int temp = 0;
            for (int j = 0; j < N - B[i]-1; j++) {
                for (int k = j; k < B[i]; k++) {
                    temp += A[k];
                }
                if (temp > max) {
                    start = j;
                    end = j + B[i];
                    max = temp;
                    System.out.println("max is "+max);
                }
                for (int x = start; x < end; x++) {
                    A[x] = 0;
                }
            }
            result += max;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        int M = scan.nextInt();
        scan.nextLine();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = scan.nextInt();
        }
        int max = maxProfit(N, M, A, B);
        System.out.println("max profit is " + max);
        scan.close();
    }
}
