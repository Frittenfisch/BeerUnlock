
package bierflaschen.entsperrung;

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
public class BierflaschenEntsperrung {

    public static void main(String[] args) {
        // PLATZHALTER FÜR unter - VOIDS
    }
    
    void Entsperrung() {
        double xber; // X-Koordinate der Berührung
        double yber; // Y-Koordinate der Berührung
        int k = 0; // k ist die Variable für den Zustand des Kronkorkens. 0=geschlossen (standard), 1=offen.
        double xent1 = 3;
        double yent1 = 3;
        double xent2 = 6;
        double yent2 = 6; // Koordinatenpaare ergeben 3 x 3 großes Feld, irgendwo hier muss die Berührung treffen
        while (k=0) {
            if (xent1 <= xber <= xent2 && yent1 <= yber <= yent2) { //User streicht über richtiges Koordinatenpaar als Entsperrgegend
                //Display wird entsperrt
                k = 1;
            } else {
                // Display wird nicht entsperrt
                k = 0;
            }
        }
    }
}
