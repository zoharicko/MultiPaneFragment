package example.com.multipanefragment;

import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        int screenOrientaion =
                getResources().getConfiguration().orientation;
        if (screenOrientaion == Configuration.ORIENTATION_PORTRAIT){
            hideSidePanel();
        }
    }

    /**
     * Cool shortcuts:
     * ctrl + q : open object quick documantation
     * ctrl + O : quick override
     * ctrl + i : quick Implement
     * ctrl + d : duplicates the current line or the selected block
     * */

    private void hideSidePanel(){
        View sidePane = findViewById(R.id.side_panel);
        if (sidePane.getVisibility()== View.VISIBLE)
        {
            sidePane.setVisibility(View.GONE);
        }
    }
}
