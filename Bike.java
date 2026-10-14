public class Bike implements Vehicle{
    @Override
    public String getName(){
        return "Bike";
    }
    @Override
    public int getnumberofwheels(){
        return 2;
    }
    @Override
    public String getcapacity(){
        return " 2 persons";
    }

}