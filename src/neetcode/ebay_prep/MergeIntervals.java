package neetcode.ebay_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();

        for(int[] interval: intervals) {
            int startTime = interval[0];
            int endTime = interval[1];

            int lastEnd = output.get(output.size()-1)[1];
            
            if(startTime <= lastEnd) {
                output.get(output.size()-1)[1] = Math.max(endTime, lastEnd);
            } else {
                output.get(new int[]{startTime, endTime});
            }
        }

        return output.toArray(new int[output.size()][]);
    }
}
