import java.awt.Color;

import javax.swing.JPanel;

/**
 * Klasa tworząca ekran Menu Głównego
 * 
 * @author Lukasz
 *
 */
public class oknoEkranuGlownego extends JPanel implements zmienneGlobalne{
	
	private int szerokoscOkna = szerokoscAplikacji;
	private int wysokoscOkna = wysokoscAplikacji;
	private Color kolorTla;
	
	/*
	 * Konstruktor ustawia layout i rozmiar danego ekranu (nie zmieniamy tego!)
	 */
	public oknoEkranuGlownego(){
		this.setLayout(null);
		this.setSize(this.szerokoscOkna,this.wysokoscOkna);
	}
	
	/*
	 * Metoda dodaje komponenty do Ekranu Głównego
	 */
	public void dodajKomponentyEkranuGlownego(){
		this.dodajGrafikeWTleEkranuGlownego();
	}
	
	/*
	 * Metoda dodaje grafike w tle dla Ekranu Głównego
	 */
	public void dodajGrafikeWTleEkranuGlownego(){
		obrazek prawyGornyRog = new obrazek(409,0,"src/obrazki/ekranGlowny/prawyGornyRog.png");
		obrazek prawyDolnyRog = new obrazek(288,514,"src/obrazki/ekranGlowny/prawyDolnyRog.png");
		obrazek lewyDolnyRog = new obrazek(0,568,"src/obrazki/ekranGlowny/lewyDolnyRog.png");
		obrazek logoGry = new obrazek(97,24,"src/obrazki/ekranGlowny/logoGry.png");
		obrazek obszarNaPrzyciski = new obrazek(104,218,"src/obrazki/ekranGlowny/obszarNaPrzyciski.png");
		obrazek zajawkaEkranGlowny = new obrazek(63,429,"src/obrazki/ekranGlowny/zajawkaEkranGlowny.png");
		
		this.add(prawyGornyRog);
		this.add(prawyDolnyRog);
		this.add(lewyDolnyRog);
		this.add(logoGry);
		this.add(obszarNaPrzyciski);
		this.add(zajawkaEkranGlowny);
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
