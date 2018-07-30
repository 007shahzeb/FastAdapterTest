package android.com.recyclerviewClickHandleHere;

import android.com.fastadaptertest.R;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ClickHandledAdapter extends RecyclerView.Adapter<ClickHandledAdapter.HandledViewHolder> {


    private Context mContext;
    private String[] mList;


    public ClickHandledAdapter(Context context, String[] mList) {
        this.mContext = context;
        this.mList = mList;

    }


    @NonNull
    @Override
    public HandledViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);

        HandledViewHolder handledViewHolder = new HandledViewHolder(view);
        return handledViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull HandledViewHolder holder, int position) {


        holder.textView.setText(mList[position]);

        holder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (isLongClick) {
                    Toast.makeText(mContext, "#" + position + " - " + mList[position] + " (Long click)", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mContext, "#" + position + " - " + mList[position], Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    @Override
    public int getItemCount() {
        return mList.length;
    }


    public class HandledViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {


        private TextView textView;
        private ItemClickListener clickListener;

        public HandledViewHolder(View itemView) {
            super(itemView);


            textView = itemView.findViewById(R.id.textView);
            itemView.setTag(itemView);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }


        public void setClickListener(ItemClickListener itemClickListener) {
            this.clickListener = itemClickListener;
        }


        @Override
        public void onClick(View v) {

            Toast.makeText(v.getContext(), "Test", Toast.LENGTH_SHORT).show();

            clickListener.onClick(v, getPosition(), false);
        }

        @Override
        public boolean onLongClick(View v) {
            clickListener.onClick(v, getPosition(), true);
            return true;
        }


    }
}
