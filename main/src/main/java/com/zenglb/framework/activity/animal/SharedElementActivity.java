package com.zenglb.framework.activity.animal;

import android.os.Bundle;
import android.widget.TextView;

import com.zenglb.baselib.base.BaseActivity;
import com.zenglb.framework.R;
import com.zenglb.framework.retrofit2.result.JokesResult;


/**
 * 测试共享元素
 *
 */
public class SharedElementActivity extends BaseActivity {
    private TextView topic;
    private TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupWindowAnimations();
    }

    private void setupWindowAnimations() {
        // We are not interested in defining a new Enter Transition. Instead we change default transition duration
        getWindow().getEnterTransition().setDuration(500);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_shared_animal;
    }

    @Override
    protected void initViews() {
        setToolBarTitle("Shared element transition");
        JokesResult jokesResult = (JokesResult) getIntent().getExtras().getSerializable("jokesResult");
        topic=(TextView) findViewById(R.id.topic);
        time=(TextView) findViewById(R.id.time);
        topic.setText(jokesResult.getTopic());
        time.setText(jokesResult.getStart_time());
    }
}
