package question1solution;

public class Main {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    };

    public static void main(String[] args) {
        int[][] room = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {-1, 0, 0, 0},
                {0, 0, -1, 0}

    };
        Robot robot = new Robot(room);
    }
}