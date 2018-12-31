package android.com.callFrahmentMethodFromActivity;

import android.app.Fragment;
import android.com.fastadaptertest.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FragmentOne extends Fragment implements My {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);
//        setListener(new FragmentOne());


        return view;
    }

    @Override
    public void myAction() {

        Toast.makeText(getActivity(), "Click happening", Toast.LENGTH_SHORT).show();

    }


}
