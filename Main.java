
/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    public static void main (String[] args){
        int[] array = {1,52,12,4,6,7,2,12,3,5,3123,6,21,5,123,123,213,123,312};
        
        InsertionSort insertionSort = new InsertionSort();
        MergSort mergsort = new MergSort();
        
        arrayAuswerfen(insertionSort.sort(array),insertionSort.getAlgoritmusName());
        arrayAuswerfen(mergsort.sort(array),mergsort.getAlgoritmusName());
        
    }

    private static void arrayAuswerfen(int [] a,String text){
        System.out.println("\n"+text);
        for (int i = 0; i < a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
