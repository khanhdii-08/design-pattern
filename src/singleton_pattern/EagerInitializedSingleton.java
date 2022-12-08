package singleton_pattern;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World Eager");
    }

}
