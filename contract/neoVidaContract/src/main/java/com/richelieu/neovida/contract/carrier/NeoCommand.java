package com.richelieu.neovida.contract.carrier;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author richelieu  07.29 2018
 */
public class NeoCommand extends NeoRequest implements Parcelable{

    protected NeoCommand(Parcel in) {
        super(in);
    }

    public static final Creator<NeoCommand> CREATOR = new Creator<NeoCommand>() {
        @Override
        public NeoCommand createFromParcel(Parcel in) {
            return new NeoCommand(in);
        }

        @Override
        public NeoCommand[] newArray(int size) {
            return new NeoCommand[size];
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
