package and5.abrar.chapter3.parcel

import and5.abrar.chapter3.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_satu.*

class Satu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_satu)
        parcel()
    }
    fun parcel(){
        gasparcel.setOnClickListener {
            val pnj = parcel.text.toString()
            val ls = parcelsatu.text.toString()
            val pindah = Intent(this, Dua::class.java)
            val dataperson = Parceable(panjang = pnj.toInt(),lebar=ls.toInt())
            pindah.putExtra("uwu",dataperson)
            startActivity(pindah)
        }
    }
}