package com.example.cat_dog_mouse;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<String> animals;

    public Adapter(Context context, List<String> animals) {
        this.context = context;
        this.animals = animals;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout container; // added in part 2
        RecyclerView listView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            animals = itemView.findViewById(R.id.listView);
            container = itemView.findViewById(R.id.container);
        }
    }
}
