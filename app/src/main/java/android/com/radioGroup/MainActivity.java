package android.com.radioGroup;

import android.com.fastadaptertest.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_group);


        Button btn = (Button) findViewById(R.id.btn);
        final TextView tv_result = (TextView) findViewById(R.id.tv_result);
        final RadioGroup rg = (RadioGroup) findViewById(R.id.rg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int selectedRadioButtonID = rg.getCheckedRadioButtonId();

                if (selectedRadioButtonID != -1) {

                    RadioButton selectedRadioButton = (RadioButton) findViewById(selectedRadioButtonID);

                    String selectedRadioButtonText = selectedRadioButton.getText().toString();

                    tv_result.setText(selectedRadioButtonText + " selected.");
                }
                else{
                    tv_result.setText("Nothing selected from Radio Group.");
                }

            }
        });


    }
}
