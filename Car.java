public class Car implements Vehicle{
    @Override
     public String getName(){
        return "Car";
    }
    @Override
    public int getnumberofwheels(){
        return 4;
    }
    @Override
    public String getcapacity(){
        return " 4 persons";
    }

}