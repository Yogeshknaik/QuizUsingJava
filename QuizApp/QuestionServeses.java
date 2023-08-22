package QuizApp;

import java.util.Scanner;

public class QuestionServeses {
    Question[] questions=new Question[3];
    String sel[]= new String[3];
    int score =0;

 public QuestionServeses(){
    questions[0]= new Question(1,"what is your name...?","yogesh","harish","ganavi","krish","yogesh");
    questions[1]= new Question(2,"what are u from...?","bglr","mysore","smg","i cant say","bglr");
    questions[2]= new Question(3,"best lang...?","java","c","c++","C#","java");

 }

 public void displayQue(){
    int i=0;
  for(Question q:questions){
System.out.println("----------------");
  System.out.println("questio no: "+q.getId());
  System.out.print("  1)"+q.getOp1());
  System.out.print("  2)"+q.getOp2());
  System.out.println();
  System.out.print("  3)"+q.getOp3());
  System.out.println("  4)"+q.getOp4());
  System.out.print("your ans:");
  Scanner sc =new Scanner(System.in);
  sel[i]=sc.nextLine();
  i++;
  }
  System.out.println("-------Answers---------");
  for(String s:sel){
    System.out.println(s);
}
}

public void printScore(){
    for(int i=0; i<questions.length;i++ ){
        Question que = questions[i];

    String ans=que.getAns();
    String userans= sel[i];
    if( ans.equals(userans)){
        score++;
    }
}
System.out.println("-------<score-board>---------");
System.out.println("your score is: "+score);

}
}