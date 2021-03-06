package com.wilddog.conversation.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wilddog.conversation.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DeclarActivity extends AppCompatActivity {

    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declar);
        content = (TextView) findViewById(R.id.tv_content);

        String declarData = parseDeclarData();

        content.setText(declarData);
    }

    private String parseDeclarData() {
        StringBuilder sb=new StringBuilder();
        InputStream inputStream = null;
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            inputStream = getAssets().open("declaration.txt");
            reader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(reader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    bufferedReader = null;
                }
                if (reader != null) {
                    reader.close();
                    reader = null;
                }
                if (inputStream != null) {
                    inputStream.close();
                    inputStream = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
