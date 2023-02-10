
public class CipherType {
	private String name;
	private boolean MAC;
	private boolean SHA;
	private boolean PBE;
	private short keysize;
	private BookType booktype;
	private String paddingType;
	public enum BookType {
        	CBC,
        	ECB,
        	GCM,
        	OFB,
        	CFB 
	}

	
	public CipherType(String name, boolean mac, boolean sha, boolean pbe, short keysize, BookType booktype, String paddingType){
		this.name = name;
		this.MAC = mac;
		this.SHA = sha;
		this.PBE = pbe;
		this.keysize = keysize;
		this.booktype = booktype;
		this.paddingType = paddingType;
	}

	public String getName(){ 
		return name;
	}

	public boolean hasMAC(){
		return MAC;
	}

	public boolean hasSHA(){
		return SHA;
	}

	public boolean hasPBE(){
		return PBE;
	}

	public short getKeysize(){
		return keysize;
	}

	public BookType getBookType(){
		return booktype;
	}

	public String getPaddingType(){
		return paddingType;
	}
}

