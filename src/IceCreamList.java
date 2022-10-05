import java.util.ArrayList;

public class IceCreamList {
    Object[][] iceCreams = {{"Рудь", 300}};
    int ii;
    int amount = 0;
    int result = 0;
    String ic = "";

    public int isIceCream(String ic){
        if (ic == null){
            return -2;
        }
        for (int i = 0; i < iceCreams.length; i++) {
            if (iceCreams.length == 0){
                return -1;
            }
            if (ic == iceCreams[i][0]) {
                ii = i;
                this.ic = ic;
                return 0;
            }
        }
        return 1;
    }

    public IceCreamList getIceCream(){
        return this;
    }

    public boolean isAmount(int amount){
        if (amount <= (int)iceCreams[ii][1]){
            this.amount = amount;
            return true;
        }
        return false;
    }

    public IceCreamList getAmount(){
        return this;
    }

    public static Object[][] addIceCream(int n, Object[][] arr, Object[] x)
    {
        int i;

        // create a new array of size n+1
        Object[][] newarr = new Object[n + 1][];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

    public static Object[][] deleteIceCream(Object[][] arr, int index)
    {

        // Create another array of size one less
        Object[][] anotherArray = new Object[arr.length - 1][];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

}