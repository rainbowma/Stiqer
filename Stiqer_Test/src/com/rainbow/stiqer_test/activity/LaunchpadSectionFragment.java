package com.rainbow.stiqer_test.activity;

import java.util.ArrayList;

import com.rainbow.stiqer_test.adapter.HomeListViewAdapter;
import com.rainbow.stiqer_test.entity.UserPost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class LaunchpadSectionFragment extends Fragment {
	
	ArrayList<UserPost> userPostList = new ArrayList<UserPost>();;
    UserPost userPost1 = new UserPost();
    UserPost userPost2 = new UserPost();
	
	
	HomeListViewAdapter homeListViewAdapter;
	ListView homeListView;
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		setupData();
    	View rootView = inflater.inflate(R.layout.fragment_section_launchpad, container, false);            
    	homeListView = (ListView)rootView.findViewById(R.id.home_listview);
    	homeListView.setAdapter(homeListViewAdapter);
    	
    	homeListView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});            
    	
        rootView.findViewById(R.id.btn_scan)
        		.setOnClickListener(new View.OnClickListener() {						
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
					}
				});
        return rootView;
	}
	
	private void setupData(){
		userPost1.setHeadPortrait("http://www.easou.org/files/article/image/0/308/308s.jpg");
	    userPost1.setUserName("Rainbow");
	    userPost1.setStoreDistance("2min");
	    userPost1.setPostText("Hello World");
	    userPost1.setImage("http://www.easou.org/files/article/image/0/308/308s.jpg");
	    
	    userPost2.setHeadPortrait("http://www.easou.org/files/article/image/0/308/308s.jpg");
	    userPost2.setUserName("Rainbow");
	    userPost2.setStoreDistance("2min");
	    userPost2.setPostText("Hello World");
	    userPost2.setImage("http://www.easou.org/files/article/image/0/308/308s.jpg");
	    
	    userPostList.add(userPost1);
	    userPostList.add(userPost2);
	    homeListViewAdapter = new HomeListViewAdapter(userPostList, getActivity().getApplicationContext());
	}
}
