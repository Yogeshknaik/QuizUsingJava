package QuizApp;

public class Question {

   private int id;
   private String question;
   private String op1,op2,op3,op4;
   private String ans;
public Question(int id, String question, String op1, String op2, String op3, String op4, String ans) {
    this.id = id;
    this.question = question;
    this.op1 = op1;
    this.op2 = op2;
    this.op3 = op3;
    this.op4 = op4;
    this.ans = ans;
}
public int getId() {
    return id;
}
public String getQuestion() {
    return question;
}
public String getOp1() {
    return op1;
}
public String getOp2() {
    return op2;
}
public String getOp3() {
    return op3;
}
public String getOp4() {
    return op4;
}
public String getAns() {
    return ans;
}

    
}
