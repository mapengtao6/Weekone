package com.bw.mapengtao20190218.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bw.mapengtao20190218.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    JSONArray data;
    Context context;

    final static int TYPE_ONE = 0;
    final static int TYPE_TWO = 1;

    public MyAdapter( Context context,JSONArray data) {
        this.data = data;
        this.context = context;
    }

//    获取条目
    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        if (TYPE_ONE == i){
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item1,null,false);

            MyViewHolder viewHolder = new MyViewHolder(view);

            return viewHolder;
        }else {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item2,null,false);

            MyViewHolder viewHolder = new MyViewHolder(view);

            return viewHolder;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        int itemViewType = getItemViewType(i);

        DisplayImageOptions options = new DisplayImageOptions
                .Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher_round)
                .build();

        if (itemViewType == 0){

            try {
                JSONObject jsonObject = data.getJSONObject(i);
                String title = jsonObject.getString("title");
                String pic = jsonObject.getString("pic");
                myViewHolder.item1_title1.setText(title);
//                ImageLoader.getInstance().displayImage(pic,myViewHolder.item1_image1,options);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            try {
                JSONObject jsonObject = data.getJSONObject(i);

                JSONArray data = jsonObject.getJSONArray("data");


                String title = jsonObject.getString("title");
                String pic = jsonObject.getString("pic");
                myViewHolder.item2_title1.setText(title);

//                ImageLoader.getInstance().displayImage(pic,myViewHolder.item2_image1,options);
//                ImageLoader.getInstance().displayImage(pic,myViewHolder.item2_image2,options);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int getItemCount() {
        return data.length();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView item1_title1;
        private final ImageView item1_image1;
        private final TextView item2_title1;
        private final ImageView item2_image1;
        private final ImageView item2_image2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item1_title1 = itemView.findViewById(R.id.item1_title1);
            item1_image1 = itemView.findViewById(R.id.item1_image1);

            item2_title1 = itemView.findViewById(R.id.item2_title1);
            item2_image1 = itemView.findViewById(R.id.item2_image1);
            item2_image2 = itemView.findViewById(R.id.item2_image2);


        }
    }
}
