package com.asitbehera.whatsappreplica;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lineStatus = 1;
    }

    int lineStatus;
    public void status(View view){
        lineStatus = 2;
        resetLine();
        changeColor();
    }
    public void chats(View view){
        lineStatus = 1;
        resetLine();
        changeColor();
    }
    public void calls(View view){
        lineStatus = 3;
        resetLine();
        changeColor();
    }
    public void cam(View view){
        lineStatus = 0;
        resetLine();
        changeColor();
    }
    void resetLine(){
        TextView camline = (TextView) findViewById(R.id.camLine);
        TextView chatsline = (TextView) findViewById(R.id.chatsLine);
        TextView statusline = (TextView) findViewById(R.id.statusLine);
        TextView callline = (TextView) findViewById(R.id.callsLine);
        callline.setBackgroundColor(Color.parseColor("#065e52"));
        chatsline.setBackgroundColor(Color.parseColor("#065e52"));
        statusline.setBackgroundColor(Color.parseColor("#065e52"));
        camline.setBackgroundColor(Color.parseColor("#065e52"));
        switch (lineStatus){
            case 0:{
                camline.setBackgroundColor(Color.WHITE);
                break;}
            case 1:{
                chatsline.setBackgroundColor(Color.WHITE);
                break;}
            case 2:{
                statusline.setBackgroundColor(Color.WHITE);
                break;}
            case 3:{
                callline.setBackgroundColor(Color.WHITE);
                break;}
        }
    }
    public void showMenu(View view){
        LinearLayout vertchat = (LinearLayout) findViewById(R.id.vertChat);
        LinearLayout vertstatus = (LinearLayout) findViewById(R.id.vertstatus);
        LinearLayout vertcall = (LinearLayout) findViewById(R.id.vertcall);
        vertchat.setVisibility(View.GONE);
        vertstatus.setVisibility(View.GONE);
        vertcall.setVisibility(View.GONE);
        switch (lineStatus){
            case 0:{

                break;}
            case 1:{
                vertchat.setVisibility(View.VISIBLE);
                break;}
            case 2:{
                vertstatus.setVisibility(View.VISIBLE);
                break;}
            case 3:{
                vertcall.setVisibility(View.VISIBLE);
                break;}
        }
    }
    void changeColor(){
        TextView chats = (TextView) findViewById(R.id.chats);
        TextView status = (TextView) findViewById(R.id.status);
        TextView call = (TextView) findViewById(R.id.calls);
        chats.setTextColor(Color.parseColor("#85b2ab"));
        status.setTextColor(Color.parseColor("#85b2ab"));
        call.setTextColor(Color.parseColor("#85b2ab"));
        switch (lineStatus){
            case 0:{
                break;}
            case 1:{
                chats.setTextColor(Color.WHITE);
                break;}
            case 2:{
               status.setTextColor(Color.WHITE);
                break;}
            case 3:{
                call.setTextColor(Color.WHITE);
                break;}
        }
    }
    @Override
    public void onBackPressed() {
        LinearLayout vertchat = (LinearLayout) findViewById(R.id.vertChat);
        LinearLayout vertstatus = (LinearLayout) findViewById(R.id.vertstatus);
        LinearLayout vertcall = (LinearLayout) findViewById(R.id.vertcall);
        vertchat.setVisibility(View.GONE);
        vertstatus.setVisibility(View.GONE);
        vertcall.setVisibility(View.GONE);
    }
}
