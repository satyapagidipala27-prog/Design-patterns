public class Truck implements Vehicle{
    @Override
    public String getName(){
        return "Truck";
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