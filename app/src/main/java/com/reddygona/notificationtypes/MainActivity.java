package com.reddygona.notificationtypes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button simpleBtn, bigtextBtn, pictureBtn, inboxBtn, chatBtn, actionBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleBtn = findViewById(R.id.btn1);
        bigtextBtn = findViewById(R.id.btn2);
        pictureBtn = findViewById(R.id.btn3);
        inboxBtn = findViewById(R.id.btn4);
        chatBtn = findViewById(R.id.btn5);
        actionBtn = findViewById(R.id.btn6);


        simpleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int notf = 1;

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.android)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.android))
                        .setContentTitle("Simple Notification")
                        .setContentText("this is the simple notification example")
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL);
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    String ChannelId = "Reddy";
                    NotificationChannel channel = new NotificationChannel(ChannelId, "Notification Types", NotificationManager.IMPORTANCE_DEFAULT);
                    notificationManager.createNotificationChannel(channel);
                    builder.setChannelId(ChannelId);
                }
                notificationManager.notify(notf, builder.build());
            }
        });

        bigtextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int notf = 2;

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.android)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.android))
                        .setContentTitle("Bigtext Notification")
                        .setStyle(new NotificationCompat.BigTextStyle().bigText("this is the big text notification in this big text we can write the " +
                                "many lines as many as possible and we can use this for headlines or newsupdate"))
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL);
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    String ChannelId = "Reddy";
                    NotificationChannel channel = new NotificationChannel(ChannelId, "Notification Types", NotificationManager.IMPORTANCE_DEFAULT);
                    notificationManager.createNotificationChannel(channel);
                    builder.setChannelId(ChannelId);
                }
                notificationManager.notify(notf, builder.build());
            }
        });

        pictureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int notf = 3;

                Bitmap pic = BitmapFactory.decodeResource(getResources(), R.drawable.realme);

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.android)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.realmelogo))
                        .setContentTitle("picture Notification")
                        .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(pic))
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL);
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    String ChannelId = "Reddy";
                    NotificationChannel channel = new NotificationChannel(ChannelId, "Notification Types", NotificationManager.IMPORTANCE_DEFAULT);
                    notificationManager.createNotificationChannel(channel);
                    builder.setChannelId(ChannelId);
                }
                notificationManager.notify(notf, builder.build());

            }
        });

        inboxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int notf =4 ;

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.android)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.android))
                        .setContentTitle("Inbox Notification")
                        .setStyle(new NotificationCompat.InboxStyle().addLine("we can display messages like gmail messages").addLine("normal messages")
                                .addLine("system messages").setBigContentTitle("3 undread messages"))
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL);
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    String ChannelId = "Reddy";
                    NotificationChannel channel = new NotificationChannel(ChannelId, "Notification Types", NotificationManager.IMPORTANCE_DEFAULT);
                    notificationManager.createNotificationChannel(channel);
                    builder.setChannelId(ChannelId);
                }
                notificationManager.notify(notf, builder.build());
            }
        });

        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int notf = 5;

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.android)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.android))
                        .setContentTitle("Chat Notification")
                        .setStyle(new NotificationCompat.MessagingStyle("Reddy@Gona").setConversationTitle("Types of notf")
                        .addMessage("herohonda splender", 0, "Haneesh")
                                .addMessage("chinnam haneesh thunder",0,(Person) null)
                        .addMessage("coco cola pepsi",0,"Ranjith")
                                .addMessage("Chinnam haneesh sexy",0, (Person) null))
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL);
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    String ChannelId = "Reddy";
                    NotificationChannel channel = new NotificationChannel(ChannelId, "Notification Types", NotificationManager.IMPORTANCE_DEFAULT);
                    notificationManager.createNotificationChannel(channel);
                    builder.setChannelId(ChannelId);
                }
                notificationManager.notify(notf, builder.build());
            }
        });

        actionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int notf = 6;

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.android)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.android))
                        .setContentTitle("Action Notification")
                        .setStyle(new NotificationCompat.BigTextStyle().bigText("this will direct to the next intent, mainly this is uded to show " +
                                "the updates of app/system etc" +
                                "sampe is to redirect to android.com"))
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL);

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://android.com"));
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,0,intent,0);
                builder.addAction(android.R.drawable.ic_menu_view, "clickhere", pendingIntent);

                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    String ChannelId = "Reddy";
                    NotificationChannel channel = new NotificationChannel(ChannelId, "Notification Types", NotificationManager.IMPORTANCE_DEFAULT);
                    notificationManager.createNotificationChannel(channel);
                    builder.setChannelId(ChannelId);
                }
                notificationManager.notify(notf, builder.build());
            }
        });

    }

    }
