package android.com.textviewCase;

import android.com.fastadaptertest.R;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    // https://en.proft.me/2017/07/22/decorating-textview-spannablestring-android/


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview_cases);


        TextView tvTitle = (TextView) findViewById(R.id.tvTitle);
        String text = "Give us a rating...";

        // initialize a new ClickableSpan
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "us", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                int color = ContextCompat.getColor(MainActivity.this, R.color.colorPrimary);
                ds.setColor(color);
                ds.setUnderlineText(false);
            }
        };

        // initialize a new SpannableStringBuilder instance
        SpannableStringBuilder ssBuilder = new SpannableStringBuilder(text);

// apply the clickable text to the span
        ssBuilder.setSpan(
                clickableSpan, // span to add
                text.indexOf("us"), // start of the span (inclusive)
                text.indexOf("us") + String.valueOf("us").length(), // end of the span (exclusive)
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE // do not extend the span when text add later
        );

// underline
        ssBuilder.setSpan(
                new UnderlineSpan(),
                text.indexOf("Give"),
                text.indexOf("Give") + String.valueOf("Give").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );

// bold
        ssBuilder.setSpan(
                new StyleSpan(Typeface.BOLD),
                text.indexOf("Give"),
                text.indexOf("Give") + String.valueOf("Give").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        tvTitle.setText(ssBuilder);

// this step is mandated for the url and clickable styles
        tvTitle.setMovementMethod(LinkMovementMethod.getInstance());
        tvTitle.setHighlightColor(Color.TRANSPARENT);


        ssBuilder.setSpan(
                new ForegroundColorSpan(Color.RED),
                text.indexOf("Give"),
                text.indexOf("Give") + String.valueOf("Give").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        ssBuilder.setSpan(new ForegroundColorSpan(Color.BLUE),
                text.indexOf("us"), text.indexOf("us") +
                        String.valueOf("us").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        ssBuilder.setSpan(
                new ForegroundColorSpan(Color.GREEN),
                text.indexOf("rating"),
                text.indexOf("rating") + String.valueOf("rating").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        tvTitle.setText(ssBuilder);


    }
}
