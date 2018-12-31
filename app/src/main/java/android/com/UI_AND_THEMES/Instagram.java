package android.com.UI_AND_THEMES;

import android.com.fastadaptertest.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class Instagram  extends AppCompatActivity {



    private Button insta;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_themes);


        insta = findViewById(R.id.button2);


    }
}
