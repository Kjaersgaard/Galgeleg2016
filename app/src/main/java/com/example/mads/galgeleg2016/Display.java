package com.example.mads.galgeleg2016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Mads on 10-05-2016.
 */
public class Display extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("Username");

        Button Blobby = (Button)findViewById(R.id.Blobby);
        Button Bstats = (Button)findViewById(R.id.Bstats);

        Blobby.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent i = new Intent(Display.this, JoinLobby.class);
                i.putExtra("ROBERT", "Mads");
                startActivity(i);

            }
        });

        Bstats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Display.this, WatchStats.class);
                i.putExtra("ROBERT", "Frederik");
                startActivity(i);

            }
        });


        TextView tv = (TextView)findViewById(R.id.TVusername);
        tv.setText(username);
    }
}
