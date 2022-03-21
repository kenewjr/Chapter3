package and5.abrar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_latihan.*

class Latihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan)

        BtnProses.setOnClickListener {
            var pembeli = NamaPembeli.text.toString()
            var ebook = Ebook.text.toString()
            var jmlbeli = JmlBeli.text.toString()
            var harga = Harga.text.toString()
            var uang = Uang.text.toString()
            var ttlbelanja = jmlbeli.toInt()*harga.toInt()
            var kembalian = uang.toInt()-ttlbelanja
            OutTotal.text = "total belanja : $ttlbelanja"
            OutKembali.text = "Kembalian : $kembalian"
        }

        reset.setOnClickListener {
            NamaPembeli.text = null
            Ebook.text = null
            JmlBeli.text = null
            Harga.text = null
            Uang.text = null
            Uang.text = null
            OutTotal.text= null
            OutKembali.text = null
        }

        keluar.setOnClickListener {
            finish()
        }
    }
}

