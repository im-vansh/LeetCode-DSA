import java.util.*;
public class LeetCode_1092{
    public String shortestCommonSupersequence(String a, String b) {
        if (a.equals(b)) return a;
        String ns = lcs(a, b);
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        for (char c : ns.toCharArray()) {
            while (i < a.length() && a.charAt(i) != c) {
                sb.append(a.charAt(i));
                i++;
            }
            while (j < b.length() && b.charAt(j) != c) {
                sb.append(b.charAt(j));
                j++;
            }
            sb.append(c);
            i++;
            j++;
        }
        while (i < a.length()) {
            sb.append(a.charAt(i));
            i++;
        }
        while (j < b.length()) {
            sb.append(b.charAt(j));
            j++;
        }
        return sb.toString();
    }
    
    private String lcs(String a, String b) {
        int n = a.length(), m = b.length();
        if (n == 0 || m == 0) return "";
        String[][] dp = new String[n][m];
        dp[0][0] = (a.charAt(0) == b.charAt(0)) ? a.substring(0, 1) : "";
        for (int j = 1; j < m; j++) {
            dp[0][j] = (a.charAt(0) == b.charAt(j)) ? a.substring(0, 1) : dp[0][j-1];
        }
        for (int i = 1; i < n; i++) {
            dp[i][0] = (a.charAt(i) == b.charAt(0)) ? b.substring(0, 1) : dp[i-1][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    dp[i][j] = (dp[i-1][j-1] == null ? "" : dp[i-1][j-1]) + a.charAt(i);
                } else {
                    String left = (j > 0) ? dp[i][j-1] : "";
                    String up = (i > 0) ? dp[i-1][j] : "";
                    dp[i][j] = left.length() > up.length() ? left : up;
                }
            }
        }
        return dp[n-1][m-1];
    }
    public static void main(String args[]){

    }
}