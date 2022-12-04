package BasicQuest;

public class Search {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int s=4;
        search(a,s);
    }
    public static void search(int []a,int s){
        for(int i=0;i< a.length;i++){
            if (a[i]==s){
                System.out.println("The searching element are present at index :"+i);
            }
        }
    }
}
