import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);
        printThreadstate(currentThread);

        currentThread.setName("MainGuy");
        currentThread.setPriority(Thread.MAX_PRIORITY);
        printThreadstate(currentThread);


        CustomThread customThread = new CustomThread();
        customThread.start();

        Runnable myRunnable = () -> {
            for(int i = 0; i<= 8;i++){
                System.out.print(" 2 ");
                try {
                    TimeUnit.MILLISECONDS.sleep(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();

        for(int i = 0; i<= 3 ; i++){
            System.out.print(" 0 ");
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    public static void printThreadstate(Thread thread){

        System.out.println("---------------------");
        System.out.println("Thread ID: "  +thread.getId() );
        System.out.println("Thread Name: "  +thread.getName() );
        System.out.println("Thread Priority:  "  + thread.getPriority());
        System.out.println("Thread State:  "  +thread.getState() );
        System.out.println("Thread Group: " +thread.getThreadGroup());
        System.out.println("Thread Is Alive "  + thread.isAlive());
        System.out.println("---------------------");
    }
}