import java.util.*;

public class Grader{
	//contains a queue that submission objects are added to and removed from
    public LinkedList queue = new LinkedList();
	//generate queue processors and pass in  reference to the queue
    public QueueProcessor processorFactory(){
    	QueueProcessor ret = new QueueProcessor(queue);
    	return ret;
    }
}

