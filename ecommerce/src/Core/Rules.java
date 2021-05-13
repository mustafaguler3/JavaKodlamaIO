package Core;

public class Rules {
	
	public static boolean run(boolean... things) {
     	 for(boolean thing : things) {
     		 if(!thing) return false;
     	 }
     	 return true;
      }

}
