
/**
 * Beschreiben Sie hier die Klasse Any.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class InsertionSort extends SortMethoden
{
    /*
     * -i = 0//         j = i -1 = -1 //zweite schleife laeuft nicht , da j nicht >= 0 ist 
     * -i = 1//         4 nicht > 4 also nichts //nur eine Schritt,da j -1 nach der ersten durchlauf 
     * - i= 2//         j = 1 , 1 wird mit 4 vertauscht => j = 0 => 1 wird mit 4 vertauscht also 1,4,4,2,5,12
     * ......
     */

    //Zusammenfassung => erste schleife läuft forwärts 
    //und die innere schleife läuft rückwirts, in Abhhängikeit von i aus erste schleife

   
    @Override
    public  int[] sort (int[] a){
        // Betrachte den Wert a[i]
        for (int i = 0; i < a.length; i++) {
            // Füge a[i] in a[0] ... a[i-1] ein
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[j + 1]) {
                    // Werte vertauschen
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        return a;
    }

    public  String getAlgoritmusName(){
        return "InsertionSort";   
    }



}
