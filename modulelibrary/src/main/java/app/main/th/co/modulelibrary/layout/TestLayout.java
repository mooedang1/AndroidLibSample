package app.main.th.co.modulelibrary.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import app.main.th.co.modulelibrary.R;

/**
 * Created by orapong on 11/7/2017 AD.
 */

public class TestLayout extends RelativeLayout implements View.OnClickListener{
    private OnEventListener mListener;
    public void setmListener(OnEventListener mListener) {
        this.mListener = mListener;
    }

    public interface OnEventListener{
        void OnClick();
    }

    public TestLayout(Context context) {
        super(context);
        setup();
    }

    public TestLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        setup();
    }

    public TestLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setup();
    }

    private void setup(){
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.main, this, true);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        mListener.OnClick();
    }
}
