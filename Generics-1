package oops2;

public class generics {
    public static void main(String args[]){
        pair p=new pair(10, 020);
        // System.out.println(pair());
        p.print();
        p.setfirst(100);
        System.out.println(p.getfirst()+","+p.getsecond());
       
    }
    
}
class pair{
    private int first;
    private int second;
    public pair(int first,int second){
        this.first=first;
        this.second=second;
    }
    public int getfirst(){
        return first;
    }
    public int getsecond(){
        return second;
    }
    public void setfirst(int first){
        this.first=first;
    }
    public void setsecond(int second){
        this.second=second;
    }
    public final void print(){
        System.out.println(first+","+second);
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

