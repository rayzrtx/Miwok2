package com.example.android.miwok2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by raylinares on 12/22/17.
 */

/**
 * {@link CategoryFragmentPagerAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Word} objects.
 */
public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryFragmentPagerAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //Returns the number of fragments(pages) n the app
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position){
        if (position == 0){
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyMembersFragment();
        } else if (position == 2){
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1){
            return mContext.getString(R.string.category_family);
        } else if (position == 2){
            return mContext.getString(R.string.category_colors);
        } else if (position == 3){
            return mContext.getString(R.string.category_phrases);
        } else return null;
    }
}
