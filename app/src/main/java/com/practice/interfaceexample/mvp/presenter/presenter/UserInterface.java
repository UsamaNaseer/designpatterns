package com.practice.interfaceexample.mvp.presenter.presenter;

import com.practice.interfaceexample.mvp.presenter.presenter.model.User;

/**
 * Created by subhan on 1/23/18.
 */

public interface UserInterface {

    public void onUserInfoChange();
    public void updateUser(User user);
    public void deleteUser(User user);
}
