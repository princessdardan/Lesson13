
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    
    static ArrayList list = new ArrayList();
    static ListIterator li;
    static int pos=0;
    
    public static void main(String[] args){
        list.add("a");
        list.add("b");
        list.add("c");
        li = list.listIterator();
        //move 1
        System.out.println("1-Move over items: "+ li.next());
        pos++;
        //move 2
        System.out.println("2-Move over items: "+ li.next());
        pos++;
        //move 3 
        System.out.println("3-Remove something ");
        li.remove();
        pos--;
        //move 4
        System.out.println("4-Add b back in");
        li.add("b");
        //move 5
        System.out.println("5-Move over item: "+li.next());
        pos++;
        //move 6
        System.out.println("6-Move over item: "+li.previous());
        pos--;
        //move 7
        System.out.println("7-Remove last item seen");
        li.remove();
        //move 8
        System.out.println("8-Move back over item: " + li.previous());
        pos--;
        //move 9
        System.out.println("9-Set last thing seen to e");
        li.set("e");
        //move 10
        System.out.println("10- Add b back in the left of li");
        li.add("b");
        pos++;
        //move 11
        System.out.println("11- Add c back to left of li");
        pos++;
        //move 12
        System.out.println("12- Try to remove something, wont work");
        //li.remove();
        //move 13
        System.out.println("13- Move over item: "+ li.next());
        pos++;
        //move 14
        System.out.println("14- Try to move past end of list - wont work" + li.next());
        pos++; 
        showList();
    }
    
    public static void showList()
    {
        for(int x=0; x<list.size(); x++)
        {
            if (x==pos) System.out.print("*");
            System.out.print(list.get(x));
        }
        if(pos==list.size())System.out.println("*");
        System.out.println("");//print to a new line 
    }
    
}
