package creational.singleton;

import java.util.Objects;

public class TVSetSingleton {
    private static TVSetSingleton instance = null;
    private TVSetSingleton() {
        System.out.println("TV SET instantiated");  // should only print print once
    }

    public static synchronized TVSetSingleton getTVSetInstance() {
        if (Objects.nonNull(instance)) {
            return instance;
        }
        instance = new TVSetSingleton();
        return instance;
    }

}
