package com.rainbow.stiqer_test.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class UserProfileFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.user_profile_layout, container, false);
		
		rootView.findViewById(R.id.btn_scan)
		.setOnClickListener(new View.OnClickListener() {						
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		return rootView;
	}
	
}
