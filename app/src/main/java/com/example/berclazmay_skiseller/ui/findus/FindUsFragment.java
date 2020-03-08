package com.example.berclazmay_skiseller.ui.findus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.berclazmay_skiseller.R;

public class FindUsFragment extends Fragment {

    private com.example.berclazmay_skiseller.ui.findUs.FindUsViewModel findUsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        findUsViewModel =
                ViewModelProviders.of(this).get(com.example.berclazmay_skiseller.ui.findUs.FindUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_findus, container, false);
        final TextView textView = root.findViewById(R.id.text_findUs);
        findUsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
