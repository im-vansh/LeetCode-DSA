import java.util.*;
public class LeetCode_1079{
        public int Perm(int n, int[] freq, int fz) {
        if (n == 1) {
            int count = 0;
            for (int f : freq) {
                if (f > 0) count++;
            }
            return count;
        }
        int ans = 0;
        for (int i = 0; i < fz; i++) {
            if (freq[i] > 0) {
                freq[i]--;
                ans += Perm(n - 1, freq, fz);
                freq[i]++;
            }
        }
        return ans;
    }
    public int numTilePossibilities(String tiles) {
        int sz = 0, tz = tiles.length();
        int[] freq = new int[26];
        for (char c : tiles.toCharArray()) {
            if (++freq[c - 'A'] == 1) sz++;
        }
        Arrays.sort(freq);
        reverseArray(freq);
        freq = Arrays.copyOf(freq, sz);

        int cnt = 0;
        for (int len = 1; len <= tz; len++) {
            cnt += Perm(len, freq, sz);
        }
        return cnt;
    }
    public void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String args[]){

    }
}