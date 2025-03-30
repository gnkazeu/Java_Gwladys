package Java_Assignment_2;


public class Array {
    static void Q1(){  //Question 1
        int[] a = {1,2,3,4,8,9,14};
    int len = a.length;
    int sum = 0;

    for (int i = 0; i <len; i++) {
       sum = sum + a[i];
    }
        System.out.println("Sum of Array elements is " +  sum);
    }

    static void Q2(){
        int[] a = {1,2,3,4,8,9,14};
    int len = a.length;
    int sum = 0;
    int average = 0;

    for (int i = 0; i <len; i++) {
        sum = sum + a[i];
        average = sum / len;
       
    }
        System.out.println("average of Array elements is " +  average);
    }

    static void Q3(){
        int[] a = {1,2,3,4,8,9,14};
    int len = a.length;

    for (int i = 0; i <len; i++) {
        if (a[i]% 2 == 0) {
            System.out.println("The array number " + i + " is even");
        } else {
            System.out.println("The array number " + i + " is odd");
        }
       
    }
        
    }

    static void Q4(){
        int[] a = {1,2,3,4,8,14};
    int len = a.length;
    int miss = 9;
    int j = 0;
    for (int i = 0; i <len; i++) {
        if (a[i] != miss) {
            j ++;
        } 
        }
        if (j == len);
            System.out.println("Number 9 is missing ");
       
    }

    static void Q5(){
        int[] a = {1,2,3,4,8,9,14};
    int len = a.length;
    int j = a[0];
    int k = a[0];
    for (int i = 0; i <len; i++) {
        if (a[i] > j) {
            j = a[i];
        } 
        if (a[i] < k) {
            k = a[i];
        } 
          
       } 
      System.out.println(" The greatest number is " + j);
      System.out.println(" The smallest number is " + k);
}
    static void Q6(){
    int[] a = {1,2,3,4,2,9,14};
    int len = a.length;
    for (int i = 0; i <len; i++) {
        int j = a[i];

    for (int k = 0; k < len; k++) {
        if (a[k] == j) {
            if(i !=k){
                System.out.println("The duplicate number is " + j +" index position is " + i);
            }
    } }
       
   } 
  
}
    
    public static void main (String[] args) {

    Q1();
    Q2();
    Q3();
    Q4();
    Q5();
    Q6();

} 
    
}

    
