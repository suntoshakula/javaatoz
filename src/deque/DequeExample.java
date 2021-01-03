package deque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExample {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();        
        // We can add elements to the queue in various ways
        deque.add("Element 1 (Tail)"); // add to tail
        deque.addFirst("Element 2 (Head)"); //add to head
        deque.addLast("Element 3(last)"); //add to last
        deque.add("Element 4 (Tail)"); // add to tail
        deque.offer("Element 5(Tail) return boolean");
        deque.offerFirst("Element 6(head) return boolean");
        System.out.println("complete list"+deque);
        
        Iterator<String> iterator = deque.iterator();
        while(iterator.hasNext()) {
        	System.out.println("each element is "+ iterator.next());
        	
        }
        
        Iterator<String> decIterator = deque.descendingIterator();
        while(decIterator.hasNext()) {
        	System.out.println("reverse element is "+decIterator.next());
        }
        
        deque.push("Element 7(push head)");
        System.out.println("complement: "+deque);
        System.out.println("element pop element from head: "+deque.pop());
        System.out.println("list: "+deque);
        System.out.println("remove first "+deque.removeFirst());
        System.out.println("list: "+deque);
        System.out.println("remove last "+deque.removeLast());
        System.out.println("list "+deque);
        System.out.println("first element and not remove"+deque.peek());
        System.out.println("list "+deque);
    }
}
