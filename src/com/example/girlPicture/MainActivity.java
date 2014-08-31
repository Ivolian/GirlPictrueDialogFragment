package com.example.girlPicture;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        findViewById(R.id.btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        showDialogFragment();
    }

    private void showDialogFragment() {

        new GirlPictureDialogFragment().show(getFragmentManager(), GirlPictureDialogFragment.class.getName());
    }

}
