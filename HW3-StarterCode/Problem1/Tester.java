import java.util.*;
import java.io.*;

public class Tester{
    public static void main(String[] args){
        //create one Grader object containing the queue that each
    	//QueueProcessor will modify
    	Grader grader = new Grader();
    	//create new QueueProcessor objects
    	QueueProcessor a = grader.processorFactory();
    	QueueProcessor b = grader.processorFactory();
    	QueueProcessor c = grader.processorFactory();
    	QueueProcessor d = grader.processorFactory();
    	QueueProcessor e = grader.processorFactory();
    	QueueProcessor f = grader.processorFactory();
    	//create three submission objects to add to the queue
    	Submission s1 = new Submission();
    	Submission s2 = new Submission();
    	Submission s3 = new Submission();
    	//add and remove from each of the QueueProcessor
    	a.add(s1);
    	b.add(s2);
    	c.add(s3);
    	d.process();
    	e.process();
    	f.process();
    	a.process();
    }
}





//System.out.println("Testing graderQueue \nAdding Submissions to queue"
//+ "\nType \"add\" or \"process\" to add or process submissions."
//+ "\nType \"exit\" to exit.");
//
//Grader grader = new Grader();
//
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//String input = null;
//while(true){
//try{
//input = br.readLine();
//} catch(IOException e){
//System.out.println("IOException" + e);
//System.exit(1);
//}
//
//if(input.compareTo("add") == 0){
//Submission s = new Submission();
//grader.add(s);
//} else if(input.compareTo("process") == 0){
//grader.process();
//} else if(input .compareTo("exit") == 0){
//System.exit(1);
//} else{
//System.out.println("Please only type \"add\" or \"remove\"");
//}
//}