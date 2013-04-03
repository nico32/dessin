package hal.drawing;

import hal.drawing.shapes.Circle;
import hal.drawing.shapes.Point;
import hal.drawing.shapes.Rectangle;
import hal.drawing.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Représente l'application de dessin. Le programme est juste un petit exemple
 * d'appel de méthodes des formes.
 * 
 * @version jan. 2013
 * @author Stéphane Lopes
 */
public enum DrawingApp {
	ENVIRONNEMENT;

	/**
	 * Accès au log.
	 */
	private static Log log = LogFactory.getLog("hal.drawing");

	/**
	 * Liste des figures.
	 */
	List<Shape> shapes;

	/**
	 * Constructeur de la classe.
	 */
	private DrawingApp() {
		shapes = new ArrayList<>();
	}

	/**
	 * Méthode principale du programme.
	 * 
	 * @param args
	 *            les arguments de ligne de commande
	 */
	public void run(String[] args) {
		shapes = null;
		log.info("Démarrage du programme.");

		shapes.add(new Rectangle(new Point(0.0, 5.0), new Point(2.0, 2.0)));
		shapes.add(new Circle(new Point(1.0, 2.0), 3.0));
		shapes.add(new Rectangle(new Point(5.0, 5.0), new Point(7.0, 3.0)));
		shapes.add(new Circle(new Point(4.0, 5.0), 2.0));
		log.trace(shapes);

		for (Shape s : shapes) {
			s.translate(1.0, 2.0);
		}
		log.trace(shapes);

		log.info("Fin du programme.");
	}

	/**
	 * Programme principal. Cette méthode se contente de passer la main à la
	 * méthode run de l'objet ENVIRONNEMENT.
	 * 
	 * @param args
	 *            les arguments de ligne de commande
	 */
	public static void main(String[] args) {
		ENVIRONNEMENT.run(args);
	}

	public void trace() {
		log.trace(shapes);
	}

	public void translate() {
		for (Shape s : shapes) {
			s.translate(2.0, 3.0);
		}
	}
}