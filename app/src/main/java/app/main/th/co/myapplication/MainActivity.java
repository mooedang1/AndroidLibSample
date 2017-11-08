package app.main.th.co.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import app.main.th.co.modulelibrary.Config;
import app.main.th.co.modulelibrary.layout.TestLayout;
import app.main.th.co.modulelibrary.layout.TestLayout.OnEventListener;

public class MainActivity extends AppCompatActivity implements OnEventListener {
    TestLayout testLayout;
    String name1 = Config.App.name1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testLayout = (TestLayout) findViewById(R.id.TestLayout);
        testLayout.setmListener(this);
    }

    @Override
    public void OnClick() {
        Toast.makeText(getBaseContext(), "testLayout" , Toast.LENGTH_LONG).show();
    }
}
