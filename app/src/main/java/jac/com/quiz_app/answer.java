package jac.com.quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.LinearLayoutManager.VERTICAL;

public class answer extends AppCompatActivity {

    private List<setter> answerList = new ArrayList<>();
    private RecyclerView anserRecyclerView;
    private RecyclerViewVerticalListAdapter answerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(jac.com.quiz_app.R.layout.answers);

        anserRecyclerView = (RecyclerView) findViewById(jac.com.quiz_app.R.id.idRecyclerViewVerticalList);
        // add a divider after each item for more clarity
        anserRecyclerView.setHasFixedSize(true);
        final LinearLayoutManager lm = new LinearLayoutManager(answer.this);
        lm.setOrientation(VERTICAL);
        anserRecyclerView.setLayoutManager(lm);
        anserRecyclerView.setItemAnimator(new DefaultItemAnimator());
        DividerItemDecoration itemDecor = new DividerItemDecoration(this, VERTICAL);
        anserRecyclerView.addItemDecoration(itemDecor);
        answerAdapter = new RecyclerViewVerticalListAdapter(answerList, getApplicationContext());
        anserRecyclerView.setAdapter(answerAdapter);
        populateanswerList();
    }




    private void populateanswerList(){
        setter quiz1 = new setter(jac.com.quiz_app.R.string.question1, jac.com.quiz_app.R.drawable.question);
        setter answ1 = new setter(jac.com.quiz_app.R.string.answer1, jac.com.quiz_app.R.drawable.tick);
        setter quiz2 = new setter(jac.com.quiz_app.R.string.question2, jac.com.quiz_app.R.drawable.question);
        setter answ2 = new setter(jac.com.quiz_app.R.string.answer2, jac.com.quiz_app.R.drawable.tick);
        setter quiz3 = new setter(jac.com.quiz_app.R.string.question3, jac.com.quiz_app.R.drawable.question);
        setter answ3 = new setter(jac.com.quiz_app.R.string.answer3, jac.com.quiz_app.R.drawable.tick);
        setter quiz4 = new setter(jac.com.quiz_app.R.string.question4, jac.com.quiz_app.R.drawable.question);
        setter answ4 = new setter(jac.com.quiz_app.R.string.answer4, jac.com.quiz_app.R.drawable.tick);
        setter quiz5 = new setter(jac.com.quiz_app.R.string.question5, jac.com.quiz_app.R.drawable.question);
        setter answ5 = new setter(jac.com.quiz_app.R.string.answer5, jac.com.quiz_app.R.drawable.tick);

        answerList.add(quiz1);
        answerList.add(answ1);
        answerList.add(quiz2);
        answerList.add(answ2);
        answerList.add(quiz3);
        answerList.add(answ3);
        answerList.add(quiz4);
        answerList.add(answ4);
        answerList.add(quiz5);
        answerList.add(answ5);
        answerAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(answer.this, MainActivity.class);
        startActivity(i);
        this.finish();
    }
}
