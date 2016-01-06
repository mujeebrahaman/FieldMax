package com.fieldmax.android.fieldmaxv2.cards;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.fieldmax.android.fieldmaxv2.R;
import com.fieldmax.android.fieldmaxv2.activity.CustomerDashBoardActivity;

/**
 * Created by mujeeb on 06-Jan-16.
 */
public class CardViewCustomer extends CardView {
    private Context mContext;
    private String mCustomerStoreName, mCustomerStoreAddr, mCustomerName, mCustomerNum;

    public CardViewCustomer(Context context, String storename, String storeAddr, String cusName, String cusNum) {
        super(context);
        this.mContext = context;
        mCustomerStoreName = storename;
        mCustomerStoreAddr = storeAddr;
        mCustomerName = cusName;
        mCustomerNum = cusNum;
        initView();
    }

    protected void initView() {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.card_view_customers, this, true);

        TextView textView = (TextView) view.findViewById(R.id.customerStoreName);
        textView.setText(mCustomerStoreName);

        textView = (TextView) view.findViewById(R.id.customerStoreAddress);
        textView.setText(mCustomerStoreAddr);

        textView = (TextView) view.findViewById(R.id.customerContactPersonName);
        textView.setText(mCustomerName);

        textView = (TextView) view.findViewById(R.id.customerContactPersonNumber);
        textView.setText(mCustomerNum);

        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, CustomerDashBoardActivity.class);
                intent.putExtra("key", mCustomerStoreName);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });

        textView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Call Function

                Intent in = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+mCustomerNum));
                in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                mContext.startActivity(in);
            }
        });
    }
}
