package PracticeArrays;

import java.util.Arrays;
import java.util.HashMap;

public class Poblem1 {
    public static void main (String [] args) {
        int[] arr = {2, 4, 6, 7, 8, 11};
        int target = 14;
        // target = 14
        // Bruteforce approach
        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    continue;
                }
                if(arr[i]+arr[j]==target){
                    System.out.println(i + " " +j);

                }
            }
        }*/
        // better approach-- > using map
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int moreneeded = target - arr[i];
            if (hmap.containsKey(moreneeded)) {

                ans[0] = hmap.get(moreneeded);
                ans[1] = i;

            }
            hmap.put(arr[i], i);



        }
        System.out.println(Arrays.toString(ans));
    }


}
