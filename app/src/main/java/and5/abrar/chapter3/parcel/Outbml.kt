package and5.abrar.chapter3.parcel

import and5.abrar.chapter3.R
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_outbml.*

class Outbml : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outbml)

        var deskripsi = ""
        val ttl :Int
        val bml = intent.getParcelableExtra("uwu") as Imt?
        val bb = bml?.berat
        val tng = bml?.tinggi
        ttl = (((bb?.toInt()!!)/(tng?.toFloat()!!*tng?.toFloat()!!)).toInt())
        if(ttl<18.5){
            deskripsi = "Kurus"
        }else if(ttl>18.5 && ttl<24.5){
            deskripsi = "Normal"
        }else if(ttl>25 && ttl<29.9){
            deskripsi = "Overweight"
        }else if (ttl>=30){
            deskripsi = "Obesitas"
        }
        OutIMT.text = "Hasil IMT : $deskripsi"
        OutBb.text = "Bb : " + bb.toString()
        OutTb.text = "TB : " + tng.toString()
    }
}