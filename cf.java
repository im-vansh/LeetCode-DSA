import java.util.*;
 
public class cf {
     // <-----------Check Prime------------>
     public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
 
    public static boolean isPrime(long n) {
        if (n <= 2)
            return false;
        if (n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; (long) i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
 
    // <-------------GCD-------------->
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 
    public static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 
    // <---------PowerOf2--------------->
    public static boolean isPowerOfTwo(int x) {
        return x != 0 && ((x & (x - 1)) == 0);
    }
 
    // <------------LCM---------------->
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
 
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
 
    // <---------String isSubsequence or not---------------->
    public static boolean Subsequence(String s1, String s2) {
        int n1 = s1.length(), m = s2.length();
        int i = 0, j = 0;
        while (i < n1 && j < m) {
            if (s1.charAt(i) == s2.charAt(j))
                i++;
            j++;
        }
        return i == n1;
    }
 
    // <----------Factorial------------>
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
 
    public static long factorial(long n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    private static String findOddDivisors(long n, int d) {
        long factorialCount = calculateFactorialDigitCount(n);
        StringBuilder oddDivisors = new StringBuilder();
 
        for (int odd = 1; odd <= 9; odd += 2) {
            if (d % odd == 0) {
                oddDivisors.append(odd);
            }
        }
 
        return oddDivisors.toString();
    }
 
    private static long calculateFactorialDigitCount(long n) {
        double logSum = 0;
        for (long i = 1; i <= n; i++) {
            logSum += Math.log10(i);
        }
        return (long) logSum + 1;
    }
 
 
    private static int lb(List<Integer> list, int key) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) < key) low = mid + 1;
            else high = mid;
        }
        return low;
    }
 
    private static int up(List<Integer> list, int key) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= key) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    
    private static long countTrailingZeros(long num) {
        long count = 0;
        while (num % 2 == 0 && num > 0) {
            num /= 2;
            count++;
        }
        return count;
    }

    public static final long M = 998244353;

    public static long mod(long b, long exp) {
        long ans = 1;
        b %= M;
        while(exp>0) {
            if ((exp&1) == 1) ans = (ans*b)%M;
            b = (b * b) % M;
            exp>>=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n%2==0) System.out.println("-1");
            else{
                for(int i=1; i<=n; i++){
                    int x = (2*i)%n;
                    if(x==0) x=n;
                    System.out.print(x+(i==n?"\n":" "));
                }
            }
        }
    }
}