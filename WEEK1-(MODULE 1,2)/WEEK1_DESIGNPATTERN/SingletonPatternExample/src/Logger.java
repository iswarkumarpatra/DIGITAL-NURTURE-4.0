
public class Logger {
	private static Logger instance;
	private Logger() {}
	public static Logger getInstance() {
		if(instance==null) {
			instance=new Logger();
		}
		return instance;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger1=Logger.getInstance();
		Logger logger2=Logger.getInstance();
		if(logger1==logger2) {
			System.out.println("Both logger instance are same");
		}else {
			System.out.println("Logger instance are different");
		}
		
		

	}

}
