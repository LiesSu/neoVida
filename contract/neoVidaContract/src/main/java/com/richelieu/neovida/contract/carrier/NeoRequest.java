package com.richelieu.neovida.contract.carrier;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author richelieu  07.29 2018
 */
public class NeoRequest implements Parcelable {

    protected NeoRequest(Parcel in) {
    }

    public static final Creator<NeoRequest> CREATOR = new Creator<NeoRequest>() {
        @Override
        public NeoRequest createFromParcel(Parcel in) {
            return new NeoRequest(in);
        }

        @Override
        public NeoRequest[] newArray(int size) {
            return new NeoRequest[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
