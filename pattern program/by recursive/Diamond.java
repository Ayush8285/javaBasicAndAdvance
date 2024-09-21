public class Diamond {
    
    static void printSpace(int space){
        if(space == 0){
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }
    static void printStar(int currentRow){
        if(currentRow == 0){
            System.out.println();
            return;
        }
        System.out.print("*");
        printStar(currentRow-1);
    }
    static void printDiamond(int currentRow , int rows){
            if(currentRow>rows){
                return;
            }
            printSpace(rows-currentRow);
            printStar(2*currentRow-1);
            printDiamond(currentRow+1, rows);
            if(currentRow != rows){
                printSpace(rows-currentRow);
                printStar(2*currentRow-1);
            }
            
            
    }
    public static void main(String[] args) {
        printDiamond(1, 3);
    }
}
