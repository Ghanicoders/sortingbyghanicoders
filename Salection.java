import java.util.Scanner;
class Salectionsort{
    public static void ssort(int arr2 []){
        if(arr2.length == 0){
            return;
        }
        for(int i=0; i<arr2.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr2.length; j++){
                if(arr2[j] < arr2[min]){
                    min =j;
                    if(min != i){
                    int temp =arr2[min];
                    arr2[min] = arr2[i];
                    arr2[i] = temp;
                }
            }
            }
        }
        for(int i = 0; i<arr2.length; i++){
            System.out.print("->"+arr2[i]);
        }
    }
    
    public static void main (String args[]){
        System.out.println("helli world");

        int arr2[] = new int[5];

        System.out.println("enter the elements of a arr2 ");
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();

        }
        //befor sorting arr2
        for(int i=0; i<arr2.length; i++){
            System.out.print("-> "+arr2[i]);
        }
        System.out.println();
        ssort(arr2);
    }
}