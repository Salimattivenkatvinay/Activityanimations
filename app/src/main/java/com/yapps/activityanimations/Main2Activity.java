package com.yapps.activityanimations;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.vlonjatg.android.apptourlibrary.AppTour;
import com.vlonjatg.android.apptourlibrary.MaterialSlide;

public class Main2Activity extends AppTour {

    @Override
    public void init(Bundle savedInstanceState) {

        int firstColor = Color.parseColor("#0097A7");
        int secondColor = Color.parseColor("#FFA000");
        int customSlideColor = Color.parseColor("#009866");

        //Create pre-created fragments
        Fragment firstSlide = MaterialSlide.newInstance(R.drawable.ic_next_black_24dp, "Presentations on the go",
                "Get stuff done with or without an internet connection.", Color.WHITE, Color.WHITE);

        Fragment secondSlide = MaterialSlide.newInstance(R.drawable.cybr, "Share and edit together",
                "Write on your own or invite more people to contribute.", Color.WHITE, Color.WHITE);

        //Add slides
        addSlide(firstSlide, firstColor);
        addSlide(secondSlide, secondColor);

        //Custom slide
        //addSlide(new CustomSlide(), customSlideColor);

        //Customize tour
        setSkipButtonTextColor(Color.WHITE);
        setNextButtonColorToWhite();
        setDoneButtonTextColor(Color.WHITE);
    }

    @Override
    public void onSkipPressed() {
        //Do something after clicking Skip button.
        startActivity(new Intent(this,MainActivity.class));
    }

    @Override
    public void onDonePressed() {
        //Do something after clicking Done button.
        startActivity(new Intent(this,MainActivity.class));
    }
}