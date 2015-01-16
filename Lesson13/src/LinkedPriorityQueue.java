import java.util.ArrayList;
public class LinkedPriorityQueue {
    private ArrayList list[]; //an array of ArrayLists
    private int size; //refers to number of priorities
    
    public LinkedPriorityQueue(int s){
        size = s;
        list = new ArrayList[size]; //establish how many lists
        for (int x = 0; x < size; x++){
            list[x]=new ArrayList(); //instantiate each list
        }
    }
    public Object dequeue(){
        //is identical to peekFront, but you remove from
        //the first non-empty list instead of just get
        if (list[0].isEmpty())
            if list[1].isEmpty(){
                return list[2].remove
            }
			
		return list.remove(0);
    }
    public void enqueue(Object o){
        //required to satisfy implementation of parent interface Queue
        throw new IllegalStateException("Must give a priority");
    }
    public void enqueue(Object o, int i){
        //given priority "i", add to the correct list
        list[i].add(o);
    }
    public int size(){
        //refers to the number of priorities 
        return list.length;
    }
    public int queueSize(int i){
        //refers to number of items in a given priority level
        return list[i].size();
    }
    public boolean hasData(){
        //tests to see if ANY of the queue have anything waiting 
        for(int i = 0; i<size; i++){
            if (queueSize(i)>0)
                return true;
        }
        return false;
    }


}
