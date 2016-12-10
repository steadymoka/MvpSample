package com.moka.mvpsample._framework.widget.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;


public abstract class RecyclerItemView<DATA extends ItemData> extends RecyclerView.ViewHolder {

	private int index;
	private ItemData data;

	public RecyclerItemView(View itemView) {
		super(itemView);
	}

	public RecyclerItemView(Context context, View itemView) {
		super(itemView);
	}

	public View findViewById(int resId) {
		return itemView.findViewById(resId);
	}

	public void setData(DATA data) {
		this.data = data;
		refreshView(data);
	}

	public void setIndex(int index) {
		this.index = index;
	}

	protected abstract void refreshView(DATA data);

}
