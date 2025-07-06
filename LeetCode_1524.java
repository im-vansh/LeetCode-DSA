import java.util.*;
public class LeetCode_1524{
    public int numOfSubarrays(int[] a) {
        int n=a.length,i,sum=0,odd=0,even=1;
        long mod=(long)1e9+7,ans=0;
        for(i=0;i<n;i++)
        {
            sum+=a[i];
            if(sum%2==0)
            {
                ans+=odd;
                even++;
            }
            else
            {
                ans+=even;
                odd++;
            }
            ans=ans%mod;
        }
        return (int)ans;
    }
    public boolean doesValidArrayExist(int[] derived) {
        int ans=0;
        for(int it:derived) ans^=it;
        return (ans==0);
    }
    public static void main(String args[]){

    }
}