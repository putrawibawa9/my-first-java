package AnonymusMethod;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            public void greet() {
                System.out.println("Hello, World!");
            }
        };
        
      

    }
}
