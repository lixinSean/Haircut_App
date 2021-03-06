package com.haircut.haircut_alpha.adapter;

import java.util.List;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class SalonDetailAdapter extends PagerAdapter{
	
	private List<View> viewlist;
	private Context context;
	
	public SalonDetailAdapter(List<View> viewlist,Context context) {
		this.viewlist =viewlist;
		this.context=context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return viewlist.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0==arg1;
	}
	
	//以下也是必要方法，不过要自己添加
	//实例化
	
	@Override
	public Object instantiateItem(View container, int position) {
		// TODO Auto-generated method stub
		((ViewPager)container).addView(viewlist.get(position));
		View view =viewlist.get(position);
		view.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int i =v.getId();
				String t="你点击了图片的图片id为："+i;
				Toast.makeText(context, t, Toast.LENGTH_LONG).show();
				
			
			}
			
		});
		return viewlist.get(position);				
	}
	 

	//销毁
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// TODO Auto-generated method stub
		container.removeView(viewlist.get(position));
	}
}
