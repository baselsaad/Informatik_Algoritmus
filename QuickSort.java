public class QuickSort extends SortMethoden
{
    int[] array;
    public  int[] sort (int[] a){
        return quickSort(a);
    }

    int partition (int[] a , int beginn , int length , int piv){
        int pn = beginn;
        int pivot = a[piv];
        
        
        // Stelle Pivot ans Ende
        a = swap (a,piv,length);
        
        // Stelle Werte kleiner als Pivot nach rechts
        for(int i = beginn; i < length; i++){
            if (a[i] <= pivot){
                a = swap(a,pn,i);
                pn++;
            }
        }

        // Stelle Pivot an richtige Stelle
        a = swap(a,length,pn);

        return pn;
    }

    int[] qsort(int[] a, int beginn,int length){
        if(length > beginn){
            int p = length;
            int pn = partition(a,beginn,length,p);
            qsort(a,beginn,pn - 1);
            qsort(a,pn + 1,length);
        }
        return a;
    }

    int[] quickSort(int[] a){
        return qsort(a,0,a.length -1);
    }

    public int[] swap (int[] a,int i , int j ){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

    public  String getAlgoritmusName(){
        return "QuickSort";
    }
}
