import java.util.*;

public class QueueProcessor{
	private LinkedList queue;
	//get the queue passed in from the grader
	public QueueProcessor(LinkedList q){
		queue = q;
	}
    //add a new submission to the queue
    public void add(Submission s){
    	queue.addFirst(s);
    	System.out.println("Added " + queue.getFirst());
    	System.out.println(queue.size() + " elements in the queue");
    }
    //process the next item on the queue
    public void process(){
        //actual processing implementation would go here - we're just
        //going to print the submission
        try{
            System.out.println("Processed " + queue.getLast());
            queue.removeLast();
            System.out.println(queue.size() + " elements in the queue");
        } catch (NoSuchElementException e){
            System.out.println("There are no more submissions on the queue");
        }
    }
}