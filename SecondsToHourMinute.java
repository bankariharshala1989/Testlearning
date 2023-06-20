package firstprogram;

public class SecondsToHourMinute {

	public static void main(String[] args) 
	{
		int num=86399;
		
		int hr=num/3600; 
		int j=num%3600;
		int min=j/60 ;
		int sec=j%60;
		
	System.out.println( hr +" hours " +min +" minutes " +sec+" seconds ");
			
	}

}
