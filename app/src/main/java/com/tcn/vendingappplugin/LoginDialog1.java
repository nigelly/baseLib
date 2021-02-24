package com.tcn.vendingappplugin;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

public class LoginDialog1 extends Dialog {
    private ImageView closeImage;
    private Button button;
    private int resouceId = 0;
    private Context mContext;
    private View view;

    public Button getButton() {
        return button;
    }

    //
//    private callBackButton mCallback;
//    public void setCallback(callBackButton callback) {
//        this.mCallback = callback;
//    }
//
//    public interface callBackButton {
//        void onCallback(View view);
//    }

    public LoginDialog1(Context context) {
        super(context);
        mContext = context;
    }

    public LoginDialog1(Context context, int ResouceId) {
        super(context);
        mContext = context;
        resouceId = ResouceId;
    }

    public LoginDialog1(Context context, View view) {
        super(context);
        mContext = context;
        this.view = view;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (resouceId == 0) {
//            setContentView(R.layout.login_dialog);
//        } else {
            setContentView(view);
            //  setContentView(resouceId);
      //  }

        closeImage = view.findViewById(android.R.id.text1);
        button = view.findViewWithTag("button1");
//        button.setBackground(getContext().getDrawable(R.drawable.btn_blue_border_selector));
//        mCallback.onCallback(button);

        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        button.setBackgroundColor(getContext().getColor(R.color.skin_red));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }

}
