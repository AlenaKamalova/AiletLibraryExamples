package com.example.irlibexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.intelligenceretail.www.lib.IntRtl;

public class MainActivity extends AppCompatActivity {
    private BroadcastReceiver brShareShelf;
    private IntRtl ir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ir = new IntRtl(getBaseContext());

        //Configure broadcast reciver
        brShareShelf = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                String visit_id = extras.getString("VISIT_ID", "-empty-");
                String external_visit_id = extras.getString("EXTERNAL_VISIT_ID", "-empty-");

            }
        };

        IntentFilter intFilt = new IntentFilter("notificationID_SHARESHELF");
        this.registerReceiver(brShareShelf, intFilt);

        findViewById(R.id.btStart).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Init IrLib
                IntRtl.Results res = ir.init(
                        "username",
                        "password",
                        "notificationID"
                );
                if (res == IntRtl.Results.RESULT_OK){
                    //Start IrLib camera mode (visit)
                    res = ir.start(
                            "123456789",
                            "testVisit");
                }
            }
        });
    }
}
