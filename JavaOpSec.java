import java.io.*;



public class JavaOpSec { 

	private static FileOutputStream toFile;
	private static OutputStreamWriter writer;

	public static void main(String[] args) throws Exception {
		CipherManager manager = new CipherManager();
		toFile = new FileOutputStream("Java OPSec.html");
		writer = new OutputStreamWriter(toFile);
		manager.probe();

		out("<!doctype html>");
		out("<html>");
		out("<head>");
                out("<title>Java OPSec</title>");
                out("</head>");
                out("<body>");
		out("<h1>Mac</h1>");

		for(String mac : manager.getMacs()){
                	out(mac + "<br>");
		}

                out("<br>");

               	out("<h1>Cipher</h1>");

		for(String cipher : manager.getCiphers()){
	                out(cipher + "<br>");
		}

                out("<br>");

                out("<h1>Signature</h1>");

		for(String sig : manager.getSignatures()){
	                out(sig + "<br>");
		}


                out("<br>");

                out("<h1>Message Digests<h1/>");

		for(String digest : manager.getDigests()){
	                out(digest + "<br>");
		}

                out("</body>");
		out("</html>");

		writer.close();
		toFile.close();
	}

	public static void out(String s) throws Exception {
		writer.write(s + "\n");
	}
}
