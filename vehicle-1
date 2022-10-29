package oops2;
import java.util.*;
public class vehicle {
    public static void main(String args[]){
       // Scanner s=new Scanner(System.in);
        vehicle_class v=new vehicle_class();
        v.print();
        //super.print();
        v.colour="black";
        v.maxSpeed=10;

        car c=new car();
        c.gear=10;
        c.colour="red";
        c.print();
    }
    
}
class vehicle_class{
    String colour;
    int maxSpeed;
    public void print(){
        System.out.println("vehicle colour : "+colour);
        System.out.println("vehicle maxSpeed : "+maxSpeed);
    }
}
class car extends vehicle_class{
    int gear;
    public void print(){
        System.out.println("car colour : "+colour);
        System.out.println("car colour : "+maxSpeed);
        System.out.println("car colour : "+gear);
    }
}
