package oops2;

public class generics {
    public static void main(String args[]){
        generics_class<String> p=new generics_class<String>("ab", "cd");
        p.print();
        // p.setfirst("");
        // System.out.println(p.getfirst()+","+p.getsecond());
        generics_class<Integer> p1=new generics_class(12, 345);
        p1.print();
       
    }
    
}
class generics_class<T>{
    private T first;
    private T second;
    public generics_class (T first,T second){
        this.first=first;
        this.second=second;
    }
    public T getfirst(){
        return first;
    }
    public T getsecond(){
        return second;
    }
    public void setfirst(T first){
        this.first=first;
    }
    public void setsecond(T second){
        this.second=second;
    }
    public final void print(){
        System.out.println(first+","+second);
    }
}

