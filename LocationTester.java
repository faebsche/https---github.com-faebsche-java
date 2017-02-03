public class LocationTester
{
    public static void main(String[] args)
	{   
	    // Klasse SimpleLocation generiert das Objekt ucsd bzw. lima
 	    SimpleLocation ucsd = new SimpleLocation(32,-117); 
		SimpleLocation lima = new SimpleLocation(-12,-77);
		
		
		System.out.println(ucsd.distance(lima));
		
		whatEver test_what = new whatEver(1,2);
		
		System.out.println(ucsd.getLatitude());
		// change the value of a declared variable in an object
		ucsd.setLatitude(30);
		System.out.println(ucsd.getLatitude());
	
	}
}	