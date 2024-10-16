package creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DriverClass {
    public static void main(String[] args) throws InterruptedException {
//        Prints different address, hence creating new instance everytime
        System.out.println(new TVSet());
        System.out.println(new TVSet());


//        This works but not thread safe
        System.out.println(TVSetSingleton.getTVSetInstance());
        System.out.println(TVSetSingleton.getTVSetInstance());


        ExecutorService executorService = Executors.newFixedThreadPool(2);

//        both threads trying to access the instance in parallel there is high chance it will create two instances
//        Hence this implementation is not thread safe.
//        Remember static variables are stored in heap memory which is shared memory
        executorService.execute(() -> TVSetSingleton.getTVSetInstance());
        executorService.execute(() -> TVSetSingleton.getTVSetInstance());
        System.out.println("DONE");

        executorService.shutdown();

    }
}
