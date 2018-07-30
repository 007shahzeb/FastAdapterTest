package android.com.sharedPreference;

import android.com.fastadaptertest.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PreferenceActivity extends AppCompatActivity {


    // https://gist.github.com/chintansoni202/f1767fbe68f7f897cfb3096e8cd83480


    private EditText edString, edInt, edFloat, edDouble, edLong, edBoolean;
    private Button button3;
    SharedPreferenceUtils sharedPreferenceUtils;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preference_activity);

        edString = findViewById(R.id.edString);
        edInt = findViewById(R.id.edInt);
        edFloat = findViewById(R.id.edFloat);
        edDouble = findViewById(R.id.edDouble);
        edLong = findViewById(R.id.edLong);
        edBoolean = findViewById(R.id.edBoolean);

        button3 = findViewById(R.id.button3);



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                String stringValue = edString.getText().toString();
                String intValue = edString.getText().toString();
                String floatValue = edString.getText().toString();
                String doubleValue = edString.getText().toString();
                String longValue = edString.getText().toString();
                String booleanValue = edString.getText().toString();




            }
        });


    }
}
