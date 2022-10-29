package oops2;
//import java.util.*;

// import javax.swing.text.AttributeSet.ColorAttribute;
public class vehicle2 {
    public static void main(String args[]){
        //System.out.println("Hello");
        //Scanner s=new Scanner(System.in);
        vehicle2_class v=new vehicle2_class("bike","black");
        v.color="red";
        v.tyre=6;
        v.set(160);
        v.print();
        // v.get();
        vehicle2_class v1=new truck();
    }
    
}
class vehicle2_class{
    public String color;
    int tyre;
    protected String name;
    private int  max_speed;
    public void set(int max_speed){
        this.max_speed=max_speed;
    }
    public int get(){
        
        return this.max_speed;
    }
    public vehicle2_class(String name,String color ){
        System.out.println("this is vehicle constructor");
    }
    public void print(){
        System.out.println("vehicle name is : "+name +", tyre = "+tyre+" and color is "+color);
    }
}
class truck extends vehicle2_class{
    int num_gear;
    public void print(){
        System.out.println("color"+color);
        System.out.println("tyre"+tyre);
        System.out.println("name"+name);
        System.out.println("max_speed"+get());
        System.out.println("gear "+num_gear);

    }
    public truck( ){
        super("jiwan","red");
    }
    
}
