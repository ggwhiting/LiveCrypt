import java.util.*;


public class CipherCoord {
	private Hashtable<String, Integer> symCiphers;
	private Hashtable<String, Integer> asymCiphers;
	
	private String[] symmetrics = {"AES", "DSA", "RC5" };
	private String[] asymmetrics = {"RSA"};

	public CipherCoord() {
		symCiphers = new Hashtable<String, Integer>();
		asymCiphers = new Hashtable<String, Integer>();
	}
	
	public void init() throws Exception {
// get everything security algorithm wise...
		CipherManager manager = new CipherManager();
		manager.probe();
		String[] ciphers = manager.getCiphers();
		
		for(String cipher : ciphers){
// check for symmetric ciphers and add to the hashtable symCiphers
			for(int n = 0;n < symmetrics.length;n++){
				if(cipher.contains(symmetrics[n])){
					symCiphers.put(cipher, -1);
				}
			}

// check for asymmetric ciphers and add to the hashtable asymCiphers
			for(int m = 0;m < asymmetrics.length;m++){
				if(cipher.contains(asymmetrics[m])){
					asymCiphers.put(cipher, -1);
				}
			}
		}
	}

	public Hashtable getSymmetrics(){
		return symCiphers;
	}

	public Hashtable getAsymmetrics(){
		return asymCiphers;
	}

	public void toTerm(){
		Enumeration<String> symKeys = symCiphers.keys();
		Enumeration<String> asymKeys = asymCiphers.keys();
		
		while(symKeys.hasMoreElements()){
			System.out.println("[Symmetric] - " + symKeys.nextElement());
		}

		while(asymKeys.hasMoreElements()){
			System.out.println("[Asymmetric] - " + asymKeys.nextElement());
		}
	}
}
