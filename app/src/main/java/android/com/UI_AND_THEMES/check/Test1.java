package android.com.UI_AND_THEMES.check;

import android.com.fastadaptertest.R;
import android.com.payU.MainActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Test1 extends AppCompatActivity {


    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        findingIdsHere();
        takingClicks();


    }

    private void takingClicks() {


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Test1.this, SecndActivity.class);
                startActivity(intent);
            }
        });

    }


    private void findingIdsHere() {

        button = findViewById(R.id.onclick);


    }


}
