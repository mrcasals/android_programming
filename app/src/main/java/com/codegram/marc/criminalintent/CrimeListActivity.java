package com.codegram.marc.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by marc on 1/14/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
