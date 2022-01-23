
public class SelectionSort extends SortMethoden
{
    public int[] sort (int[] a){
        for(int i = 0;i<a.length;i++){
            for (int j = i; j<a.length;j++){
                if (a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    
    public String getAlgoritmusName(){
        return "SelectionSort";
    }
}
