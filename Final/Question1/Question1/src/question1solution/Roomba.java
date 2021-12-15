package question1solution;

public class Roomba implements iRobot {
    int[][] room;
    Main.Direction dir;

    public Roomba(int[][] room) {
        this.room = room;
        this.dir = Main.Direction.DOWN;
    }

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void clean() {

    }
}
