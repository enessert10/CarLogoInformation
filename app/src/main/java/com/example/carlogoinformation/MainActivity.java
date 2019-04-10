package com.example.carlogoinformation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CarAdapter.ItemClicked {

        TextView tvModel,tvName,tvTel;
        ImageView imgMake;
        Button btnCarInfo,btnOwnerInfo;
        FragmentManager fragmentManager;
        Fragment infoButtonFrag,listFrag,carInfoFrag,infoFrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvName);
        tvModel = findViewById(R.id.tvModel);
        tvTel = findViewById(R.id.tvTel);
        imgMake = findViewById(R.id.imgMake);
        btnCarInfo = findViewById(R.id.btnCarInfo);
        btnOwnerInfo = findViewById(R.id.btnOwnerInfo);

        fragmentManager = getSupportFragmentManager();
        listFrag = fragmentManager.findFragmentById(R.id.listFrag);
        infoButtonFrag = fragmentManager.findFragmentById(R.id.infoButtonFrag);
        carInfoFrag = fragmentManager.findFragmentById(R.id.carInfoFrag);
        infoFrag =fragmentManager.findFragmentById(R.id.infoFrag);

        fragmentManager.beginTransaction()
                .show(listFrag)
                .show(infoButtonFrag)
                .show(carInfoFrag)
                .hide(infoFrag)
                .commit();

        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager.beginTransaction()
                        .show(listFrag)
                        .show(infoButtonFrag)
                        .show(carInfoFrag)
                        .hide(infoFrag)
                        .commit();



            }
        });

        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .show(listFrag)
                        .show(infoButtonFrag)
                        .show(infoFrag)
                        .hide(carInfoFrag)
                        .commit();




            }
        });

        onItemClicked(0);



    }

    @Override
    public void onItemClicked(int index) {

        tvName.setText(ApplicationClass.cars.get(index).getOwner());
        tvModel.setText(ApplicationClass.cars.get(index).getModel());
        tvTel.setText(ApplicationClass.cars.get(index).getTel());

        if(ApplicationClass.cars.get(index).getMake().equals("volkswagen"))
        {
            imgMake.setImageResource(R.drawable.volkswagen);
        }

        else if (ApplicationClass.cars.get(index).getMake().equals("nissan"))
        {
            imgMake.setImageResource(R.drawable.nissan);
        }
        else
        {
            imgMake.setImageResource(R.drawable.mercedes);
        }


    }
}
