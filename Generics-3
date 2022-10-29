package oops2;

public class generics {
    public static void main(String args[]){
        generics_class2<String,Integer> p=new generics_class2<>("BR", 53);
        p.print();
        // p.setfirst("");
        // System.out.println(p.getfirst()+","+p.getsecond());
        generics_class2<Integer,Integer> p1=new generics_class2(12, 345);
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
class generics_class2<T,V>{
    private T first;
    private V second;
    public generics_class2 (T first,V second){
        this.first=first;
        this.second=second;
    }
    public T getfirst(){
        return first;
    }
    public V getsecond(){
        return second;
    }
    public void setfirst(T first){
        this.first=first;
    }
    public void setsecond(V second){
        this.second=second;
    }
    public final void print(){
        System.out.println(first+" "+second);
    }
}

