package com.example.cardlessonactivity.android;

/**
 * Created by Sophie on 27/11/2016.
 */

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.DialogFragment;

import com.example.cardlessonactivity.R;


public class CustomDialogBox extends DialogFragment {
    Button yesButton;
    Button noButton;

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState ) {
        View view= inflater.inflate(R.layout.custom, container);
        yesButton = (Button) view.findViewById(R.id.yes);
        noButton = (Button) view.findViewById(R.id.no);

        yesButton.setOnClickListener(buttonListener);
        noButton.setOnClickListener(buttonListener);

        return view;
    }

    private OnClickListener buttonListener = new OnClickListener()
    {
        public void onClick(View v)
        {
            if (v.getId() == R.id.yes) {
                ((MainActivity) getActivity()).customDialogYes();
            }
            dismiss();
        }
    };
}