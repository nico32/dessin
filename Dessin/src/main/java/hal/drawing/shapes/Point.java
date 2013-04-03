package hal.drawing.shapes;

/**
 * Un point en deux dimensions.
 * 
 * @version jan. 2013
 * @author Stéphane Lopes
 * 
 */
public class Point {
	/** L'abscisse du point. */
	private double x;

	/** L'ordonnée du point. */
	private double y;

	/**
	 * Initialise un point à partir de deux coordonnées.
	 * 
	 * @param x
	 *            l'abscisse du point.
	 * @param y
	 *            l'ordonnée du point.
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Renvoie l'abscisse du point.
	 * 
	 * @return l'abscisse du point.
	 */
	public double getX() {
		return x;
	}

	/**
	 * Renvoie l'ordonnée du point.
	 * 
	 * @return l'ordonnée du point.
	 */
	public double getY() {
		return y;
	}

	/**
	 * Translate le point.
	 * 
	 * @param dx
	 *            déplacement en abscisse.
	 * @param dy
	 *            déplacement en ordonnées.
	 */
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}

	/**
	 * Retourne une chaîne décrivant le point.
	 * 
	 * @return la représentation textuelle du point.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append('(');
		str.append(x);
		str.append(", ");
		str.append(y);
		str.append(')');
		return str.toString();
	}
}
