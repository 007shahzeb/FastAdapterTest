package android.com.recyclerviewClickHandleHere;

import android.app.Dialog;
import android.com.fastadaptertest.R;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Window;
import android.widget.Toast;

import com.kaopiz.kprogresshud.KProgressHUD;

public class ClcikHandledActivity extends AppCompatActivity {

    // https://github.com/AlexZhukovich/RecyclerViewClickListener/blob/master/app/src/main/res/values/arrays.xml
    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;
    private ClickHandledAdapter clickHandledAdapter;
    private String[] mList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handled_click);


        findingIdsHere();
        initializingRecyclerViewHere();
//        loadingDialog();

//        newDia();


    }

    private void newDia() {

        KProgressHUD.create(ClcikHandledActivity.this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel("Please wait")
                .setCancellable(true)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)
                .show();
    }

    private void initializingRecyclerViewHere() {

        mList = getResources().getStringArray(R.array.numbers);

        staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        clickHandledAdapter = new ClickHandledAdapter(getApplicationContext(), mList);
        recyclerView.setAdapter(clickHandledAdapter);


    }

    private void loadingDialog() {


        final Dialog progressDialog = new Dialog(this);
        progressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        progressDialog.setContentView(R.layout.custom_dialog_progress);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        progressDialog.setCancelable(false);

        progressDialog.show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Toast.makeText(getApplicationContext(), "Test", Toast.LENGTH_SHORT).show();
                progressDialog.cancel();
                progressDialog.hide();

            }

        }, 1000);


//      if(progressDialog != null)
//                    {
//                        progressDialog.cancel();
//                        progressDialog.hide();
//                    }


    }

    private void findingIdsHere() {
        recyclerView = findViewById(R.id.recyclerView);

    }
}
