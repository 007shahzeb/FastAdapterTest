package android.com.currentTime;

import android.com.fastadaptertest.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_time);
    }


    public void getCurrentTime(View view) {

//        Calendar calendar = Calendar.getInstance();
//        SimpleDateFormat mdformat = new SimpleDateFormat("HH:mm:ss");
//        String strDate = "Current Time : " + mdformat.format(calendar.getTime());
//        display(strDate);


        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        String date_str = df.format(cal.getTime());
        display(date_str);


    }

    private void display(String num) {
        TextView textView = (TextView) findViewById(R.id.current_time_view);
        textView.setText(num);
    }


}
