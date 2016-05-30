package com.cloudicalabs.waterfinder.water_rem;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {


    private LayoutInflater inflater;
    List<Listen> data = Collections.emptyList();
    public int selectedPos;

    public ListAdapter(Context context, List<Listen> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Listen current = data.get(position);
        holder.text1.setText(current.text);
        holder.imge.setImageResource(current.img);
        if (position == selectedPos) {
            holder.itemView.setBackgroundColor(Color.BLUE);
        } else {
            holder.itemView.setBackgroundColor(Color.CYAN);
        }
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView text1;
        public ImageView imge;

        public MyViewHolder(View itemView) {
            super(itemView);
            text1 = (TextView) itemView.findViewById(R.id.texty);
            imge = (ImageView) itemView.findViewById(R.id.ivy);
            itemView.setClickable(true);
            imge.setOnClickListener(this);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            notifyItemChanged(selectedPos);
            selectedPos = getAdapterPosition();
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
