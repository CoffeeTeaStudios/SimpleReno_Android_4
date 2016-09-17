package lawonga.simplereno_4.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lawonga.simplereno_4.base.BaseFragment;

/**
 * @Shared Created by Andy on 9/13/2016.
 * Job posting fragment to show our list of jobs
 * This is also reused!
 * Used for our customers
 */
public class JobPostingListFragment extends BaseFragment {

    public JobPostingListFragment getInstance() {
        JobPostingListFragment jobPostingListFragment = new JobPostingListFragment();
        Bundle args = new Bundle();
        jobPostingListFragment.setArguments(args);
        return jobPostingListFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
