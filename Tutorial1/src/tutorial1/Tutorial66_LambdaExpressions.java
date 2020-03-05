
package tutorial1;
interface Executable{
    void execute();
}
class Runner{
    public void run(Executable e){
        System.out.println("Executing Code block...");
       // int value = e.execute();
        System.out.println("Return Value is:"+value);
    }
}


//() -> System.out.println("Hello there");

/*
()-> {
            System.out.println("This is code passed in a lambda expression");
            System.out.println("Hello there");
                                
        }
*/
public class Tutorial66_LambdaExpressions {
    public static void main(String[] args) {
        Runner runner=new Runner();
        runner.run(() -> {
            System.out.println("Hello There.");
            return 7;
        });
        
        System.out.println("===============================");
        
        runner.run(()-> {
            System.out.println("This is code passed in a lambda expression");
            System.out.println("Hello there");
            return 8;
        });
    }
}
