package com.example.carlogoinformation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    private ArrayList<Car> cars;
    ItemClicked activity;


    public CarAdapter(Context context,ArrayList<Car> list) {
        cars = list;
        activity = (ItemClicked) context;

    }

    public interface ItemClicked
    {
        void onItemClicked(int index);
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvModel,tvOwner;
        ImageView imgMake;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvModel = (itemView).findViewById(R.id.tvModel);
            tvOwner = (itemView).findViewById(R.id.tvOwner);
            imgMake = (itemView).findViewById(R.id.imgMake);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    activity.onItemClicked(cars.indexOf((Car) v.getTag()));

                }
            });
        }
    }

    @NonNull
    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CarAdapter.ViewHolder viewHolder, int i) {

        viewHolder.itemView.setTag(cars.get(i));

        viewHolder.tvModel.setText(cars.get(i).getModel());
        viewHolder.tvOwner.setText(cars.get(i).getOwner());

        if(cars.get(i).getMake().equals("volkswagen"))
        {
            viewHolder.imgMake.setImageResource(R.drawable.volkswagen);
        }
        else if (cars.get(i).getMake().equals("nissan"))
        {
            viewHolder.imgMake.setImageResource(R.drawable.nissan);
        }
        else
        {
            viewHolder.imgMake.setImageResource(R.drawable.mercedes);
        }
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
