package dy2019;

import java.util.Scanner;

public class GradeEx {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   
      Scanner sc = new Scanner(System.in);  
      System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
      int math = sc.nextInt();
      int science = sc.nextInt();
      int english = sc.nextInt();
      Grade avg = new Grade(math, science, english);
      System.out.println("평균은 "+avg.average());
      
      sc.close();
   }

}