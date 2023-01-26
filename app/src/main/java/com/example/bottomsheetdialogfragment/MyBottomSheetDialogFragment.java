package com.example.bottomsheetdialogfragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bottomsheetdialogfragment.model.Order;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MyBottomSheetDialogFragment extends BottomSheetDialogFragment {
    private Order mOrder;
    private TextView tvPrice, tvProduct, tvAddress;
    private Button btnCancel, btnPayment;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            mOrder = (Order) bundle.get("order_object_key");

        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);

        View viewDialog = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet_fragment, null);
        bottomSheetDialog.setContentView(viewDialog);

        initView(viewDialog);
        setDataorder();

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog.dismiss();
            }
        });

        /*BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View) viewDialog.getParent());
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });*/

        return bottomSheetDialog;
    }

    private void initView(View viewDialog) {
        tvPrice = viewDialog.findViewById(R.id.tv_price);
        tvProduct = viewDialog.findViewById(R.id.tv_product);
        tvAddress = viewDialog.findViewById(R.id.tv_delivery_address);
        btnCancel = viewDialog.findViewById(R.id.btn_cancel);
        btnPayment = viewDialog.findViewById(R.id.btn_payment);
    }

    private void setDataorder() {
        if (mOrder == null) {
            return;

        }

        tvPrice.setText(mOrder.getPrice());
        tvProduct.setText(mOrder.getListProductName());
        tvAddress.setText(mOrder.getDeliveryAddress());


    }
}
