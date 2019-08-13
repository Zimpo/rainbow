package com.zimpo.mysik.rainbow;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zimpo on 09/10/17.
 */

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.SikViewHolder> {

    Context context;
    ArrayList<String> stories;
    OnItemClickListener listener;

    public interface OnItemClickListener
    {
        void onItemClickListener(String story);
    }

    public StoryAdapter(Context context, OnItemClickListener listener)
    {
        this.context = context;
        this.listener = listener;
        stories = new ArrayList<>();
    }

    public void insertAll(List<String> stories)
    {
        this.stories.clear();
        this.stories.addAll(stories);
        notifyDataSetChanged();
    }

    public void insertItem(String story, int pos)
    {
        stories.add(pos, story);
        notifyDataSetChanged();
    }

    @Override
    public SikViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_story, parent, false);
        SikViewHolder sikViewHolder = new SikViewHolder(view);
        return sikViewHolder;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(SikViewHolder holder, int position) {
        holder.Bind(stories.get(position));
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }


    public class SikViewHolder extends RecyclerView.ViewHolder
    {
        //VARIABLES
        CardView cardView;
        TextView nameTV;

        public SikViewHolder(View itemView) {
            super(itemView);
            //GET COMPONENT
            cardView = (CardView) itemView.findViewById(R.id.storyCV);
            nameTV = (TextView) itemView.findViewById(R.id.storyTV);
        }

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        public void Bind(final String story) {

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClickListener(story);
                }
            });

            nameTV.setText(story);
        }
    }
}
