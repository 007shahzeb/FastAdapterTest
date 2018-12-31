package android.com.callFrahmentMethodFromActivity;

import android.com.fastadaptertest.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityOne extends AppCompatActivity {


    private Button button14;
    private My listener;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one1);


        button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                listener.myAction();


            }
        });

    }

    public void setListener(My listener) {
        this.listener = listener;
    }


}
