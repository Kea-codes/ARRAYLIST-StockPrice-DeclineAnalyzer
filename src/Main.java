
//************ Total Marks for correctness: 10 marks
//************ Total Marks for Main: 15 marks
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
	/*
	 * Reads all the current inputs from the local database (binary file of a
	 * collection of inputs)
	 * 
	 * @param The path to the database ********** 10 marks
	 * ****************************
	 */
	public static ArrayList<Stock> readStocksFromDB(String path) {
		ArrayList<Stock> stocks = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)))) {
			while (true) {
				try {
					Stock stock = (Stock) ois.readObject();
					stocks.add(stocks.size() , stock);
				} catch (EOFException e) {
					break;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return stocks;
	}

	/*
	 * Calculates the price at time k price(k) =p�(sin(a�k+b) + cos(c�k+d) + 2)
	 * 
	 * @param the list of constant values p,a,b,c and d, and time k
	 * 
	 * @return the price
	 */
	public static Double calculatePrice(int p, int a, int b, int c, int d, int k) {
		return p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
	}

	/*
	 * Calculates the maximum decline in the stock prices
	 * 
	 * @param Stock stk
	 * 
	 * @return the maximum decline in stock price ********** 5 marks
	 * ****************************
	 */
	public static Double calculateMaxDecline(Stock stk) {
		double maxPrice = Double.MIN_VALUE;
		double maxDecline = 0.0;
		for (int k = 1; k <= stk.getN(); k++) {
			double price = calculatePrice(stk.getP(), stk.getA(), stk.getB(), stk.getC(), stk.getD(), k);
			if (price > maxPrice) {
				maxPrice = price;
			} else {
				double decline = maxPrice - price;
				if (decline > maxDecline) {
					maxDecline = decline;
				}
			}
		}
		return maxDecline;
	}

	public static void main(String[] args) {
		ArrayList<Stock> list = readStocksFromDB("stock.db");

		/*
		 * Stock stk1 = new Stock("AAPL","Apple Inc", 42, 1, 23, 4, 8, 10); list.add(0,
		 * stk1);
		 * 
		 * Stock stk2 = new Stock("MSFT","Microsoft Corp", 100, 7, 615, 998, 801, 3);
		 * list.add(1, stk2);
		 * 
		 */

		System.out.println(list.size() + " stocks loaded");

		for (Stock stk : list) {
			System.out.println(stk);
			System.out.format("Maximum decline: %f \n", calculateMaxDecline(stk));
		}
	}

}
