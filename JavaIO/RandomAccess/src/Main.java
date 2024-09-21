import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    private static final Map<Long, Long> indexedIds = new LinkedHashMap<>();
    private static int reecordsInFile = 0;

    static {
        try(RandomAccessFile rb = new RandomAccessFile("student.idx",
                "r");){
            loadIndex(rb,0);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {

        BuildStudentData.build("student", true);

        try(RandomAccessFile ra = new RandomAccessFile("student.dat","r")){
//            loadIndex(ra,0);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a Student Id or 0 to quit");
            while (s.hasNext()){
                long studentId = Long.parseLong(s.nextLine());
                if(studentId < 1){
                    break;
                }
                ra.seek(indexedIds.get(studentId));
                String targetedRecord = ra.readUTF();
                System.out.println(targetedRecord);
                System.out.println("Enter another Student Id or 0 to quit");

            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    private static void loadIndex(RandomAccessFile ra, int indexPosition){
        try{
            ra.seek(indexPosition);
            reecordsInFile = ra.readInt();
            System.out.println(reecordsInFile);
            for(int i = 0; i < reecordsInFile; i++){
                indexedIds.put(ra.readLong(), ra.readLong());
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}