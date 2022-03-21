package and5.abrar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activty_a.*
import kotlinx.android.synthetic.main.activity_activty_a.nma_mhs
import kotlinx.android.synthetic.main.activity_activty_a.tugas
import kotlinx.android.synthetic.main.activity_activty_a.uas
import kotlinx.android.synthetic.main.activity_activty_a.uts


class ActivtyA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activty_a)

        btnBundle.setOnClickListener {
              val bund = Bundle()
                val uts = uts.text.toString()
                val uas = uas.text.toString()
                val tugas = tugas.text.toString()
                val mhs = nma_mhs.text.toString()
                val pindah = Intent(this, Outnilai::class.java)
                bund.putString("uts",uts)
            bund.putString("uas",uas)
            bund.putString("tugas",tugas)
            bund.putString("mhs",mhs)
                pindah.putExtras(bund)
                startActivity(pindah)

        }
    }

}