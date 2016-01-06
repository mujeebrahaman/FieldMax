package com.fieldmax.android.fieldmaxv2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.fieldmax.android.fieldmaxv2.R;
import com.fieldmax.android.fieldmaxv2.cards.CardViewCustomer;
import com.fieldmax.android.fieldmaxv2.maps.BeatsActivity;

/**
 * Created by suraj on 11/3/2015.
 */
public class CustomerListActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        Button footerCustomerButton = (Button) findViewById(R.id.FooterButtonCustomer);
        footerCustomerButton.setSelected(true);

        Button footerInboxButton = (Button) findViewById(R.id.FooterButtonInbox);
        footerInboxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = new Intent(CustomerListActivity.this, InboxActivity.class);
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(launchIntent);
            }
        });


        Button footerHomeButton = (Button) findViewById(R.id.FooterButtonHome);
        footerHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = new Intent(CustomerListActivity.this, ReportActivity.class);
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(launchIntent);
            }
        });

        Button footerBeatButton = (Button) findViewById(R.id.FooterButtonBeat);
        footerBeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = new Intent(CustomerListActivity.this, BeatsActivity.class);
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(launchIntent);
            }
        });
        ViewGroup mParentLayout=(LinearLayout)findViewById(R.id.parentLayout);

        CardViewCustomer card1=new CardViewCustomer(getApplicationContext(),"Sharma Traders","Hoodi,Bangalore","sharma","8956783456");
        mParentLayout.addView(card1);


        CardViewCustomer card2=new CardViewCustomer(getApplicationContext(),"CHOUDHARY TRADERS","BTM Layout,Bangalore","jeevan","8956783456");
        mParentLayout.addView(card2);

        CardViewCustomer card3=new CardViewCustomer(getApplicationContext(),"RAM TRADERS","Ram Nagar,Bangalore","ram","8956783456");
        mParentLayout.addView(card3);

        CardViewCustomer card4=new CardViewCustomer(getApplicationContext(),"GOPAL SHOP","Kr Puram,Bangalore","gopal","8956783456");
        mParentLayout.addView(card4);

        CardViewCustomer card5=new CardViewCustomer(getApplicationContext(),"NANDINI","Tin Factory,Bangalore","nandini","8956783456");
        mParentLayout.addView(card5);

        CardViewCustomer card6=new CardViewCustomer(getApplicationContext(),"King Traders","Hoodi,Bangalore","sharma","8956783456");
        mParentLayout.addView(card6);

        CardViewCustomer card7=new CardViewCustomer(getApplicationContext(),"Softonic Traders","Hoodi,Bangalore","kenly","8956783456");
        mParentLayout.addView(card7);

        CardViewCustomer card8=new CardViewCustomer(getApplicationContext(),"Gropper Traders","Hoodi,Bangalore","Ganesh","8956783456");
        mParentLayout.addView(card8);

    }



}