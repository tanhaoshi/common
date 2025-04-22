package org.angmarch.views;

import android.content.Context;

import java.util.List;

/**
 * create by ths on 2021/3/22
 */
public class NormalSpinnerAdapter<T> extends NiceSpinnerBaseAdapter {

    private List<T> items;

    public NormalSpinnerAdapter(Context context, List<T> items, int textColor, int backgroundSelector,
                         SpinnerTextFormatter spinnerTextFormatter) {
        super(context, textColor, backgroundSelector, spinnerTextFormatter);
        this.items = items;
    }

    @Override public int getCount() {
        return items.size() == 0 ? 0 : items.size();
    }

    @Override public T getItem(int position) {
        return items.get(position);
    }

    @Override public T getItemInDataset(int position) {
        return items.size() == 0 ? null : items.get(position);
    }
}
