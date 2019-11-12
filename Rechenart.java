
public class Rechenart {

	// Testen Sie unterschiedliche Grenzen/Limits fuer Pi und Eulersche Zahl hier
	private static int limit = 100;
	
	/**
	 * In dieser Methode NICHTS veraendern!
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Potenz 2^20 betraegt: " + Potenz(2, 20));
		System.out.println("Potenz 5^3 betraegt: " + Potenz(5, 3));
		
		System.out.println("Fakultaet von 6 betraegt: " + Fakultaet(6));
		System.out.println("Fakultaet von 8 betraegt: " + Fakultaet(8));
		
		System.out.println("Pi: " + Pi(limit));
		System.out.println("Eulersche Zahl: " + EulerscheZahl(limit));
	}
	
	/**
	 * Berechnet die Potenz der Basis base zum Exponenten exp
	 * @param base Basis
	 * @param exp Exponent
	 * @return Potenz
	 */
	public static int Potenz(int base, int exp) {
		return 0;
	}
	
	/**
	 * Berechnet die Fakultaet einer Zahl
	 * @param nmbr Zahl 
	 * @return Fakultaet
	 */
	public static int Fakultaet(int nmbr) {
		return 0;
	}
	
	/**
	 * Berechnet die Kreiszahl Pi nach der Leibniz-Reihe
	 * weiter Informationen: https://de.wikipedia.org/wiki/Leibniz-Reihe
	 * @param k Oberes Limit der Reihe
	 * @return Hoffentlich ca. Pi ;)
	 */
	public static float Pi(int k) {
		return 0f;
	}
	
	/**
	 * Berechnet die Eulersche Zahl
	 * weitere Informationen: https://de.wikipedia.org/wiki/Eulersche_Zahl
	 * @param k Oberes Limit
	 * @return ca. die Eulersche Zahl
	 */
	public static float EulerscheZahl(int k) {
		return 0f;
	}
}
