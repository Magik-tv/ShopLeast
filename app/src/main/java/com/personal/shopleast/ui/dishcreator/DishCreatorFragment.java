package com.personal.shopleast.ui.dishcreator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.personal.shopleast.databinding.FragmentDishcreatorBinding;

public class DishCreatorFragment extends Fragment {

    private FragmentDishcreatorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DishCreatorViewModel dishCreatorViewModel =
                new ViewModelProvider(this).get(DishCreatorViewModel.class);

        binding = FragmentDishcreatorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDishcreator;
        dishCreatorViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}