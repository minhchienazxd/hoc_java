package linkerList;

import java.util.LinkedList;

public class File1 {
    public static void main(String[] args) {
        
        LinkedList<String> list0 = new LinkedList<>();
        list0.add("Apple");
        list0.add("Banana");
        
        File2.addList(list0);
        list0.retainAll(list0);
   
    }
}
 
    

