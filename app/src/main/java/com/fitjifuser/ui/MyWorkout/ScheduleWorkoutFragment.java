package com.fitjifuser.ui.MyWorkout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fitjifuser.R;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;


public class ScheduleWorkoutFragment extends Fragment {

    private View view;
    private ActionBar actionBar;
    private TextView titleTV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view != null){
            ViewGroup parent =(ViewGroup) view.getParent();
            if (parent != null)
                parent.removeView(view);
        }
        try {
            view = inflater.inflate(R.layout.schedule_workout_fragment, container, false);
        } catch (Exception e) { }
        return view;
    }



    private void setupActionBar(){
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
        actionBar.setHomeAsUpIndicator(R.drawable.abc_ic_ab_back_material);
        actionBar.setDisplayShowCustomEnabled(true);
        ActionBar.LayoutParams param = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
        LayoutInflater inflator = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.title_bar_view, null);
        titleTV = (TextView) v.findViewById(R.id.title_txt);
        titleTV.setText("My Workout");
        titleTV.setTextColor(Color.WHITE);
        actionBar.setCustomView(v,param);

    }

}

