public class ReportTestCases{
	private int passes = 0;
	private int total = 0;
	ReportTimeouts rep = new ReportTimeouts();
	
	public void incPasses(){
		passes++;
	}
	public void incTotal(){
		total++;
	}
	public void getResults(boolean pass, boolean timeout){
		incTotal();
		if(pass){
			incPasses();
		}
		if(!pass && timeout){
			rep.getResults();
		}
		//it would be more practical to only print once per submission,
		//but this demonstrates more clearly that the code is working
		print();
	}
	
	public void print(){
		System.out.println("Passes: " + passes + "/" + total);
	}
}