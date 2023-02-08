


public class CipherManagerTest {

	public static void main(String[] args) throws Exception {
		CipherManager manager = new CipherManager();
		manager.probe();
		String[] cipherStrings = manager.getCiphers();
		for(String aCipher : cipherStrings){
			System.out.println("Cipher = " + aCipher);
		}
	}
}
