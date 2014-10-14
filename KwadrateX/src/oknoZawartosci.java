import java.awt.Color;

import javax.swing.JPanel;

/**
 * Klasa tworząca ekran Menu Głównego i ekran Gry. Pamiętajmy o tym by każdy
 * ekran miał dwie metody stworz<nazwa ekranu>, dodajKomponenty<nazwa ekranu>
 * 
 * @author Lukasz
 *
 */
public class oknoZawartosci extends JPanel implements zmienneGlobalne{
	
	private int szerokoscOkna = szerokoscAplikacji;
	private int wysokoscOkna = wysokoscAplikacji;
	private Color kolorTla;
	
	/*
	 * Konstruktor ustawia layout i rozmiar danego ekranu (nie zmieniamy tego!)
	 */
	public oknoZawartosci(){
		this.setLayout(null);
		this.setSize(this.szerokoscOkna,this.wysokoscOkna);
	}
	
	/*
	 * Metoda dodaje komponenty do Ekranu Głównego
	 */
	public void dodajKomponentyEkranuGlownego(){
		obrazek prawyGornyRog = new obrazek(409,0,"src/prawyGornyRog.png");
		this.add(prawyGornyRog);
	}
	
	/*
	 * Metoda tworzy Ekran Głowny
	 */
	public void stworzEkranGlowny(){
		this.dodajKomponentyEkranuGlownego();
		
		this.kolorTla = new Color(36,144,213);
		
		this.setBackground(this.kolorTla);
		this.setVisible(true);
	}
}
