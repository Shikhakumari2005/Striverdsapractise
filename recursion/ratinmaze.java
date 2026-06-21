import java.util.*;
public class ratinmaze {

      ArrayList<String> ans = new ArrayList<>();

    public static void solve(int[][] maze, int i, int j,
                             int n, String path, boolean[][] visited) {

        // Destination reached
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        visited[i][j] = true;

        // Down
        if (i + 1 < n && maze[i + 1][j] == 1 && !visited[i + 1][j]) {
            solve(maze, i + 1, j, n, path + "D", visited);
        }

        // Left
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && !visited[i][j - 1]) {
            solve(maze, i, j - 1, n, path + "L", visited);
        }

        // Right
        if (j + 1 < n && maze[i][j + 1] == 1 && !visited[i][j + 1]) {
            solve(maze, i, j + 1, n, path + "R", visited);
        }

        // Up
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && !visited[i - 1][j]) {
            solve(maze, i - 1, j, n, path + "U", visited);
        }

        // Backtrack
        visited[i][j] = false;
    }

    public static ArrayList<String> findPath(int[][] maze, int n) {

        ans.clear();

        if (maze[0][0] == 0)
            return ans;

        boolean[][] visited = new boolean[n][n];

        solve(maze, 0, 0, n, "", visited);

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        int n = maze.length;

        ArrayList<String> result = findPath(maze, n);

        if (result.size() == 0) {
            System.out.println("No Path Found");
        } else {
            System.out.println("Possible Paths:");
            for (String s : result) {
                System.out.println(s);
            }
        }
    }
}