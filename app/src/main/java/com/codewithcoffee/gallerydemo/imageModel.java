package com.codewithcoffee.gallerydemo;

import android.net.Uri;

public class imageModel {
    private Uri path;

    public imageModel(Uri path) {
        this.path = path;
    }

    public Uri getPath() {
        return path;
    }

    public void setPath(Uri path) {
        this.path = path;
    }
}
