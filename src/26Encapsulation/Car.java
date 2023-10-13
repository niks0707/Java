public class Car{
    private String make;
    private int year;

    Car(String make, int year){
        // this.make = make;
        // this.year = year;
        // OR
        this.setMake(make);
        this.setYear(year);
    }

    // overloaded constructor for copying object
    Car(Car x){
        // this.setMake(x.getMake());
        // this.setYear(x.getYear());

        // OR
        copy(x);
    }

    public String getMake(){
        return make;
    }

    public int getYear(){
        return year;
    }

    void setMake(String make){
        this.make = make;
    }

    void setYear(int year){
        this.year = year;
    }

    void copy(Car x){
        this.setMake(x.getMake());
        this.setYear(x.getYear());
    }
}