public class NumberPattern2 {
    static void printSpace(int space){
        if(space == 0){
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }

    static void printNumber(int currentRow,int rows){
        if(currentRow == 0){
            return;
        }
        System.out.print(rows-currentRow+1);
        printNumber(currentRow-1,rows);

    }

    static void printNumberPattern(int currentRow,int rows){
        if(currentRow > rows){
            return;
        }
        printSpace(rows-currentRow);
        printNumber(currentRow,rows);
        System.out.println();
        printNumberPattern(currentRow+1, rows);
    }
    public static void main(String[] args) {
        printNumberPattern(1, 5);
    }
}
