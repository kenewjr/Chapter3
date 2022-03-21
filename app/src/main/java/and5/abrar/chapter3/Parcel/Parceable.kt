package and5.abrar.chapter3.Parcel

import android.os.Parcelable

data class Parceable(val panjang:Int, val lebar:Int): Parcelable {
    constructor(parcel: android.os.Parcel) : this(
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: android.os.Parcel, flags: Int) {
        parcel.writeInt(panjang)
        parcel.writeInt(lebar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Parceable> {
        override fun createFromParcel(parcel: android.os.Parcel): Parceable {
            return Parceable(parcel)
        }

        override fun newArray(size: Int): Array<Parceable?> {
            return arrayOfNulls(size)
        }
    }
}

