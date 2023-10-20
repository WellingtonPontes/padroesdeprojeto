package one.digital.inovation.one.singleton;

public class SingletonEager {
    private static SingletonEager instacnia;

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
      
        return instacnia;
    }
}
