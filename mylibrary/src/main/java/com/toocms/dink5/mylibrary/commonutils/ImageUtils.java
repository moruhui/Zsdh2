package com.toocms.dink5.mylibrary.commonutils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by Administrator on 2016/11/2.
 */

public class ImageUtils {

    public static void display(Context context, String url, ImageView imageView) {
        Glide.with(context)
                .load(url)
                .into(imageView);
    }

    public static void display(Context context, String url, ImageView imageView, int id) {
        Glide.with(context)
                .load(url)
                .placeholder(id)
                .into(imageView);
    }

    public static void displayCirecle(Context context, String url, ImageView imageView, int id) {
        Glide.with(context)
                .load(url)
                .placeholder(id)
                .bitmapTransform(new CropCircleTransformation(context))
                .into(imageView);
    }

    public static void displayCirecle(Context context, String url, ImageView imageView) {
        Glide.with(context)
                .load(url)
                .bitmapTransform(new CropCircleTransformation(context))
                .into(imageView);
    }

}
