import javax.swing.JFrame;
/**
 * Klasa tworząca Główne oknno gry
 * 
 * @author Lukasz
 *
 */
public class okno extends JFrame implements zmienneGlobalne{
	
	private int szerokosc = 480;
	private int wysokosc = 640;
	
	/*
	 * Metoda ustawiająca opcje okna
	 */
	public okno(){
		this.setLayout(null);
		this.setSize(this.szerokosc, this.wysokosc);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle(this.tytulGry);
	}
	
	/*
	 * Metoda wyswietla okno Gry
	 */
	public void wyswietlOknoGry(){
		this.setVisible(true);
	}
	
}