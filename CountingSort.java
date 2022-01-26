public class CountingSort extends SortMethoden
{
    public int[] sort (int[] a){
        // Maximum bestimmen
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        // Werte zählen
        int[] counts = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            counts[a[i]]++;
        }
        // 3,2,0,2,1,4,4
        //counts {1,1,1+1,1,1+1}
        
        // Sortiertes Array erzeugen
        int i = 0;
        for (int j = 0; j < counts.length; j++) {
            for (int k = 0; k < counts[j]; k++) {
                a[i] = j;
                i++;
            }
        }
        //counts {1,1,2,1,2}
        //counts.length = 7
        
        //0- a {3,2,0,2,1,4,4}
        //1- a {0,2,0,2,1,4,4}    j = 0, i = 0 , counts[j] = 1 , k = 0        
        //2- a {0,1,0,2,1,4,4}    j = 1, i = 1 , counts[j] = 1 , k = 0
        //3- a {0,1,2,2,1,4,4}    j = 2, i = 2 , counts[j] = 2 , k = 0
        //4- a {0,1,2,2,1,4,4}    j = 2, i = 3 , counts[j] = 2 , k = 1        
        //5- a {0,1,2,2,3,4,4}    j = 3, i = 4 , counts[j] = 1 , k = 0 
        //6- a {0,1,2,2,1,4,4}    j = 4, i = 5 , counts[j] = 2 , k = 0
        //7- a {0,1,2,2,1,4,4}    j = 4, i = 6 , counts[j] = 2 , k = 1
        return a;
    }

    public String getAlgoritmusName(){
        return "CountingSort";
    }
}
