
public class BaseballPlayer {

	private String PlayerName;
	private int H;
	private int AB;
	private int BB;
	private int HBP;
	private int SF;
	private int dbl;
	private int triple;
	private int HR;

	public BaseballPlayer(String PlayerName, int h, int aB, int bB, int hBP, int sF, int dbl, int triple, int hR) {
		super();
		H = h;
		AB = aB;
		BB = bB;
		HBP = hBP;
		SF = sF;
		this.dbl = dbl;
		this.triple = triple;
		HR = hR;
	}
	public String getPlayerName() {
		return PlayerName;
		
	}


	public int getHits() {
		return H;
	}

	public void setHits(int h) {
		H = h;
	}

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getBB() {
		return BB;
	}

	public void setBB(int bB) {
		BB = bB;
	}

	public int getHBP() {
		return HBP;
	}

	public void setHBP(int hBP) {
		HBP = hBP;
	}

	public int getSF() {
		return SF;
	}

	public void setSF(int sF) {
		SF = sF;
	}

	public int getDbl() {
		return dbl;
	}

	public void setDbl(int dbl) {
		this.dbl = dbl;
	}

	public int getTriple() {
		return triple;
	}

	public void setTriple(int triple) {
		this.triple = triple;
	}

	public int getHR() {
		return HR;
	}

	public void setHR(int hR) {
		HR = hR;
	}

	public double SLG() {
		
		return (double) TB() / AB;
	}

	public double OBP() {
		int num = (H + BB + HBP);
		int denum = (AB + BB + HBP + SF);
		return (double) num / denum;
	}

	public double OBS() {
		return SLG() + OBP();
	}

	public int TB() {
		return ((H- dbl - triple - HR) + (2 * dbl) + (3 * triple) + (4 * HR));
	}

	public double BA() {
		return (double) H / AB;
	}
}
