package com.mjponi.routesrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: starting");
        Trip trip = new Trip("Testing");
        Route r1 = new Route(trip, "DC to LA");
        Route r2 = new Route(trip, "LA to Tokyo");
        Route r3 = new Route(trip, "Tokyo to Sydney");
        trip.addRoute(r1);
        trip.addRoute(r2);
        trip.addRoute(r3);

        for(Route route : trip.getRoutes()){
            Log.d(TAG, "onCreate: route " + route.getDescription() + " has sequence of " + route.getSequence());
        }

    }
}