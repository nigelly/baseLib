package com.tcn.vendingappplugin;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.SkinAppCompatDelegateImpl;

import java.io.File;

import skin.support.SkinCompatManager;
import skin.support.utils.SkinFileUtils;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textTest);

        textView.setText(R.string.test_name);

    //    Log.d("print",new File(SkinFileUtils.getSkinDir(this), "app-debug.skin").getAbsolutePath());
    }


    public void querySlot(View view) {
     //   SkinCompatManager.getInstance().loadSkin("app-debug.skin", null, CustomSDCardLoader.SKIN_LOADER_STRATEGY_SDCARD);
      //  SkinCompatManager.getInstance().loadSkin("app-debug.skin", SkinCompatManager.SKIN_LOADER_STRATEGY_ASSETS);
    }

    public void startPlug(View view) {
      //  SkinCompatManager.getInstance().restoreDefaultTheme();
    }

//    @NonNull
//    @Override
//    public AppCompatDelegate getDelegate() {
//        return SkinAppCompatDelegateImpl.get(this, this);
//    }
}
