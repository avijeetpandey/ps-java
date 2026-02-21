package neetcode.binary_search;

public class SearchIn2DMatrix {
    // this is brute force but it will struggle on the long run
    public static boolean searchBruteForce(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for(int j=0; j< row.length; j++) {
                if(row[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

        public static boolean binarySearchMatrix(int[][] matrix, int target) {
        for(int i=0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int left = 0;
            int right = row.length - 1;
            while(left <= right) {
                int mid = (int) Math.floor((left+right)/2);
                if(row[mid] == target) {
                    return true;
                } else if (target > row[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1}};
        boolean result = binarySearchMatrix(matrix, 1);
        System.out.println(result);
    }
}
