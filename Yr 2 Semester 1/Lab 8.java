import java.util.*;
public class Solution {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = 20;
        Queue q1 = new Queue(s);
        while(sc.hasNext()) {
            if((sc.next()).equals("INSERT")) q1.insert(sc.next());
            else q1.remove();
        }
        System.out.println(q1.printQ());
    }
}

class Queue{
    
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int s){
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public boolean insert(String item){ 
    if(isFull()) return false;
    if(rear == maxSize-1) {
        rear = -1;
    }
    rear++;
    queArray[rear] = item;
    nItems++;
    return true;
    }
      
    public String remove() {
    if(isEmpty()) return null;
    String temp = queArray[front];
    front++;
    if(front == maxSize) front = 0;
    nItems--;
    return temp;
    }

    public boolean isEmpty(){ 
        return (nItems==0);
    }
        
    public boolean isFull(){
        return (nItems==maxSize);
    }
        
    public int size(){ 
        return nItems;
    }
    
    public String printQ() {
        if(isEmpty()) return "empty";
        return queArray[front];
    }
}
