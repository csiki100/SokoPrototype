/**
* @Project : KillerSokoban
* @fileName Floor.java
* @date : 3/13/2018
* @author : 
*/

package game;
public class Floor extends Field {
	
	@Override
	public boolean pushHereBy(Player pusher, Thing pushed, Direction dir, long strength) {
		return super.pushHereBy(pusher, pushed, dir, strength);
		
		//
	}

	@Override
	public String MatrixElement() {		
		return ".";
	}
	
	
	
	
}
