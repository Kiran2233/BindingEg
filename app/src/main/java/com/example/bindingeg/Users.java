package com.example.bindingeg;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class Users {
    public final String title,desc;
    public int ImageId;

    public Users(String title, String desc, int imageId) {
        this.title = title;
        this.desc = desc;
        ImageId = imageId;
    }
    @BindingAdapter("android:imageUrl")
    public static void loadImage(View v,int imageId){
        CircleImageView circleImageView= (CircleImageView) v;
        circleImageView.setImageDrawable(ContextCompat.getDrawable(v.getContext(),imageId));
    }
}
