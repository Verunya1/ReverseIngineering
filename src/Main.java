import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //-игра проверка знаний по математике
        //-игра
        //-вопросы
        //-ответы
        //-количество правильных в процентах
        //-рейтинг

        Question question1 = new Question("Сколько будет 2+3?");
        Answer[] answer1 = {
                new Answer("1---5"),
                new Answer("2---10"),
                new Answer("3---7"),
        };

        question1.setAnswers(answer1);
        question1.setCorrect(1);

        Question question2 = new Question("Сколько будет 2*3?");
        Answer[] answer2 = {
                new Answer("1---5"),
                new Answer("2---10"),
                new Answer("3---6"),
        };
        question2.setAnswers(answer2);
        question2.setCorrect(2);

        Question question3 = new Question("Сколько будет 2^3?");
        Answer[] answer3 = {
                new Answer("1---5"),
                new Answer("2---8"),
                new Answer("3---7"),
        };
        question3.setAnswers(answer3);
        question3.setCorrect(3);
        ArrayList<Question> questionArrayList = new ArrayList<>();
        questionArrayList.add(question1);
        questionArrayList.add(question2);
        questionArrayList.add(question3);
        //int len= questionArrayList.size();
        Game game = new Game("Игра проверка знаний по математике ", questionArrayList);
        game.start();
    }
}
