import java.security.*;
import java.util.*;

public class CipherManager { 

	private Set<String> ciphers;
	private Set<String> signatures;
	private Set<String> messageDigests;
	private Set<String> macs;

	public CipherManager(){
		this.ciphers = null;
		this.signatures = null;
		this.messageDigests = null;
		this.macs = null;
	}


	public void probe() throws Exception {
		this.ciphers = Security.getAlgorithms("Mac");
		this.ciphers = Security.getAlgorithms("Cipher");
                this.ciphers = Security.getAlgorithms("Signature");
                this.ciphers = Security.getAlgorithms("MessageDigest");
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


	public String[] getMacs() throws Exception {
                Object[] macsObjects = this.macs.toArray();
                String[] buffer = new String[macsObjects.length];
                for(int i = 0;i < macsObjects.length;i++){
                        buffer[i] = new String();
                        buffer[i] = macsObjects[i].toString();
                }
                return buffer;
        }

	public String[] getSignatures() throws Exception {
               	Object[] signaturesObjects = this.signatures.toArray();
                String[] buffer = new String[signaturesObjects.length];
                for(int i = 0;i < signaturesObjects.length;i++){
                        buffer[i] = new String();
                        buffer[i] = signaturesObjects[i].toString();
                }
                return buffer;
        }

	public String[] getDigests() throws Exception {
                Object[] mdObjects = this.messageDigests.toArray();
                String[] buffer = new String[mdObjects.length];
                for(int i = 0;i < mdObjects.length;i++){
                        buffer[i] = new String();
                        buffer[i] = mdObjects[i].toString();
                }
                return buffer;
        }
}

