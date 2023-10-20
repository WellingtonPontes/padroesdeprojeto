package one.digital.inovation.one.singleton;

public class SingletonLazy {
    private static SingletonLazy instacnia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instacnia==null){
            instacnia = new SingletonLazy();
        }
        return instacnia;
    }
}
