package com.raghavthakkar.raghavthakkar_comp304sec002_lab1_ex2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.raghavthakkar.raghavthakkar_comp304sec002_lab1_ex2.databinding.FragmentBottomBinding;


public class BottomFragment extends Fragment {

    private FragmentBottomBinding binding;

    public BottomFragment() {
        // Required empty public constructor
    }


    public static BottomFragment newInstance() {
        BottomFragment fragment = new BottomFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), R.string.on_create_view, Toast.LENGTH_SHORT).show();
        binding=FragmentBottomBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    public void displayData(String name){
        binding.tv.setText(binding.tv.getText()+name);
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), R.string.on_start, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}