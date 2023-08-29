import java.util.Scanner;
class  Insertion{

    public static void insertion(int arr []){

        if(arr.length == 0){
            return;
        }
        for(int i=1; i<arr.length; i++){

        int curr = arr[i];
        int j = i-1;
        while(j >= 0 && curr < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = curr;
    }
    for(int i=0; i<arr.length; i++){
        System.out.print("-> "+arr[i]);
    }
    
    } 
    public static void insert(int arr []){
        int n= arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for(int i=0; i<arr.length; i++){
         System.out.print("->"+arr[i]);
    
    }
    }

    
    public static void main(String args[]){
        System.out.println("hello world");
        //initialize a array 
        int arr [] = new int [5];

        System.out.println("enter the element of array");
        //i wil  a scanner class here 
        Scanner sc = new Scanner(System.in);

        //this loop will scaning the data from the user
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        insertion(arr);



        // System.out.println("after scannig the data");
        // for(int i=0; i<arr.length-1; i++){
        //     int smallest = i;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[j] < arr[smallest]){
        //             smallest =j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[smallest];
        //     arr[smallest] = temp;
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.print("->"+arr[i]);
        // }
    }
}