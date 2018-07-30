package android.com.fastadaptertest.activity;

import android.com.fastadaptertest.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pixplicity.easyprefs.library.Prefs;

public class PrefrenceTest extends AppCompatActivity {

    private EditText ed_test;
    private Button button_test;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prefrence_test);

        ed_test = findViewById(R.id.ed_test);
        button_test = findViewById(R.id.button_test);

        button_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String check = ed_test.getText().toString();
                Prefs.putString("Test", check);

                String data = Prefs.getString("Test", null);
                System.out.println("PrefrenceTest.onClick - - -" + data);
            }
        });


    }
}
