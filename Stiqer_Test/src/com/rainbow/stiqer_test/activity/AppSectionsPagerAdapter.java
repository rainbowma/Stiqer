package com.rainbow.stiqer_test.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AppSectionsPagerAdapter extends FragmentPagerAdapter{

	public AppSectionsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
	        case 0:
	            // The first section of the app is the most interesting -- it offers
	            // a launchpad into the other demonstrations in this example application.
	        	return new LaunchpadSectionFragment();
	
	        case 1:
	        	return new DummySectionFragment();
	        default:
	            // The other sections of the app are dummy placeholders.
/*	        	
	            Fragment fragment = new DummySectionFragment();
	            Bundle args = new Bundle();
	            args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, i + 1);
	            fragment.setArguments(args);
	            return fragment;
*/
	        	return new UserProfileFragment();
		}
	}

	@Override
	public int getCount() {
		return 3;
	}
	
	@Override
    public CharSequence getPageTitle(int position) {
        //return "Section " + (position + 1);
    	String tabHome = new String("Home");
    	String tabNearby = new String("Nearby");
    	String tabProfile = new String("Profile");
    	CharSequence csHome = tabHome.subSequence(0, tabHome.length());
    	CharSequence csNearby = tabNearby.subSequence(0, tabNearby.length());
    	CharSequence csProfile = tabProfile.subSequence(0, tabProfile.length());
    	
    	switch(position){
    		case 0:	return csHome;
    		case 1: return csNearby;
    		case 2: return csProfile;
    		default: return csHome;
    	}
    }
}
