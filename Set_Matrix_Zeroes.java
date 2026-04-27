//原地算法 一遍过

public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        int firstRow = 0;
        int firstColumn = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i < n;i++){
            if(matrix[0][i] == 0){
                firstRow = 1;
                break;
            }
        }
        for(int i = 0;i < m;i++){
            if(matrix[i][0] == 0){
                firstColumn = 1;
            }
        }
        for(int i = 1;i < m;i++){
            for(int j = 1;j < n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1;i < n;i++){
            if(matrix[0][i] == 0){
                for(int j = 1;j < m;j++){
                    matrix[j][i] = 0;
                }
            }
        }
        for(int i = 1;i < m;i++){
            if(matrix[i][0] == 0){
                for(int j = 1;j < n;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRow == 1){
            for(int i = 0;i < n;i++){
                matrix[0][i] = 0;
            }
        }
        if(firstColumn == 1){
            for(int i = 0;i < m;i++){
                matrix[i][0] = 0;
            }
        }
    }
}
