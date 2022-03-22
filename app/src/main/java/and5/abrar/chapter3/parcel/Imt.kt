package and5.abrar.chapter3.parcel

import android.os.Parcel
import android.os.Parcelable

data class Imt(val berat:Int, val tinggi:Float):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readFloat()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(berat)
        parcel.writeFloat(tinggi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Imt> {
        override fun createFromParcel(parcel: Parcel): Imt {
            return Imt(parcel)
        }

        override fun newArray(size: Int): Array<Imt?> {
            return arrayOfNulls(size)
        }
    }
}
