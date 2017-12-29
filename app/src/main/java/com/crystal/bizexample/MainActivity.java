package com.crystal.bizexample;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.Button;

import com.crystal.bizexample.activity.AppBaseActivity;
import com.crystal.bizexample.activity.LoginActivity;
import com.crystal.bizexample.activity.PersonalActivity;
import com.crystal.bizexample.entity.User;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppBaseActivity {

    @BindView(R.id.btn_login)
    Button mBtnLogin;
    @BindView(R.id.btn_login_before_jump)
    Button mBtnLoginBeforeJump;
    @BindView(R.id.login_before_execute)
    Button mLoginBeforeExecute;

    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void initVariables() {
        mUser = new User();
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {

    }

    @Override
    protected void loadData() {

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @OnClick({R.id.btn_login, R.id.btn_login_before_jump, R.id.login_before_execute})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                startActivity(new Intent(this, LoginActivity.class));
                break;

            case R.id.btn_login_before_jump:
                if (mUser.isLogin()){
                    Intent intent = new Intent(this, PersonalActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("pageinfo", "pageinfo");
                    startActivity(intent, bundle);
                }else {
                    startActivity(new Intent(this,LoginActivity.class));
                }
                break;

            case R.id.login_before_execute:
                break;
        }
    }
}
