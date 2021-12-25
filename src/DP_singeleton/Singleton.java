package DP_singeleton;

public class Singleton {

	private static Singleton instance ;
	
	private Singleton() {
		
	}
	// synchronized fix the probleme of mult threading : prb of lazy mode
	// the instance will be created only if it is needed
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			return new Singleton();
		}
		return instance;
	}
}
