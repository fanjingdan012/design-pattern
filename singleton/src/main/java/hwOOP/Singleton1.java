package hwOOP;

//non lazy load
//no multi-thread problem, but will cause longer loading time
public class Singleton1 {  
    private Singleton1(){}  
      

    private static Singleton1 instance = new Singleton1();  
      

    public static Singleton1 getInstance() {  
        return instance;  
    }  
} 