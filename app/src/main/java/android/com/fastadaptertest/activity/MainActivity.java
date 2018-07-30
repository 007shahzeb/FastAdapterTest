package android.com.fastadaptertest.activity;

import android.com.fastadaptertest.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// https://github.com/inmite/android-validation-komensky

import eu.inmite.android.lib.validations.form.FormValidator;
import eu.inmite.android.lib.validations.form.annotations.MaxLength;
import eu.inmite.android.lib.validations.form.annotations.MinLength;
import eu.inmite.android.lib.validations.form.annotations.NotEmpty;
import eu.inmite.android.lib.validations.form.callback.SimpleErrorPopupCallback;

public class MainActivity extends AppCompatActivity {

    private Button button;


//    @NotEmpty(messageId = R.string.validation_name) //Ediitext  Not Empty
//    @MinLength(value = 3, messageId = R.string.validation_name_length, order = 2)

    @MaxLength(value = 5, messageId = R.string.validation_max_lenght, order = 2)
    // its for minimum number in edittext

    private EditText userName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        userName = findViewById(R.id.userName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                submit();
            }
        });


    }

    private void submit() {

        FormValidator.validate(this, new SimpleErrorPopupCallback(this));
    }
}
