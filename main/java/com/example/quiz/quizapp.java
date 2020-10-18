package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class quizapp extends AppCompatActivity {
    private Button mtrue_button;
    private Button mfalse_button;
    private Button mnext_button;
    private Toast t1;
    private TextView ques_textv;
    private int initializer=0;

    private questions[] question_bank=new questions[]{
            new questions(R.string.ques1,false),
            new questions(R.string.ques2,false),
            new questions(R.string.ques3,true)
    };
    public void update_ques(){
        int quest=question_bank[initializer].getques_id();

        ques_textv.setText(quest);
    };
    void check_answer(boolean givenbool){
        int toast_textId;
        boolean correct_answer=question_bank[initializer].isans_true();
        if(givenbool==correct_answer){
            toast_textId=R.string.correct_toast;
        }
        else{
            toast_textId=R.string.incorrect_toast;
        }
        Toast.makeText(this,toast_textId,Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizapp);
        mtrue_button=(Button)findViewById(R.id.true_Button);
        mfalse_button=(Button)findViewById(R.id.false_Button);

        ques_textv=(TextView)findViewById(R.id.question);
        update_ques();
        mtrue_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                check_answer(true);

            }
        });
        mfalse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_answer(false);
            }
        });
        mnext_button=(Button)findViewById(R.id.next);
        mnext_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();
                initializer=rand.nextInt(3);
                update_ques();
            }
        });

    }
}