package com.farm.weekend.gram.weekend_farm_user.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.util.UtilClass;

public class BuyDialogFragment extends DialogFragment {
    EditText Item_num;
    TextView Item_name;
    Button Apply_button;
    ImageView Clear;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buy_dialog, container);
        Apply_button = view.findViewById(R.id.apply_button);
        Item_num = view.findViewById(R.id.buying_item_num);
        Item_name = view.findViewById(R.id.buying_Item_Name);
        Apply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilClass.Toast(getContext(), "신청 되었습니다.");
                dismiss();
            }
        });

        Clear = view.findViewById(R.id.clear);
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return view;
    }
}
