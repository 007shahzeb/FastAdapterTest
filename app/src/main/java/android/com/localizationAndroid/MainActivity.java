package android.com.localizationAndroid;

import android.com.fastadaptertest.R;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button_English, button_Arabic, button_fRENCH;
    private TextView textView_English, textView_Arabic, textView_fRENCH;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locale_main);

        findingIdsHere();
        eventListener();


    }

    private void eventListener() {

        button_English.setOnClickListener(this);
        button_Arabic.setOnClickListener(this);
        button_fRENCH.setOnClickListener(this);

    }


    private void findingIdsHere() {

        button_English = findViewById(R.id.button11);
        button_Arabic = findViewById(R.id.button12);
        button_fRENCH = findViewById(R.id.button13);

        textView_English = findViewById(R.id.textView4);
        textView_Arabic = findViewById(R.id.textView5);
        textView_fRENCH = findViewById(R.id.textView6);

    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.button11:


                Locale locale = new Locale("en");
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                Toast.makeText(this, getResources().getString(R.string.english), Toast.LENGTH_SHORT).show();

                textView_English.setText(getResources().getString(R.string.english));

//                LocaleHelper.setLocale(this, "en");
                break;


            case R.id.button12:


                Locale locale1 = new Locale("ar");
                Locale.setDefault(locale1);
                Configuration config1 = new Configuration();
                config1.locale = locale1;
                getBaseContext().getResources().updateConfiguration(config1, getBaseContext().getResources().getDisplayMetrics());
                Toast.makeText(this, getResources().getString(R.string.arabic), Toast.LENGTH_SHORT).show();
                textView_Arabic.setText(getResources().getString(R.string.arabic));

//                LocaleHelper.setLocale(this, "ar");
                break;


            case R.id.button13:

                Locale locale2 = new Locale("fr");
                Locale.setDefault(locale2);
                Configuration config2 = new Configuration();
                config2.locale = locale2;
                getBaseContext().getResources().updateConfiguration(config2, getBaseContext().getResources().getDisplayMetrics());
                Toast.makeText(this, getResources().getString(R.string.french), Toast.LENGTH_SHORT).show();
                textView_fRENCH.setText(getResources().getString(R.string.french));

//                LocaleHelper.setLocale(this, "ar");
                break;


        }


    }
}
