package com.example.mynabers;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.zip.Inflater;

import de.hdodenhof.circleimageview.CircleImageView;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.Holder> {

    private ArrayList<neighbor> mNeighbors;


    public recyclerAdapter(ArrayList<neighbor> mNeighbors) {
        this.mNeighbors = mNeighbors;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_one, parent, false);
        return new recyclerAdapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.set(mNeighbors.get(position));
    }

    @Override
    public int getItemCount() {
        return mNeighbors.size();
    }


    public class Holder extends RecyclerView.ViewHolder {

        private CircleImageView mCircleImageView;
        private TextView firstName;
        private TextView lastName;
        private neighbor myneighbor;
        private Bitmap bmp = null;


        public Holder(@NonNull View itemView) {
            super(itemView);
            mCircleImageView = itemView.findViewById(R.id.profile_image);
            firstName = itemView.findViewById(R.id.PO_titel);
            lastName = itemView.findViewById(R.id.PO_text);
        }

        public void set(neighbor n) {
            myneighbor = n;
//            mCircleImageView.setImageResource();
            firstName.setText(n.getFirstName());
            lastName.setText(n.getLastName());

//            Runnable r = new Runnable() {
//                @Override
//                public void run() {
//                    URL url = null;
//                    try {
//                        url = new URL(myneighbor.getUrl());
//                    } catch (MalformedURLException e) {
//                        e.printStackTrace();
//                    }
//                    try {
//                        bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    new Handler(Looper.getMainLooper()).post(new Runnable() {
//                        @Override
//                        public void run() {
//                            mCircleImageView.setImageBitmap(bmp);
//                        }
//                    });
//                }
//
//                ;
//            };
//            Thread t = new Thread(r);
//            t.start();
//        }
            mCircleImageView.setImageResource(R.drawable.ic_launcher_background);
        }
    }
}
