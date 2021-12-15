package question1solution;

public class Robot {
    int[][] room;
    Main.Direction dir;

    public Robot(int[][] room) {
    this.room = room;
    dir = Main.Direction.DOWN;
    }
}
