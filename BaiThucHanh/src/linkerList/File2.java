package linkerList;

import java.util.LinkedList;

public class File2 {
    public static void addList(LinkedList<String> list) {
        //addALL
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Orange");
        list1.add("Grapes");
        
        list1.addAll(list);
        //retainall
        
        list1.retainAll(list);

        
        System.out.println(".....");
        for (String item : list1) {
            System.out.println(item);
   
        }
    }
    
}
