package android.com.sharedPreference;


import android.app.Activity;
import android.com.fastadaptertest.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // UI References
    private TextView textTxt;
    private String text;

    private Preference sharedPreference;
    Activity context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedPreference = new Preference();

        findViewsById();

        //Retrieve a value from SharedPreference
        text = sharedPreference.getValue(context);
        textTxt.setText(text);

    }

    private void findViewsById() {
        textTxt = (TextView) findViewById(R.id.txt_text);
    }


}