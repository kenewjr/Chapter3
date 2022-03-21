package and5.abrar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activty_inputnilai.*
import kotlinx.android.synthetic.main.activity_mini2.*

class Mini2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini2)

        Btn2.setOnClickListener {
            val nama = Edit1.text.toString()
            val pindah = Intent(this, Mini3::class.java,)
            pindah.putExtra("Nama",nama)
            startActivity(pindah)
        }
    }
}