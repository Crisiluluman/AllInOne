package com.example.allinone;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {


    List<PostItem> postItemList;
    OnListItemClickListener listener;

    public PostAdapter(List<PostItem> postItemList, OnListItemClickListener listener)
    {
        this.postItemList = postItemList;
        this.listener = listener;
    }



    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.post_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        holder.postItemName.setText(postItemList.get(position).getPostItemName());
        holder.postItemImage.setImageResource(postItemList.get(position).getPostItemIconId());

    }

    @Override
    public int getItemCount()
    {
        return postItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView postItemName;
        ImageView postItemImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(getAdapterPosition());
                }
            });
            postItemName = itemView.findViewById(R.id.post_name);
            postItemImage = itemView.findViewById(R.id.post_image);
        }
    }



    public interface OnListItemClickListener
    {
        void onClick(int position);
    }
}
