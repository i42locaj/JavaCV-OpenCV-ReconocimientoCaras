package myLibraryJAR;

public class metodoexterno {
	
	//Constructor
	public metodoexterno(){
		System.out.println("Constructor");
	}
	
	public void callsofromjavaclass(){
		System.out.println("Llamando a .so desde clase...");
		try {
		        
	    } catch (Exception e) {
	    	System.err.println("Native code library failed to load.\n" + e);
	    	System.exit(1);
	    }
	}
	
}
