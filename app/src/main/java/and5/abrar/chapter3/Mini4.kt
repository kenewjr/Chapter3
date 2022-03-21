package and5.abrar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activty_inputnilai.*
import kotlinx.android.synthetic.main.activity_mini4.*

class Mini4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini4)

        Btn4.setOnClickListener {
            val bund = Bundle()
            val nama = intent.getStringExtra("Nama")
            val usia = Edit2.text.toString()
            var typeusia:String
            if(usia.toInt()%2==0){
                typeusia = "genap"
            }else{
                typeusia = "ganjil"
            }
            val alamat = Edit3.text.toString()
            val kerja = Edit4.text.toString()
            val pindah = Intent(this, Mini3::class.java)
            bund.putString("Nama",nama)
            bund.putString("Type",typeusia)
            bund.putString("Usia",usia)
            bund.putString("Alamat",alamat)
            bund.putString("Kerja",kerja)
            pindah.putExtras(bund)
            startActivity(pindah)
        }
    }
}