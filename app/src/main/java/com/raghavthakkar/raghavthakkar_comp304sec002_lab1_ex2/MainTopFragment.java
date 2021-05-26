package com.raghavthakkar.raghavthakkar_comp304sec002_lab1_ex2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.fragment.app.Fragment;

import com.raghavthakkar.raghavthakkar_comp304sec002_lab1_ex2.databinding.FragmentTopBinding;

import java.util.ArrayList;
import java.util.List;


public class MainTopFragment extends Fragment {

   private FragmentTopBinding binding;


    public MainTopFragment() {
        // Required empty public constructor
    }


    public static MainTopFragment newInstance() {
        MainTopFragment fragment = new MainTopFragment();
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
        View root = inflater.inflate(R.layout.fragment_top, container, false);
        binding=FragmentTopBinding.inflate(inflater,container,false);
        List<String> name = new ArrayList<>();
        name.add("AIActivity");
        name.add("VRActivity");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, name);
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(getActivity(), AIActivity.class));
                } else {
                    startActivity(new Intent(getActivity(), VRActivity.class));
                }
            }
        });
        return binding.getRoot();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }
}