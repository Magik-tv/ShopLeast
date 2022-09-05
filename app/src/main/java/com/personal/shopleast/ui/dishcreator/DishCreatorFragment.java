package com.personal.shopleast.ui.dishcreator;

import android.os.Bundle;
import android.text.Annotation;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.personal.shopleast.databinding.FragmentDishcreatorBinding;

public class DishCreatorFragment extends Fragment {

    private FragmentDishcreatorBinding binding;
    private String dishFinalName;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DishCreatorViewModel dishCreatorViewModel =
                new ViewModelProvider(this).get(DishCreatorViewModel.class);

        binding = FragmentDishcreatorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final Button btnSaveDish = binding.btnDishSave;
        btnSaveDish.setOnClickListener(view -> {
            System.out.println("Dish $" + dishFinalName + "$ was saved ☺" );
            // save dish
        });

        final Button btnAddProduct = binding.btnAddProduct;
        btnAddProduct.setOnClickListener(view -> {
            System.out.println("Work in progress..." );
            // add product
        });

        final EditText dishName= binding.etxtDishName;
        dishName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                dishFinalName = dishName.getText().toString();
            }
        });

//        final TextView textView = binding.textDishcreator;
//        dishCreatorViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}