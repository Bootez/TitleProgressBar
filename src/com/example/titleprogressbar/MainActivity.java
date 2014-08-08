package com.example.titleprogressbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.activity_main);
        
        Button show = (Button)findViewById(R.id.btn_show);
        show.setOnClickListener(new showButtonListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    class showButtonListener implements OnClickListener {
        @Override
        public void onClick(View v) {
//            setProgressBarIndeterminate(true);
//            setProgressBarVisibility(true);
//            setProgress(4500);
            
            setProgressBarIndeterminateVisibility(true);
            setProgressBarVisibility(true);
            setProgress(4500);

        }
    }

}
