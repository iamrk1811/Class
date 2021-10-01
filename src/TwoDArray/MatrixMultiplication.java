package TwoDArray;

public class MatrixMultiplication {
    public int[][] multiply(int[][] table1, int[][] table2) {
        int row1 = table1.length;
        int col2 = table2[0].length;
        int col1 = table1[0].length;

        int[][] res = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int z = 0; z < col1; z++) {
                    res[i][j] += table1[i][z] * table2[z][j];
                }
            }
        }

        return res;
    }
}
