package and5.abrar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activty_inputnilai.*

class Inputnilai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activty_inputnilai)


        Btn_a.setOnClickListener {
            val uts = uts.text.toString()
            val uas = uas.text.toString()
            val tugas = tugas.text.toString()
            val mhs = nma_mhs.text.toString()
            val pindah = Intent(this, Outnilai::class.java)
            pindah.putExtra("uts",uts)
            pindah.putExtra("uas",uas)
            pindah.putExtra("tugas",tugas)
            pindah.putExtra("mhs",mhs)
            startActivity(pindah)
        }
    }
}