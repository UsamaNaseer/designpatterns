package com.practice.interfaceexample.mvp.presenter.presenter;

import android.app.Activity;
import android.content.Context;

import com.practice.interfaceexample.mvp.presenter.presenter.model.User;

/**
 * Created by subhan on 1/23/18.
 */

public class UserPresenter implements UserInterface {

    Context  context;
    User user ;
    Activity currentActivity;

    public void init(){
        user = new User();
        // yaha p user ki initial info
    }

    public UserPresenter(Context  context, Activity activity){
        this.context = context;
        this.currentActivity = activity;
    }

    @Override
    public void onUserInfoChange() {

        // do ur work jo b tm chahte ho k user info change p ho
        // ui p jo change hoga wo yaha s hoga acitivty p ye notification dega activity ko

    }

    @Override
    public void updateUser(User user) {
        // update user
    }

    @Override
    public void deleteUser(User user) {
        // delete user
    }
}
