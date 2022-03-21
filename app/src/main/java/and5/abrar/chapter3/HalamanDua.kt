package and5.abrar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_dua.*

class HalamanDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)
//        val angka1 = 23
//        val angka2 = 22
//        val jumlah = angka1 + angka2
//
//        hasil.text = jumlah.toString()

        proses.setOnClickListener{
            val angka1 = angka1.text.toString()
            val angka2 = angka2.text.toString()
            val jumlah = angka1.toInt()+angka2.toInt()
            hasil.text = "Penjumlahan $angka1 + $angka2 = $jumlah"
        }
    }
}