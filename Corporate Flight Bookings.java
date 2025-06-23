import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList < Integer > corpFlightBookings(ArrayList < ArrayList < Integer >> bookings, int n) {
       int[] arr=new int[n];
      for(ArrayList<Integer> a:bookings){
          int f=a.get(0);
          int s=a.get(1);
          int d=a.get(2);
          for(int i=f;i<=s;i++){
              arr[i-1]+=d;
          }

      }
      ArrayList<Integer> b=new ArrayList<>();
      for(int i:arr){
          b.add(i);
      }
      return b;
    }
}