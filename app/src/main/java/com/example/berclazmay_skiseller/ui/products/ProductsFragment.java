package com.example.berclazmay_skiseller.ui.products;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.berclazmay_skiseller.DisplayProductsActivity;
import com.example.berclazmay_skiseller.R;
import com.example.berclazmay_skiseller.ui.home.HomeFragment;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class ProductsFragment extends Fragment implements View.OnClickListener {

//    private ProductsViewModel productsViewModel;
//
//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        productsViewModel =
//                ViewModelProviders.of(this).get(ProductsViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_products, container, false);
//        final TextView textView = root.findViewById(R.id.text_products);
//        productsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//
//        return root;
//    }

    Button myButton;

    private ProductsViewModel productsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        productsViewModel =
                ViewModelProviders.of(this).get(ProductsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_products, container, false);
        final TextView textView = root.findViewById(R.id.text_products);
        productsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        View myView = inflater.inflate(R.layout.fragment_products, container, false);
        myButton = (Button) myView.findViewById(R.id.button_displayProducts);
        myButton.setOnClickListener(this);
        return myView;
    }

//    @Override
//    public void onClick(View v) {
//        Toast.makeText(getActivity(),"Products displayed !",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(getActivity(), DisplayProductsActivity.class);
//        startActivity(intent);
//    }

    @Override
    public void onClick(View v) {
        HomeFragment fragment2 = new HomeFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment2);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
