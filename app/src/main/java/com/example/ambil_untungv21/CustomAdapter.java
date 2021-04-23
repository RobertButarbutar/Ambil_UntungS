package com.example.ambil_untungv21;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<SetData>
{
    List<SetData> setData;
    int resource;
    Context context;

    public CustomAdapter (Context context, int resource, List<SetData> setData)
    {
        super(context, resource, setData);
        this.context = context;
        this.resource = resource;
        this.setData = setData;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        @SuppressLint("ViewHolder") View view = layoutInflater.inflate(resource, null, false);

        TextView text_title = view.findViewById(R.id.textTitle);
        TextView text_description = view.findViewById(R.id.textDescription);
        ImageView imageViewList = view.findViewById(R.id.listImage);
        ImageView imageViewLike = view.findViewById(R.id.like);
        ImageView imageShare = view.findViewById(R.id.share);

        imageViewLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "eh!!!! masi percobaan guys",Toast.LENGTH_SHORT).show();
            }
        });

        imageShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "share click",Toast.LENGTH_SHORT).show();
            }
        });


        final SetData setDataNew = setData.get(position);

        text_title.setText(setDataNew.getTitle());

        text_description.setText(setDataNew.getDescription());

        Picasso.get().load(setDataNew.getImage()).into(imageViewList);

        return view;
    }
}
