public class Rhombus {
    
    static void printSpace(int space){
        if(space == 0){
            return;
        }
        System.out.print(" ");
        printSpace( space-1);
    }

    static void printStar(int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }

    static void printRhombus(int currentRow , int star){
        if(currentRow > star){
            return;
        }
        printSpace(star - currentRow);
        printStar(star);
        System.out.println();
        printRhombus(currentRow+1 , star);

    }
    public static void main(String[] args) {
        printRhombus(0, 4);
    }
}
