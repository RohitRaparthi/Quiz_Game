import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String selection[] = new String[5];

    public QuestionService() {

        questions[0] = new Questions(1, "Where is Punjab", "India", "Pakistan", "Usa", "China", "India");
        questions[1] = new Questions(2, "Where is Visakhapatnam", "AP", "TamilNadu", "Karnataka", "Kerala", "AP");
        questions[2] = new Questions(3, "Where is Hyderabad","Ap", "Telangana", "Tamilnadu", "Kerala", "Telangana");
        questions[3] = new Questions(4, "What is the capital of India", "Mumbai", "Bengaluru", "Delhi", "Agra", "Delhi");
        questions[4] = new Questions(5, "What is capital of Telangana", "Amaravati", "Hyderabad", "Bengaluru", "Bhubaneswar", "Hyderabad");
    }

    public void Playquiz(){
        int i = 0; 
        for (Questions q : questions){
            System.out.println("Question no:" + q.getId());
            System.out.println(q.getQuestions());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++; 
        }
        for (String s : selection){
            System.out.println(s);
        }
    }

    public void Printscore(){
        int score = 0;
        for (int i = 0; i < questions.length; i++){

            Questions que = questions[i];
            String actualanswer = que.getAnswer();
            String useranswer = selection[i];

            if (actualanswer.equals(useranswer)){

                score++;
            }
        }
        System.out.println("Your Score is " + score);
    }


}
