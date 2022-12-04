package BasicQuest;

public class Maximum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(maxi(a));
    }

    private static int maxi(int[] a) {
        int maximum=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>maximum){
                maximum=a[i];
            }
        }
        return maximum;
    }
}
