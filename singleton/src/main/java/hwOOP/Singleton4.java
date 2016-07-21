package hwOOP;
//for jdk 1.5 above
enum Singleton4 {
    INSTANCE;  
    public static Singleton4 getInstance() {  
        return INSTANCE;  
    }  
  
    public void test() {  
        System.out.println("test");  
    }  
}  