import java.util.Arrays;

public class marge_twoarrays {
    public static void main(String[] args) {
        int[]array1={1,2,3,4,5,6};
        int[]array2={7,8,9,10,11,12,13};
        int[]merage=new int[array1.length+array2.length];
//        for(int i=0;i<array1.length;i++)
//        {
//            merage[i]=array1[i];
//        }
//        for(int i=0;i<array2.length;i++)
//        {
//            merage[i+array1.length]=array2[i];
//        }
        System.out.println(Arrays.toString(merage));
    }
}
