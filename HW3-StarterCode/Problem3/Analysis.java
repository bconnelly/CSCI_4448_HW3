interface Logging
{
	//public enum LOG_TYPE {TXT, XML, HTML};
	public void log(String msg);
}

class LogText implements Logging
{
	public LogText()
	{
		System.out.println("Logging: text format");
	}
	public void log(String msg)
	{	
		System.out.println("Logging text to file: " + msg);
	}
}
class LogXML implements Logging
{
	public LogXML()
	{
		System.out.println("Logging: <type>XML Format</type>");
	}
	public void log(String msg)
	{	
		System.out.println("Logging text to file: log.xml" );
		System.out.println("<xml><msg>"+msg+"</msg></xml>");
	}
}
class LogHTML implements Logging
{
	public LogHTML()
	{
		System.out.println("Logging: HTML format");
	}
	public void log(String msg)
	{	
		System.out.println("Logging HTML to file: log.html" );
		System.out.println("<html><body>"+msg+"</body></html>");
	}
}

class Analysis
{
	public static void main(String[] args)
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java Analysis type");
			System.exit(-1);
		}
		String type = args[0];
		Logging logfile = getType(type);
		
		logfile.log("Starting application...");

		System.out.println("... read in data file to analyze ...");
		// code...
		System.out.println("... Clustering data for analysis ...");
		// code...
		System.out.println("... Printing analysis results ...");
		// code...
	}
	
	public static Logging getType(String in){
		Logging ret = null;
		
		if(in.equalsIgnoreCase("text"))
			ret = new LogText();
		else if (in.equalsIgnoreCase("xml"))
			ret = new LogXML();
		else if (in.equalsIgnoreCase("html"))
			ret = new LogHTML();
		else{
			System.out.println("Please enter either \"text\", \"html\" or \"xml\"");
			System.exit(-1);
		}
		
		return ret;
	}
}
