import java.util.Scanner;

public class cf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long ans = (long) Math.sqrt(n);
            while (ans * ans > n) ans--;
            while (ans * ans < n)  ans++;
            System.out.println(ans - 1);
        }
    }
}
