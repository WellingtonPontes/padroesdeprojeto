package one.digital.inovation.one.singleton;

public class SingletonLazyHolder {

    private static class Holder{
        public static SingletonLazyHolder instacnia = new SingletonLazyHolder();
    }
    

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        
        return Holder.instacnia;
    } 
}
