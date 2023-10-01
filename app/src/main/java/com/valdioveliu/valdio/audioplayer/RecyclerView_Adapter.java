package com.valdioveliu.valdio.audioplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final List<Audio> audioList;
    private final Context context;

    public RecyclerViewAdapter(List<Audio> audioList, Context context) {
        this.audioList = audioList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Audio audio = audioList.get(position);
        holder.title.setText(audio.getTitle());
    }

    @Override
    public int getItemCount() {
        return audioList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView playPause;

        ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            playPause = itemView.findViewById(R.id.play_pause);
        }
    }
}
