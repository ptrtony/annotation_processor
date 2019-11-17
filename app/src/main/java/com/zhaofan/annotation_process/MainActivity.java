package com.zhaofan.annotation_process;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zhaofan.lib_annotations.BindView;
import com.zhaofan.libs.Binding;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textview)TextView textview;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        Binding.bind(this);
    }
}
