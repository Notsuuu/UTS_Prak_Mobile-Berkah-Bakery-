package com.example.uts_prak_mobile;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_food);

        ImageView photo = findViewById(R.id.imgDetail);
        TextView name = findViewById(R.id.DetailName);
        TextView desc = findViewById(R.id.DetailDesc);

        Bundle bundle = getIntent().getExtras();
        photo.setImageResource(bundle.getInt("photo"));
        name.setText(bundle.getString("name"));
        desc.setText(bundle.getString("desc"));
    }
}
