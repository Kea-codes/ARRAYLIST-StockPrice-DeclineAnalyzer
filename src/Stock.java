import java.io.Serializable;

@SuppressWarnings("serial")
public class Stock implements Serializable{
	String code, name;
	private int p, a, b, c, d, n;
	
	/*
	 * Constructor
	 * @param the code and name of the stock
	 * constants p, a, b, c, d
	 * and n - the number of days we track the stock
	 */
	public Stock(String code, String name, int p, int a, int b, int c, int d, int n) {
		this.code = code;
		this.name = name;
		this.p = p;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.n = n;
	}
	
	/**
	 * @return the stock code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code - the stock code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the stock name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param the stock name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return int p
	 */
	public int getP() {
		return p;
	}

	/**
	 * @param int p to set
	 */
	public void setP(int p) {
		this.p = p;
	}

	/**
	 * @return int a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param int a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return int b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param int b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * @return int c
	 */
	public int getC() {
		return c;
	}

	/**
	 * @param int c to set
	 */
	public void setC(int c) {
		this.c = c;
	}

	/**
	 * @return int d
	 */
	public int getD() {
		return d;
	}

	/**
	 * @param int d to set
	 */
	public void setD(int d) {
		this.d = d;
	}

	/**
	 * @return int n
	 */
	public int getN() {
		return n;
	}

	/**
	 * @param int n to set
	 */
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "Stock [code=" + code + ", name=" + name + ", p=" + p + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d
				+ ", n=" + n + "]";
	}

}
