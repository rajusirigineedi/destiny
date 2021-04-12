package com.mini14.destiny.adaprers;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.mini14.destiny.FinalActivity;
import com.mini14.destiny.R;
import com.mini14.destiny.SelectTopicsActivity;

import java.util.ArrayList;
import java.util.List;

public class SelectTopicRecyclerView extends RecyclerView.Adapter<SelectTopicRecyclerView.ViewHolder> {
    List<String> topicsList;
    Context context;
    Dialog dialog;

    public SelectTopicRecyclerView(List<String> topicsList) {
        this.topicsList = topicsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        dialog  = new Dialog(context);
        View view = LayoutInflater.from(context).inflate(R.layout.select_topic_bar,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        viewHolder.topicname.setText(topicsList.get(i));
        if(SelectTopicsActivity.resultSet.contains(topicsList.get(i))){
            viewHolder.selectTopoic.setVisibility(View.VISIBLE);
        }else{
            viewHolder.selectTopoic.setVisibility(View.INVISIBLE);
        }
        viewHolder.totalbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SelectTopicsActivity.resultSet.contains(topicsList.get(i))){
                    SelectTopicsActivity.resultSet.remove(topicsList.get(i));
                    viewHolder.selectTopoic.setVisibility(View.INVISIBLE);
                }else{
                    SelectTopicsActivity.resultSet.add(topicsList.get(i));
                    viewHolder.selectTopoic.setVisibility(View.VISIBLE);
                }
            }
        });
        viewHolder.totalbar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showDialog(i);
                return false;
            }
        });
        viewHolder.topicImaage.setImageResource(SelectTopicsActivity.imageIds.get(i));
        makeAnimate(viewHolder.totalbar);

    }

    private void showDialog(int i) {
        dialog.setContentView(R.layout.selectedtopiccard);
        ImageView imageView = dialog.findViewById(R.id.topoicImagecard);
        TextView topicname  = dialog.findViewById(R.id.topicnameCard);
        TextView desc = dialog.findViewById(R.id.topicdetailscard);
        topicname.setText(topicsList.get(i));
        desc.setText(SelectTopicsActivity.descriptions.get(i));
        imageView.setImageResource(SelectTopicsActivity.imageIds.get(i));
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    @Override
    public int getItemCount() {
        return topicsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView topicImaage ;
        TextView topicname;
        ImageView selectTopoic;
        View totalbar;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            topicImaage = itemView.findViewById(R.id.topoic_image);
            topicname = itemView.findViewById(R.id.topicname);
            selectTopoic = itemView.findViewById(R.id.selectTopic);
            totalbar = itemView.findViewById(R.id.totalbar);

        }
    }
    private  void makeAnimate(View view){
        Animation animation = AnimationUtils.loadAnimation(context,R.anim.fadeanimationso);
        view.startAnimation(animation);
    }
}
