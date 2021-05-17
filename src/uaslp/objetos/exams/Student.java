package uaslp.objetos.exams;

public class Student
{
   private String name;
   private int code;
   private int score[][];
   double average;

   public Student(String name, int key)
   {
      this.name = name;
      this.code = key;
      score = new int [3][2];
      average = 0.0;
   }

   public void setScore(int partial, int score)
   {
      this.score[partial-1][0] = partial;
      this.score[partial -1][1] = score;
   }

   public double getAverage()
   {
      average =0;
      for(int i = 0;i < 3; i++)
      {
         average = average + score[i][1];
      }
      return average;
   }

   public String getName()
   {
      return name;
   }

   public int getCode() {
      return code;
   }
}
