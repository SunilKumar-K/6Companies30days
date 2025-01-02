class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;    
        int n = img[0].length;
        int[][] result = new int[m][n];
        
        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;  // Sum of values in the grid
                int count = 0; // Count of valid cells
                
                // Check all neighbors and the current cell
                for (int k = 0; k < 9; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    
                    // Check if the neighbor is within bounds
                    if (x >= 0 && x < m && y >= 0 && y < n) {
                        sum += img[x][y];
                        count++;
                    }
                }
                
                result[i][j] = sum / count;
            }
        }
        
        return result;
    }
}