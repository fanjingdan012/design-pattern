package hwOOP;

//lazy load
//multi-thread will cause 2 or more Singleton2 created
public class Singleton2 {  
    private Singleton2() {  
    }  
      
    private static Singleton2 instance = null;  

    public static Singleton2 getInstance() {  
        if (instance == null)  
            instance = new Singleton2();  
        return instance;  
    }  
}  