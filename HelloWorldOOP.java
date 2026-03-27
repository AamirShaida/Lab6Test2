public class HelloWorldOOP {
     private final String message;

    //Constructor
    public HelloWorldOOP(String message) {
        this.message = message;
    }

    //Creating a method to print the message
    public void printMessage() {
        System.out.println("Message:" + this.message);
    }

    public static void main(String[] args) {
        HelloWorldOOP myObj = new HelloWorldOOP("Hello, World!");
        
        //Calling the method
        myObj.printMessage();
    }
}