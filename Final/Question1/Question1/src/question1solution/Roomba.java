package question1solution;


    public final class Roomba implements iRobot {
        int [][]room;
        int currentPositionX;
        int currentPositionY;
        Direction direction;

        public Roomba (int[][] room) {
            this.room = room;
            currentPositionX = 0;
            currentPositionY = 0;
            direction = Direction.DOWN;
        }

        @Override
        public boolean move() {
            int nextX = currentPositionX, nextY = currentPositionY;
            switch (direction) {
                case DOWN -> nextX = currentPositionX + 1;
                case UP -> nextX = currentPositionX - 1;
                case LEFT -> nextY = currentPositionY - 1;
                case RIGHT -> nextY = currentPositionY + 1;
            }
            if (room[nextX][nextY] == -1) {
                // Blocked
                return false;
            }
            this.currentPositionX = nextX;
            this.currentPositionY = nextY;
            return true;
        }

        @Override
        public void turnLeft() {
            Direction newDirection;
            switch (direction) {
                case DOWN -> newDirection = Direction.RIGHT;
                case UP -> newDirection = Direction.LEFT;
                case LEFT -> newDirection = Direction.DOWN;
                case RIGHT -> newDirection = Direction.UP;
                default -> newDirection = direction;
            }
            this.direction = newDirection;
        }

        @Override
        public void turnRight() {
            Direction newDirection;
            switch (direction) {
                case DOWN -> newDirection = Direction.LEFT;
                case UP -> newDirection = Direction.RIGHT;
                case LEFT -> newDirection = Direction.UP;
                case RIGHT -> newDirection = Direction.DOWN;
                default -> newDirection = direction;
            }
            this.direction = newDirection;

        }

        @Override
        public void clean() {
            this.room[currentPositionX][currentPositionY] = 1;
        }
    }