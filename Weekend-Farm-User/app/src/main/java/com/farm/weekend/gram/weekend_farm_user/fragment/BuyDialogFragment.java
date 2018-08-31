package com.farm.weekend.gram.weekend_farm_user.fragment;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.farm.weekend.gram.weekend_farm_user.R;

public class BuyDialogFragment extends Dialog {
    EditText Item_num;
    TextView Item_name;
    Button Apply_button;

    public BuyDialogFragment(View.OnClickListener context){
        super((Context) context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_buy_dialog);
        Apply_button = findViewById(R.id.apply_button);
        Apply_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }
}
