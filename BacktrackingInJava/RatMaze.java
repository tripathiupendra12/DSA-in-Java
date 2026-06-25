public class RatMaze {
    public static int N;

    public static boolean isSafe(int maze[][], int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1;
    }

    public static void printSolution(int sol[][]) {
        for(int i = 0; i < sol.length; i++) {
            for(int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean solveMaze(int maze[][]) {
        N = maze.length;
        int sol[][] = new int[N][N];

        if(!solve(maze, 0, 0, sol)) {
            System.out.println("No Solution");
            return false;
        }

        printSolution(sol);
        return true;
    }

    public static boolean solve(int maze[][], int x, int y, int sol[][]) {
        // Base Case
        if(x == N-1 && y == N-1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // check valid
        if(isSafe(maze, x, y)) {
            sol[x][y] = 1; //choose this cell

            //Move Right
            if(solve(maze, x, y+1, sol)) {
                return true;
            }

            // Move Down 
            if(solve(maze, x+1, y, sol)) {
                return true;
            }

            // backtrack
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = { {1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 1, 1, 1}};
        solveMaze(maze);
    }
}