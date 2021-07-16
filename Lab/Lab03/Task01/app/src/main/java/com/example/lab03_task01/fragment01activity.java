package com.example.lab03_task01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class fragment01activity extends Fragment {
    @Override
    public View onCreateView (LayoutInflater, ViewGroup container, Bundle savedInstance)
    {
        View inflater;
        return inflater.inflate(R.layout.fragment01, container, attachToRoot:false);
        
    }
}
