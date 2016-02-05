package com.example.amineelouattar.pfe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btna, btnb, btnc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btna = (Button) findViewById(R.id.grpa);
        btnb = (Button) findViewById(R.id.grpb);
        btnc = (Button) findViewById(R.id.grpc);

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FindServices.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
