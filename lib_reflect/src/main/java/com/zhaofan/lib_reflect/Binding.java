package com.zhaofan.lib_reflect;

import android.app.Activity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Binding {
    public static void bind(Activity activity){
//        for (Field field : activity.getClass().getDeclaredFields()) {
//            BindView bindView = field.getAnnotation(BindView.class);
//            if (bindView != null){
//                try {
//                    field.setAccessible(true);
//                    field.set(activity,activity.findViewById(bindView.value()));
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        try {
            Class className = Class.forName(activity.getClass().getCanonicalName()+"Binding");
            Constructor constructor = className.getConstructor(activity.getClass());
            constructor.newInstance(activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
