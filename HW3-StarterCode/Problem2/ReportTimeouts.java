public class ReportTimeouts{
	private int timeouts = 0;
	
	public void incTos(){
		timeouts++;
	}
	
	public void getResults(){
		incTos();
		//it would be more practical to only print once per submission,
		//but this demonstrates more clearly that the code is working
		print();
	}
	
	public void print(){
		System.out.println("Timeouts: " + timeouts);
	}
}