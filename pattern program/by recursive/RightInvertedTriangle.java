public class RightInvertedTriangle {
    static void printSpace(int space){
        if(space == 0){
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }

    static void printStar(int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }

    static void printRightInvertedTriangle(int currentRow, int rows){
        if(rows == 0){
            return;
        }
        printSpace(currentRow-1);
        printStar(rows);
        System.out.println();
        printRightInvertedTriangle(currentRow+1, rows-1);
    }

    public static void main(String[] args) {
        printRightInvertedTriangle(1, 4);
    }
}
