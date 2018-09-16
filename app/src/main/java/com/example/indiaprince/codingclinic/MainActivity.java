package com.example.indiaprince.codingclinic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int k=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //xml 잡아줌  layout

        final TextView text=findViewById(R.id.text);
        Button btn1=findViewById(R.id.button);
        btn1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(k%3==0) {
                    text.setText("HI");
                }
                else if(k%3==1){
                    text.setText("My Name Is");
                }
                else if(k%3==2){
                    text.setText("Hyeon Su Han");
                }
                k++;
            }
        });
    }
}




//버튼하고 이미지 추가 버튼 누르면 이벤트로 원래 있는 글 바꾸기