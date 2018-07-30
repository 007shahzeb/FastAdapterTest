package android.com.fastadaptertest.adapter;

import android.com.fastadaptertest.R;
import android.com.fastadaptertest.viewHolder.SimpleItemViewHolder;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mikepenz.fastadapter.items.AbstractItem;

public class SimpleItem extends AbstractItem<SimpleItem, SimpleItemViewHolder> {


    @Override
    public int getType() {
        return R.id.fastadapter_sample_item_id;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.row_items;
    }


    @NonNull
    @Override
    public SimpleItemViewHolder getViewHolder(View v) {
        return null;
    }
}
