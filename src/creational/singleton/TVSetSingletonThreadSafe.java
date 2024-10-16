package creational.singleton;

import java.util.Objects;

public class TVSetSingletonThreadSafe {
    private static TVSetSingletonThreadSafe instance = null;
    private TVSetSingletonThreadSafe() {
        System.out.println("TV SET instantiated");  // should only print print once
    }

//    This works but have performance issue - whole function is sync even when object is instantiated
//    the subsequents has to get instance sequnetially, also this function may also have some other business logic
    public static synchronized TVSetSingletonThreadSafe getTVSetInstance() {
        if (Objects.nonNull(instance)) {
            return instance;
        }
        instance = new TVSetSingletonThreadSafe();
        return instance;
    }

// Double check implementation
    public static TVSetSingletonThreadSafe getTVSetInstance2() {
        if (Objects.nonNull(instance)) {
            return instance;
        }
        synchronized (TVSetSingletonThreadSafe.class) {
            instance = new TVSetSingletonThreadSafe();
            return instance;
        }
    }

}
