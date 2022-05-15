
class MoreThreads2 {
    public static void main(String[] args){
        System.out.println("MAIN THREAD STARTS RUNNIN");

        MyThreadVer3 mythread1 = MyThreadVer3.createAndStart("CHILD THREAD N.1");
        MyThreadVer3 mythread2 = MyThreadVer3.createAndStart("CHILD THREAD N.2");
        MyThreadVer3 mythread3 = MyThreadVer3.createAndStart("CHILD THREAD N.3");

            System.out.print(",,");
            try {
                mythread1.thread.join();
                mythread2.thread.join();
                mythread3.thread.join();
            }
            catch (InterruptedException e){
                System.out.println("THAT MAIN THREAD HAS BEEN TERMINATED");
            }

        System.out.println("MAIN THREAD IS EXITING");
    }
}

public class MyThreadVer3 implements Runnable {
    Thread thread;

    MyThreadVer3(String name)
    {
        thread =  new Thread (this, name);
    }

    public static  MyThreadVer3 createAndStart(String name) {
        MyThreadVer3 myThreadVer3 = new MyThreadVer3(name);
        myThreadVer3.thread.start();
        return myThreadVer3;
    }

    public void run() {
        System.out.println(thread.getName()+ "START TO OPERATE");

        try {
            for (int count = 0; count < 10 ; count++)
            {
                Thread.sleep(100);
                System.out.println(thread.getName() + "EXECUTED, THE COUNTER VALUE: " + count);
            }
        }
        catch (InterruptedException e) {
            System.out.println(thread.getName()+ "HAS BEEN INTERRUPTED ");
        }
        System.out.println(thread.getName() + "RUNNING'S DONE");
    }
}

