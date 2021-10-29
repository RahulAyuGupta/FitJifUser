package com.fitjifuser.ui.MyWorkout.adapter;


import com.fitjifuser.ui.MyWorkout.ScheduleWorkoutFragment;
import com.fitjifuser.ui.MyWorkout.UpcomingWorkoutFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0:
                UpcomingWorkoutFragment upcomingWorkoutFragment= new UpcomingWorkoutFragment();
                return upcomingWorkoutFragment;

            case 1:
                ScheduleWorkoutFragment scheduleWorkoutFragment = new ScheduleWorkoutFragment();
                return scheduleWorkoutFragment;
                default:
            return  null;
    }

    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){
        switch (position) {
            case 0:
                return "Upcoming Workout ";
                case 1:
              return "Scheduled Workout";
            default:
                return null;
        }

    }

}
