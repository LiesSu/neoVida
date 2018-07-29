package com.richelieu.neovida.contract.carrier;


import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author richelieu  07.29 2018
 */
@SuppressLint("ParcelCreator")
public class NeoResponse implements Parcelable {

    protected NeoResponse(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<NeoResponse> CREATOR = new Creator<NeoResponse>() {
        @Override
        public NeoResponse createFromParcel(Parcel in) {
            return new NeoResponse(in);
        }

        @Override
        public NeoResponse[] newArray(int size) {
            return new NeoResponse[size];
        }
    };
}
