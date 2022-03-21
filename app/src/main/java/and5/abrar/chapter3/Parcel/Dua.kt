package and5.abrar.chapter3.Parcel

import and5.abrar.chapter3.R
import and5.abrar.chapter3.serializable.PersonParcel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dua.*

class Dua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)
        val dataparcel = intent.getParcelableExtra("uwu") as Parceable?
        var Panjang = dataparcel?.panjang
        var Lebar = dataparcel?.lebar
        var hitung = Panjang?.toInt()!! * Lebar?.toInt()!!
        OParcel1.text = hitung.toString()
    }
}