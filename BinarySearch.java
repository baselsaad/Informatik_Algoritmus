
public class BinarySearch implements ISearch
{
    final int NUMBER_NOT_FOUND = -1;
    public int search (int[] a,int number){
        int left = 0;
        int right = a.length - 1;
        while (left <= right){
            int middle = (left + right) / 2;
            if (number < a[middle]){
                right = middle - 1;
            }else if (number == a[middle]){
                return middle;
            }else{
                left = middle + 1;
            }
        }
        
        return NUMBER_NOT_FOUND;
    }
    
    public String getAlgorthimsName(){
        return "BinarySearch";
    }    
}
