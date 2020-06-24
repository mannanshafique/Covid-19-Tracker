package com.example.local;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    private int postionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodaycases,tvTotalDeaths,tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Intent it = getIntent();
        postionCountry = it.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+ AffectedCountries.countryModelList.get(postionCountry).getCountry());
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvCountry=findViewById(R.id.tvDcountry);
        tvCases=findViewById(R.id.tvDcases);
        tvRecovered=findViewById(R.id.tvDrecovered);
        tvCritical=findViewById(R.id.tvDcritical);
        tvActive=findViewById(R.id.tvDactive);
        tvTodaycases=findViewById(R.id.tvDtodaycases);
        tvTotalDeaths=findViewById(R.id.tvDdeaths);
        tvTodayDeaths=findViewById(R.id.tvDtodaydeaths);

        tvCountry.setText(AffectedCountries.countryModelList.get(postionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(postionCountry).getCases());
        tvRecovered.setText(AffectedCountries.countryModelList.get(postionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(postionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(postionCountry).getActive());
        tvTodaycases.setText(AffectedCountries.countryModelList.get(postionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelList.get(postionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(postionCountry).getTodayDeaths());




    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()== android.R.id.home)           // Back Button Click Action Perform
            finish();

        return super.onOptionsItemSelected(item);
    }
}