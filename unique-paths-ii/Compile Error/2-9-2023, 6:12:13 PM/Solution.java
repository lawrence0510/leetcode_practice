// https://leetcode.com/problems/unique-paths-ii

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][i] == 1){
                obstacleGrid[0][i] = 0;
            }
            else{
                obstacleGrid[0][i] = 1;
            }
        }
        for(int i = 1 ; i < obstacleGrid.length; i ++){
            for(int j = 1 ; j < obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] != 1){//如果不是障礙物就執行相加
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
                else{
                    obstacleGrid[i][j] = 0 ;
                }
            }
        }
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}