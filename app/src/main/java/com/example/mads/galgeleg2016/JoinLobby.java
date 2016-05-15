package com.example.mads.galgeleg2016;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Mads on 15-05-2016.
 */
public class JoinLobby extends Activity {
    int j = 1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joinlobby);

        final EditText Gæt =(EditText)findViewById(R.id.GuessText);
        Button ok = (Button)findViewById(R.id.Bok);
        TextView Forkert  =(TextView)findViewById(R.id.Wrong);
        TextView Hot =(TextView)findViewById(R.id.Hot);
        final ImageView Image =(ImageView)findViewById(R.id.imageView);
        TextView Tid =(TextView)findViewById(R.id.TVtime);
        TextView ord =(TextView)findViewById(R.id.TVWord);

        Initialise(Image);

        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String s = Gæt.getText().toString();
                j++;
                if (j > 9) {
                    j = 1;
                }
                NextImage(Image, j);
            }
        });
    }
    public void  Initialise(ImageView image){
        image.setImageResource(R.drawable.stage1);
    }
    public void NextImage(ImageView image, int i){

        switch (i) {
            case 1:  image.setImageResource(R.drawable.stage1);
                break;
            case 2:  image.setImageResource(R.drawable.stage2);
                break;
            case 3:  image.setImageResource(R.drawable.stage3);
                break;
            case 4:  image.setImageResource(R.drawable.stage4);
                break;
            case 5:  image.setImageResource(R.drawable.stage5);
                break;
            case 6:  image.setImageResource(R.drawable.stage6);
                break;
            case 7:  image.setImageResource(R.drawable.stage7);
                break;
            case 8:  image.setImageResource(R.drawable.stage8);
                break;
            case 9:  image.setImageResource(R.drawable.stage9);
                break;
        }
    }
        public void setWrongText (TextView textview, ArrayList<String> list){
            StringBuilder listString = new StringBuilder();
            for (String s : list){
                listString.append(s+", ");
            }
            textview.setText(listString);
    }
}