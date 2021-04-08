//the goal of this class is to define and set the objects of the television.
// Sagiv Reich 
//4/14/21

public class Television {

	private final String MANUFACTURER;
	private final int SCREENSIZE;
	private boolean powerOn;
	private int channel;
	private int volume;
	
	public static void main (String[] args) {
		
		
	}
	
	public Television(String TV_Name, int ScreenSize) {
	
	this.MANUFACTURER=TV_Name;
	this.SCREENSIZE=ScreenSize;
	powerOn=false;
	volume=20;
	channel=2;
	
}
/*
 * 
 * @return volume. This method returns the volume of the TV.  
 */
public int getVolume() {
	return volume;
}

/*
 * 
 * @return channel. This method returns the channel that is on the TV.  
 */
public int getChannel() {
	return channel;
}


/*
 * 
 * @return Manufacturer. This method returns the name of the manufacturer that the TV was made.  
 */
public String getManufacturer() {
	return MANUFACTURER;
}



/*
 * 
 * @return ScreenSize. This method returns the size of the screen by inches.  
 */
public int getScreenSize() {
	return SCREENSIZE;
}


/*
 * 
 * @param channel method. This method returns the channel that is on the TV and sync it with the channel varible.  
 */
public void setChannel (int Channel) {
	channel=Channel;
}

/*
 * 
 * @param power. This method controls the ON and OFF of the TV it makes it equal the oposite.  
 */
public void power() {
	powerOn=!powerOn;
}


/*
 * 
 *  This method increase the volume of the TV.  
 */
public void increaseVolume() {
	volume+=1;
}


/*
 * 
 * This method decrease the volume of the TV.  
 */
public void decreaseVolume() {
	volume-=1;
}

	
}
