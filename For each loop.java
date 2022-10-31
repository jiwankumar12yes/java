import java.util.*;
import java.util.ArrayList;
public class array_list {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list.size());
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list.size());
        for(int elem:list){
            System.out.print(list.get(elem)+" ");
        }
