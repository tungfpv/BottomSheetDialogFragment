package com.example.bottomsheetdialogfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bottomsheetdialogfragment.model.Order;
import com.example.bottomsheetdialogfragment.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn_show_bottom_dialo_fragment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomSheetDialogFragment();
            }
        });
    }

    private void showBottomSheetDialogFragment() {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));
        productList.add(new Product("bim bim"));
        productList.add(new Product("bim bim2"));
        productList.add(new Product("bim bim3"));
        productList.add(new Product("bim bim4"));

        Order order = new Order("500 VND", productList, "Hanoi");
        MyBottomSheetDialogFragment myBottomSheetDialogFragment = new MyBottomSheetDialogFragment();
        myBottomSheetDialogFragment.setCancelable(false);
        Bundle bundle = new Bundle();
        bundle.putSerializable("order_object_key", order);
        myBottomSheetDialogFragment.setArguments(bundle);

        myBottomSheetDialogFragment.show(getSupportFragmentManager(), myBottomSheetDialogFragment.getTag());
    }
}