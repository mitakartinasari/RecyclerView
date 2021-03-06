package com.mitakartinasari.jobsheet3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private Context context;
    private LayoutInflater mInflater;
    private List<String> mWorList;

    public WordListAdapter(Context context, List<String> worList){
        this.mInflater=LayoutInflater.from(context);
        this.mWorList=worList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.item_word,viewGroup,false);
        return new WordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder wordViewHolder, int i) {
        String mCurrent = mWorList.get(i);
        wordViewHolder.titleText.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWorList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView titleText;

        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.word_title);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "test", Toast.LENGTH_SHORT).show();

        }
    }
}

