import java.util.*;

public class Grade {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        char Grade;
        float sub1 ,sub2, sub3, total_marks,average;
       System.out.println("Enter the marks of sub 1 :");
        sub1 = sc.nextInt();
       System.out.println("Enter the marks of sub 2 :");
        sub2 = sc.nextInt();
       System.out.println("Enter the marks of sub 3 :");
        sub3 = sc.nextInt();

        total_marks = sub1 +sub2 + sub3;
       System.out.println("Total marks : "+total_marks);
      average = (total_marks)/3;
      System.out.println("Average Marks : "+average);

      if(average >=90){
            Grade = 'A';
      }else if(average <90 && average >=80){
            Grade = 'B';
      }else if(average <80 && average >=70){
            Grade = 'C';
      }else if(average <70 && average >=60){
            Grade = 'D';
      }else if(average <60 && average >=50){
            Grade = 'E';
      }else{
            Grade = 'F';
      }
      System.out.println("Grade "+Grade);

      sc.close();

        }


    }



//Buffer reader vs Scanner Reader
//python tutor
