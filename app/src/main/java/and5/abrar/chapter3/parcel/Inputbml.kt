package and5.abrar.chapter3.parcel

import and5.abrar.chapter3.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inputbml.*

class Inputbml : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputbml)
        kirim()
    }
    fun kirim(){
        InImt.setOnClickListener {
            val bb = BB.text.toString()
            val tng = Tinggi.text.toString()
            val pindah = Intent(this, Outbml::class.java)
            val dataperson = Imt(berat = bb.toInt(), tinggi = tng.toFloat())
            pindah.putExtra("uwu",dataperson)
            startActivity(pindah)
        }
    }
}