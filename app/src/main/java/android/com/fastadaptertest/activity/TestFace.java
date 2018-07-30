package android.com.fastadaptertest.activity;

import android.com.fastadaptertest.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class TestFace extends AppCompatActivity {

    private Button face_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_face);
        face_button = findViewById(R.id.face_button);
    }
}
