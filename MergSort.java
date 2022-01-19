/**
 * Beschreiben Sie hier die Klasse MergSort.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MergSort extends SortMethoden
{
    public int[] sort (int[] a){
        return mergeSort(a);
    }
    
    //Mischen zweier sortierter Arrays
    private int [] merge(int[] left , int[] right){
        // Gemischtes Array
        int[] merged = new int [left.length+right.length];
        
        int pLeft = 0;
        int pRight = 0;
        int index = 0;
        
        while (pLeft < left.length && pRight < right.length){
            if (left[pLeft] <= right[pRight]){
                //Linke ist Kleiner als Rechte => die Linke wird in array gespeichert und pointer um eins erhöht 
                merged[index] = left[pLeft]; 
                pLeft++;
            }else{
                //Rechte ist Kleiner als Linke => die Rechte wird in array gespeichert und pointer um eins erhöht
                merged[index] = right[pRight];
                pRight++;
            }
            index++;
        }
        
        // Kopieren der restlichen Werte aus dem linken Array
        while (pLeft < left.length){
            merged[index] = left[pLeft]; 
            pLeft++;
            index++;
        }
        
        // Kopieren der restlichen Werte aus dem rechten Array
        while (pRight < right.length){
            merged[index] = right[pRight]; 
            pRight++;
            index++;
        }
        
        // Gemischtes Array zurückgeben
        return merged;
    }
    
    
    //in 2 Array teilen bis length 1 ist
    private int [] mergeSort(int[] a ){
        // Nichts zu tun, falls a höchstens ein Element enthaelt
        if (a.length <= 1){
            return a;
        }
        
        // Bestimme die Mitte des Arrays
        int mitte = a.length / 2;
        
        //Teilen
        // Kopiere linke Haelfte in ein neues Array
        int[] left = new int[mitte];
        for (int li = 0; li < left.length;li++){
            left[li] = a[li];
        }
        
        // Kopiere rechte Haelfte in ein neues Array
        int[] right = new int[a.length - mitte];
        for (int ri = 0; ri < right.length;ri++){
            right[ri] = a[ri + mitte];
        }
        
        // Sortiere die beiden Haelften
        int [] leftSorted = mergeSort(left);
        int [] rightSorted= mergeSort(right);
        
        // Mische die beiden Haelften
        return merge(leftSorted,rightSorted);
    }

    public String getAlgoritmusName(){
        return "MergSort";
    }
}
