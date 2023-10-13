public class Pizza{
    String bread;
    String sauce;
    String cheese;

    // Constructor
    Pizza(String bread,String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }

    //  Overloaded Constructor
    Pizza(String bread,String sauce,String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
}