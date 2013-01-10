
package bierflaschen.entsperrung; // was macht das ?
import java.util.*; //nützliche dinge
import javax.swing.*; //gui-klassen

/* Grundsätzliche Idee:
 * Nutzer drückt den Entsperren Button am Smartphone
 * Es erscheint als Entsperrbildschirm eine Bierflasche (Kronkorken, optional evtl. später Plop-Verschluss)
 * Nutzer muss mit der Bewegung den Kronkorken vom Flaschanhals "schnipsen", also eine einfache Bewegung 
 *      von unten nach oben durchführen.
 * Bildschirm wird entsperrt, sobald der Korken vom Flaschenhals entfernt wurde, aber:
 * der Korken soll im Hintergrund quasi zu sehen sein, wie er herunterfällt (evtl. je nach Schnelligkeit der bewegung mit
 *      unterschiedlicher Flugkurve
 * eventuell verschiedene Bierflaschen-Designs (Krombacher, Veltins, Flens (nur mit plop!), Bit, KöPi, Warsteiner, Duff Beer,
 *      etc...
 */

// musst dir angewühnen zu den meisten methoden und oder klassen JavaDoc Comments zu machen, die machst mit /** ok?
// Diese JavaDoc comments werden von den meisten IDEs umgesetzt in eine API(advanced programmers interface), wodrin steht, was ein Programmierer wissen muss um mit deinem code zu arbeiten, ohne sich selbst in deinen Code einzulesen
// Heißt soviel wie: Der inhalt einer Klasse is irrelevant, solange du eine API hast, kann jeder der will einfach damit arbeiten
/**
 * Dies ist ein Projekt für einen Androidunlockscreen in Form einer Bierflasche
 * @author Frittenfisch
 * 
 */



public class BierflaschenEntsperrung {
/**
 * Constructor
 * static
 * @param String[]
 * @return void
 * 
 * 
 */

public void BierflaschenEntsperrung() //es is wichtig einen Construktor zu erstellen, sonst kannst du die Klasse später nicht aufrufen
// der Constructor kann auch leer sein, und public, damit er auch evtl von anderen Instanzen aufgerufen werden kann
//sollte er private sein, kann er nur von sich selber angerufen werden, was keinen sinn macht, weil Du den dann irgendwie aufrufen musst um zu starten
//nur so am rande, Klassen/Objecte(die teil einer klasse sind) mit private konstruktor können immer nur 1mal bestehen, weil man sie nur von sich selbst aus anrufen kann(sowas nennt man Singleton)
{

}
	
    public static void main(String[] args) {
        // PLATZHALTER FÜR unter - VOIDS
    }
 /**
  * Entsperrungsklasse
  * @param none
  * @return void
  * 
  */
    public void Entsperrung() { //der einfachkeit halber visibility modifiers (private,protected, default, public) nich weglassen bitte
        double xber; // X-Koordinate der Berührung
        double yber; // Y-Koordinate der Berührung
        int k = 0; // k ist die Variable für den Zustand des Kronkorkens. 0=geschlossen (standard), 1=offen.
        double xent1 = 3;
        double yent1 = 3;
        double xent2 = 6;
        double yent2 = 6; // Koordinatenpaare ergeben 3 x 3 großes Feld, irgendwo hier muss die Berührung treffen
        while (k=0) {
            if ((xent1 <= xber && xber <= xent2) && (yent1 <= yber && yber <= yent2)) { //User streicht über richtiges Koordinatenpaar als Entsperrgegend
                //Display wird entsperrt
                k = 1;
            } else {
                // Display wird nicht entsperrt
                k = 0;
            }
        }
    }
}
