package algorithms;

public class MaxNumLtoR {
    public static void main (String[] args) {

        int[] arrayList = {0, 3, 5, 6, 1, 2, 4};

        int girri = arrayList.length;
        int sum = 0;

        for (int i = 0; i < girri; i++) {
            if (sum == 0) {
                sum += arrayList[i];
            } else if (arrayList[i] < 2 ){
                sum += arrayList[i];
            } else{
                sum *= arrayList[i];
            }
        }
        System.out.println(sum);
    }
}
