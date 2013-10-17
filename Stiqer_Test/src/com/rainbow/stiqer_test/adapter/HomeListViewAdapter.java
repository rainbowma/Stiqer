package com.rainbow.stiqer_test.adapter;

import java.net.URI;
import java.util.ArrayList;

import com.rainbow.stiqer_test.activity.R;
import com.rainbow.stiqer_test.entity.UserPost;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeListViewAdapter extends BaseAdapter{

	private ArrayList<UserPost> userPostList = null;
	private Context context = null;
	
	public HomeListViewAdapter(ArrayList<UserPost> userPostList, Context context){
		this.userPostList = userPostList;
		this.context = context;
	}
	
	@Override
	public int getCount() {
		return userPostList == null ? 0 : userPostList.size();
	}

	@Override
	public Object getItem(int position) {
		return userPostList == null ? 0 : userPostList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//setup view
		LayoutInflater layoutInflater = LayoutInflater.from(this.context);
		View view = layoutInflater.inflate(R.layout.home_list_item, null);
		
		//get component
		ImageView headPortrait = (ImageView)view.findViewById(R.id.head_portrait);
		TextView userName = (TextView)view.findViewById(R.id.user_name);
		TextView storeDistance = (TextView)view.findViewById(R.id.store_distance);
		TextView userPostText = (TextView)view.findViewById(R.id.user_post_text);
		ImageView postedImage = (ImageView)view.findViewById(R.id.posted_image);
		
		//assign value to component
		UserPost userPost = (UserPost)getItem(position);
		if(userPost != null){
			//headPortrait.setImageURI(Uri.parse(Uri.encode(userPost.getHeadPortrait())));
			userName.setText(userPost.getUserName());
			storeDistance.setText(userPost.getStoreDistance());
			userPostText.setText(userPost.getPostText());
			//postedImage.setImageURI(Uri.parse(Uri.encode(userPost.getImage())));
		}
			
		return view;
	}

}
