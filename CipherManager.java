import java.security.*;
import java.util.*;

public class CipherManager { 

	private Set<String> ciphers;

	public CipherManager(){
		this.ciphers = null;
	}


	public void probe() throws Exception {
		this.ciphers = Security.getAlgorithms("Cipher");
	}

	public String[] getCiphers() throws Exception { 
		Object[] cipherObjects = this.ciphers.toArray();
		String[] buffer = new String[cipherObjects.length];
		for(int i = 0;i < cipherObjects.length;i++){
			buffer[i] = new String();
			buffer[i] = cipherObjects[i].toString();
		}
		return buffer;
	}
}

