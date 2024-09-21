public class MirrorLeftPyramidRec {
    
    static void printSpace(int space , int counter){
        if(counter == 0){
            return;
        }
        System.out.print(" ");
        printSpace(space-1,counter-1);
    }
    static int starCount = 1;
    static void printStar(int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printStar(star-1);        
    }
    
    static void printLine(int rows,int cols){
        if(rows == 0){
            return;
        }
        printSpace(rows,cols-1);
        printStar(starCount++);
        System.out.println();
        printLine(rows-1,cols-1);
    }


    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        printLine(rows,cols);

    }
}
