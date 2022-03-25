package com.example.android.listviewproject;

import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.Serializable;

public class Details_Activity extends AppCompatActivity implements Serializable  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView ShapeName = findViewById(R.id.Details_shapeName);
        ImageView ShapeImage = findViewById(R.id.Details_shapeImage);

       Bundle bundle = getIntent().getExtras();
        final Items DeliviredShape = (Items)bundle.getSerializable("item");

        ShapeName.setText(DeliviredShape.getItemName());
        ShapeImage.setImageResource(DeliviredShape.getItemImage());

    }
}