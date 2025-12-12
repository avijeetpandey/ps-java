package leetcode;

import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
        int zc = 0;
        int oc = 0;
        int tc = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zc++;
            }

            if(arr[i]==1){
                oc++;
            }

            if(arr[i]==2){
                tc++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(zc > 0) {
                arr[i] = 0;
                zc--;
            } else if(oc > 0) {
                arr[i] = 1;
                oc--;
            } else if(tc > 0) {
                arr[i] = 2;
                tc--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
