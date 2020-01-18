package com.zhishi;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.zhishi.utils.OkHttpUtil;

public class MainActivity extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.send);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**初始化线程 形参传OkHttpUtil对象*/
                Thread thread=new Thread(new OkHttpUtil());
                /**开启线程*/
                thread.start();
            }
        });

    }
}
