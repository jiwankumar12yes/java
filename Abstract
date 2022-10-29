package oops2;
import java.util.*;
public class abstract_cls_fun {
    public static void main(String args[]){
        car c=new car();
        c.maxSpeed=100;
        c.clr="red";
        c.gear=6;
        c.isMotorized();
        c.tyre=4;
        System.out.println(c.maxSpeed);
        System.out.println(c.tyre);
        System.out.println(c.clr);
        System.out.println(c.isMotorized());

    }
    
}
abstract class  vehicle{
    int maxSpeed;
    String clr;
    public abstract boolean isMotorized();
    }
class car extends vehicle{
    static int tyre;
     static int gear;
    public boolean isMotorized(){
        return false;
    }
    // public car(int tyre){
    //     this.tyre=tyre;
    // }
}
