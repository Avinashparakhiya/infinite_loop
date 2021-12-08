public class bubble_short {

    public static void print(int x){
        System.out.println(x+" ");
    }


    public static void main(String[] args) {
        int a[]={-2,-4,0,4,67,2,12,1,23};
        int n=a.length;
        for(int i=0; i<n-1 ; i++){
            for(int j=0; j<n-1; j++){
                if (a[j+1] < a[j]){
                    int temp= a[j+1];
                        a[j+1]=a[j];
                         a[j]=temp;
                }
            }
        }
        for(int item:a)
        print(item);
    }
}
