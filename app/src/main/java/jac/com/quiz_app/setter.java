package jac.com.quiz_app;

public class setter {

    public int image;
    public int answer;

    public setter(int answer, int image) {
        this.image = image;
        this.answer = answer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
