package com.example.lab03_task01;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment02activity extends Fragment {
    @Override
    public View onCreateView (LayoutInflater, ViewGroup container, Bundle savedInstance)
    {
        View inflater;
        return inflater.inflate(R.layout.fragment02, container, attachToRoot:false);

    }
}
