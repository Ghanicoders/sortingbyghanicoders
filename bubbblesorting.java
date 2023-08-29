import java.util.*;
class bubble{
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
    }
}