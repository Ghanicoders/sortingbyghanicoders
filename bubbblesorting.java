import java.util.*;
class bubble{

    public static void sorting(int arr []) {
        if(arr.length == 0){
            return;

        }

        //this two loop wiiil sorting here
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // and this loop will print the  all element after sorting
        for(int i=0; i<arr.length; i++){
            System.out.print("-> "+arr[i]);
        }
    }
    public static void main (String args []){
        System.out.println("hello world");
        //i will make here a array in size of 5
        int arr [] = new int [5];

        // now i am going to make a Scanner class for inputing elements
        Scanner input = new Scanner (System.in);

        //this will tels the to input 
        System.out.println("enter the elements of array ");

        //thids loop will run from 0 to array length 
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        //System elements of array secsesfully inputed
        System.out.println("after arrr.element inputed");

         // befor sorting array elements looks like 
         for(int i=0; i<arr.length; i++){
            System.out.print("-> "+arr[i]);
         }
         System.out.println();
         sorting(arr);
         System.out.println();
         for(int i=0; i<arr.length; i++){
            System.out.print("-> "+arr[i]);
         }
    }
}