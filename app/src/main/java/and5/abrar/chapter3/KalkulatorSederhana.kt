package and5.abrar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_dua.*
import kotlinx.android.synthetic.main.activity_kalkulator_sederhana.*

class KalkulatorSederhana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator_sederhana)
        var angka1 = InAngka1.text.toString()
        var angka2 = InAngka2.text.toString()

        BtnBagi.setOnClickListener {
            var hasil = angka1.toInt()/angka2.toInt()
            OutHasil.text = hasil.toString()
        }
        BtnKali.setOnClickListener {
            var hasil = angka1.toInt()*angka2.toInt()
            OutHasil.text = hasil.toString()
        }
        BtnKurang.setOnClickListener {
            var hasil = angka1.toInt()-angka2.toInt()
            OutHasil.text = hasil.toString()
        }
        BtnTambah.setOnClickListener {
            var hasil = angka1.toInt()+angka2.toInt()
            OutHasil.text = hasil.toString()
        }

    }
}