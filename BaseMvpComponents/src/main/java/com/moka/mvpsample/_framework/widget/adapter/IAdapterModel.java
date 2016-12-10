package com.moka.mvpsample._framework.widget.adapter;


import android.view.View;

import java.util.List;


interface IAdapterModel {

	List<ItemData> getItemList();

	void add(ItemData data);

	void add(int index, ItemData data);

	void addAll(List<ItemData> items);

	void remove(ItemData item);

	void addHeaderView(View headerView);

	void addFooterView(View footerView);

	void removeHeaderView();

	void removeFooterView();

	void clear();

	void notifyItemChanged(ItemData data);

}