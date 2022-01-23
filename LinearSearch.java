public class LinearSearch implements ISearch
{
    final int NUMBER_NOT_FOUND = -1;

    public int search (int[] a,int number){
        for(int i = 0;i< a.length;i++){
            if (a[i] == number){
                return i;
            }
        }
        return NUMBER_NOT_FOUND;
    }

    public String getAlgorthimsName(){
        return "LinearSearch";
    }

}
