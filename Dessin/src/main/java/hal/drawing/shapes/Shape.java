package hal.drawing.shapes;

/**
 * Une figure.
 * 
 * @version jan. 2013
 * @author Stéphane Lopes
 * 
 */
public abstract class Shape {
	/**
	 * Translate la figure.
	 * 
	 * @param dx
	 *            déplacement en abscisse.
	 * @param dy
	 *            déplacement en ordonnées.
	 */
	public abstract void translate(double dx, double dy);
}
