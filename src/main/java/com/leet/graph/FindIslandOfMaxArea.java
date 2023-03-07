package com.leet.graph;

public class FindIslandOfMaxArea {

    public static void main(String[] args)
    {
        final var grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}
                , {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}
                , {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}
                , {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        System.out.println(maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    private static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int area = 1;
        area += dfs(grid, i + 1, j);
        area += dfs(grid, i - 1, j);
        area += dfs(grid, i, j + 1);
        area += dfs(grid, i, j - 1);
        return area;
    }

}
