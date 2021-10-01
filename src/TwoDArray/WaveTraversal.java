package TwoDArray;

public class WaveTraversal {
    public void solve(int[][] arr) {
        int col = arr[0].length;
        int row = arr.length;
        // wave traversal
        for (int c = 0; c < col; c++) {
            if(c % 2 == 0) {
                for (int r = 0; r < row; r++) {
                    System.out.println(arr[r][c]);
                }
            } else {
                for (int r = row - 1; r >= 0; r--) {
                    System.out.println(arr[r][c]);
                }
            }

        }
    }
}
