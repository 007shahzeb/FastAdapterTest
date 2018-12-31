package android.com.ratingbar;

import android.com.fastadaptertest.R;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar, ratingBar2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_ratingbar);


        ratingBar = findViewById(R.id.ratingBar3);
        ratingBar2 = findViewById(R.id.ratingBar2);

//        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
//            try {
//                Drawable progressDrawable = ratingBar2.getProgressDrawable();
//                if (progressDrawable != null) {
//                    DrawableCompat.setTint(progressDrawable, ContextCompat.getColor(this, R.color.colorPrimary));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }


        Drawable drawable = ratingBar.getProgressDrawable();
        drawable.setColorFilter(Color.parseColor("#0064A8"), PorterDuff.Mode.SRC_ATOP);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                Toast.makeText(MainActivity.this, "Rating changed, current rating " + ratingBar.getRating(),
                        Toast.LENGTH_SHORT).show();


                ratingBar2.setRating(ratingBar.getRating());


            }
        });
    }
}
