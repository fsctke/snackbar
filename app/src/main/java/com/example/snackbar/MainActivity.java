package com.example.snackbar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Snackbar mySnackbar;

    FloatingActionButton myFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View view = findViewById(R.id.activity_main); //grab the id of the layout parent

        //        Snackbar.make(view,"hello snackbar",Snackbar.LENGTH_SHORT).show(); // option 1
        //     mySnackbar = Snackbar.make(view, "hello snackbar", Snackbar.LENGTH_LONG); //option 2
        //      mySnackbar.setDuration(10000);
        //       mySnackbar.show();
        // mySnackbar.dismiss();

        myFab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        myFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySnackbar = Snackbar.make(view, "hello erik!!!", Snackbar.LENGTH_INDEFINITE);

                mySnackbar.setDuration(8000);
                mySnackbar.setAction("ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mySnackbar.dismiss();
                    }
                });

                View myView = mySnackbar.getView();
                myView.setBackgroundColor(getResources().getColor(R.color.colorSnackbarBG));
                TextView txt = (TextView) myView.findViewById(android.support.design.R.id.snackbar_text);
                txt.setTextColor(getResources().getColor(R.color.colorSnackbarText));

                TextView txtAction = (TextView) myView.findViewById(android.support.design.R.id.snackbar_action);
                txtAction.setTextColor(getResources().getColor(R.color.colorSnackbarText));
                mySnackbar.show();


            }
        });
    }


}