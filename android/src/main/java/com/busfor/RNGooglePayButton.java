package com.busfor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;


public class RNGooglePayButton extends RelativeLayout {

    public RNGooglePayButton(Context context) {
        super(context);

        View view =  LayoutInflater.from(getContext()).inflate(
                R.layout.buy_with_googlepay_button, null);

        this.addView(view);
    }
}