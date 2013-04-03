package hal.drawing.shapes;

/**
 * Un rectangle en deux dimensions. Les cotés du rectangle sont toujours
 * parallèles aux axes.
 * 
 * @version jan. 2013
 * @author Stéphane Lopes
 * 
 */
public class Rectangle extends Shape {
	/** Coordonnées du coin supérieur gauche */
	private Point upLeft;

	/** Coordonnées du coin inférieur droit */
	private Point downRight;

	/**
	 * Initialise le rectangle.
	 * 
	 * @param upLeft
	 *            Le coin supérieur gauche.
	 * @param downRight
	 *            Le coin inférieur droit.
	 */
	public Rectangle(Point upLeft, Point downRight) {
		assert upLeft.getX() <= downRight.getX()
				&& upLeft.getY() >= downRight.getY();
		this.upLeft = upLeft;
		this.downRight = downRight;
	}

	/**
	 * Translate le rectangle.
	 * 
	 * @param dx
	 *            déplacement en abscisse.
	 * @param dy
	 *            déplacement en ordonnées.
	 */
	@Override
	public void translate(double dx, double dy) {
		upLeft.translate(dx, dy);
		downRight.translate(dx, dy);
	}

	/**
	 * Retourne une chaîne représentant l'objet.
	 * 
	 * @return la chaîne.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		str.append(upLeft.toString());
		str.append(", ");
		str.append(downRight.toString());
		str.append("]");
		return str.toString();
	}
}