package com.example.mynabers;

import android.os.Parcel;
import android.os.Parcelable;

public class neighbor implements Parcelable {
    private String firstName, lastName, url;
    private int rating = 0;
    private boolean faivorit = false;

    public neighbor(String firstName, String lastName, String url) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.url = url;
    }


    protected neighbor(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        url = in.readString();
        rating = in.readInt();
        faivorit = in.readByte() != 0;
    }

    public static final Creator<neighbor> CREATOR = new Creator<neighbor>() {
        @Override
        public neighbor createFromParcel(Parcel in) {
            return new neighbor(in);
        }

        @Override
        public neighbor[] newArray(int size) {
            return new neighbor[size];
        }
    };

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isFaivorit() {
        return faivorit;
    }

    public void setFaivorit(boolean faivorit) {
        this.faivorit = faivorit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(url);
        dest.writeInt(rating);
        dest.writeByte((byte) (faivorit ? 1 : 0));
    }
}
