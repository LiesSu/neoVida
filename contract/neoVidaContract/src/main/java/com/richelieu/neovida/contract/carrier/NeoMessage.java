package com.richelieu.neovida.contract.carrier;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author richelieu  07.29 2018
 */
public class NeoMessage extends NeoRequest implements Parcelable {

    protected NeoMessage(Parcel in) {
        super(in);
    }

    public static final Creator<NeoMessage> CREATOR = new Creator<NeoMessage>() {
        @Override
        public NeoMessage createFromParcel(Parcel in) {
            return new NeoMessage(in);
        }

        @Override
        public NeoMessage[] newArray(int size) {
            return new NeoMessage[size];
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
