package com.moka.mvpsample._framework.widget.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.*;


public abstract class BaseAdapter<DATA extends ItemData, VIEW extends RecyclerItemView<DATA>> extends HeaderFooterRecyclerViewAdapter implements IAdapterModel, IAdapterView {

	private DATA headerData;
	private DATA footerData;

	private View headerView;
	private View footerView;

	private List<DATA> items;

	public void setItems(List<DATA> items) {
		if ( null != items )
			this.items = items;
		notifyDataSetChanged();
	}

	@Override
	protected int getHeaderItemCount() {
		if ( null == headerView )
			return 0;
		else
			return 1;
	}

	@Override
	protected int getFooterItemCount() {
		if ( null == footerView )
			return 0;
		else
			return 1;
	}

	@Override
	protected int getContentItemCount() {
		return items.size();
	}

	/**
	 */

	@Override
	protected RecyclerView.ViewHolder onCreateHeaderItemViewHolder(ViewGroup parent, int headerViewType) {
		return new HeaderFooter(headerView);
	}

	@Override
	protected RecyclerView.ViewHolder onCreateFooterItemViewHolder(ViewGroup parent, int footerViewType) {
		return new HeaderFooter(footerView);
	}

	@Override
	protected abstract RecyclerView.ViewHolder onCreateContentItemViewHolder(ViewGroup parent, int contentViewType);

	/**
	 */

	@Override
	protected void onBindHeaderItemViewHolder(RecyclerView.ViewHolder headerViewHolder, int position) {
		if ( headerViewHolder instanceof RecyclerItemView && null != headerData ) {
			RecyclerItemView itemView = (RecyclerItemView) headerViewHolder;
			itemView.setData(headerData);
		}
	}

	@Override
	protected void onBindFooterItemViewHolder(RecyclerView.ViewHolder footerViewHolder, int position) {
		if ( footerViewHolder instanceof RecyclerItemView && null != footerData ) {
			RecyclerItemView itemView = (RecyclerItemView) footerViewHolder;
			itemView.setData(footerData);
		}
	}

	@Override
	protected void onBindContentItemViewHolder(RecyclerView.ViewHolder contentViewHolder, int position) {
		VIEW itemView = (VIEW) contentViewHolder;
		itemView.setIndex(position);
		itemView.setData(items.get(position));
	}

	/**
	 */


	@Override
	public List<ItemData> getItemList() {
		if ( null != items )
			return (List<ItemData>) items;
		else
			return new ArrayList();
	}

	@Override
	public void add(ItemData data) {
		if ( null != data ) {
			items.add((DATA) data);
			notifyDataSetChanged();
		}
	}

	@Override
	public void add(int index, ItemData data) {
		if ( 0 <= index && index <= items.size() && null != data ) {
			items.add(index, (DATA) data);
			notifyDataSetChanged();
		}
	}

	@Override
	public void addAll(List<ItemData> items) {
		if ( null != items && 0 < items.size() && this.items.addAll((Collection<? extends DATA>) items) )
			notifyDataSetChanged();
	}

	@Override
	public void remove(ItemData item) {
		if ( null != item ) {
			this.items.remove(item);
			notifyDataSetChanged();
		}
	}

	@Override
	public void addHeaderView(View headerView) {
		this.headerView = headerView;
		notifyDataSetChanged();
	}

	@Override
	public void addFooterView(View footerView) {
		this.footerView = footerView;
		notifyDataSetChanged();
	}

	@Override
	public void removeHeaderView() {
		this.headerView = null;
		notifyDataSetChanged();
	}

	@Override
	public void removeFooterView() {
		this.footerView = null;
		notifyDataSetChanged();
	}

	@Override
	public void clear() {
		if ( null != items ) {
			this.items = new ArrayList<>();
			notifyDataSetChanged();
		}
	}

	@Override
	public void notifyItemChanged(ItemData data) {
		int index = items.indexOf(data);
		if ( index < 0 )
			return;
		notifyContentItemChanged(index);
	}

	@Override
	public void refresh() {
		notifyDataSetChanged();
	}

	/**
	 */

	private class HeaderFooter extends RecyclerView.ViewHolder {

		public HeaderFooter(View itemView) {
			super(itemView);
		}
	}

}
