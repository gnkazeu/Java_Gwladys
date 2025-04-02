package Java_Assignment_2;


public class Array_2d {
    static void Q1(){  //Question 1
    
    // initialize variables
    float[] [] grade_students = {{10, 15, 7}, {12, 5, 18}};
    float sum_student_a=0;
    float sum_student_b=0;

    // looping to get sum of grades
    for (int i = 0; i < grade_students.length; ++i) {
        for (int j = 0; j < grade_students[i].length; ++j) {
            if (i == 0) {
                sum_student_a += grade_students[i][j]; 
            } else if (i == 1) {
                sum_student_b += grade_students[i][j]; 
            }
      }
    } 
    // compute averages  
    float average_student_a = sum_student_a / grade_students[0].length;
    float average_student_b = sum_student_b / grade_students[1].length;
      
    // print results
    System.out.println("Question 1 ... ");
    System.out.println("Average of student A is " + average_student_a);
    System.out.println("Average of student B is " + average_student_b);
    System.out.println(" ");

    }

    static void Q2(){ // Question 2
    // assign variables matrix a and b are supposed to be same size
    int [] [] matrix_a = {{10, 15, 7}, {12, 5, 18}};
    int [] [] matrix_b = {{1, 5, 71}, {2, 25, 8}};
    int [] [] sum_matrix = {{0, 0, 0}, {0, 0, 0}};
    // loop to sum matrixes
    for (int i = 0; i < matrix_a.length; ++i) {
        for (int j = 0; j < matrix_a[i].length; ++j) {
            sum_matrix[i][j] = matrix_b[i][j] + matrix_a[i][j] ; 
            System.out.println(" sum matrix column " + i + " row   " +  j + " is " + sum_matrix[i][j]);
      }
    }
     
    }


    
    public static void main (String[] args) {

    Q1();
    Q2();


} 
    
}

    
