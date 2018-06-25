package com.mock.jt.myapplication.base;


import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        Application.class,
})
public interface ApplicationComponent {

}
