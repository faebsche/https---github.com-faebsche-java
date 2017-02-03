public class SimpleLocation
{
     private double latitude;
	 private double longitude;
	 
	 public double getLatitude()
	 {
		 return this.latitude;
	 }
	 
	 public void setLatitude(double lat)
	 {
		 this.latitude = lat;
	 }
	 
	 public SimpleLocation(double lat, double lon)
	 {
	     this.latitude = lat;
		 this.longitude = lon;
		 
	  }
	  
	 public double distance(SimpleLocation other)
	 {
      // Distance to be computed
	  // return getDist(this.latitude, this.longitude, other.latitude, other.longitude);
      return (this.latitude- other.latitude);
	  }
	  
	  
}	  