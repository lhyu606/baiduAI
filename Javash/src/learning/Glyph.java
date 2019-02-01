
public class Glyph {

	/**
	 * @param args
	 */
	void draw(){
		System.out.println("Glyph.draw()");
	}
	Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}

}
