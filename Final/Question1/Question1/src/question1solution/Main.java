package question1solution;

    public class Main {

        public static void printMatrix(int [][]room) {
            for(int i = 0; i < room.length; i++) {
                for (int j = 0; j < room[0].length; j++) {
                    System.out.print(room[i][j] + "   ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int [][]myRoom = new int[][] { {0 , 0, 0}, {0, 0, 0}, {0, -1, -1}};
            printMatrix(myRoom);

            Roomba roomba = new Roomba(myRoom);
            roomba.clean();
            System.out.println("After clearing first cell");
            printMatrix(myRoom);

            roomba.move();
            roomba.clean();
            roomba.move();
            roomba.clean();

            System.out.println("After clearing first column");
            printMatrix(myRoom);

            roomba.turnLeft();
            if (!roomba.move()) {
                System.out.println("Roomba can't move to 2,1 position");
            }

            roomba.turnLeft();
            roomba.move();
            roomba.turnRight();
            roomba.move();
            roomba.clean();
            roomba.move();
            roomba.clean();
            System.out.println("Cleaned second row as well");
            printMatrix(myRoom);

            roomba.turnLeft();
            roomba.move();
            roomba.clean();
            roomba.turnLeft();
            roomba.move();
            roomba.clean();
            System.out.println("Cleaned the entire room");
            printMatrix(myRoom);
        }
    }

