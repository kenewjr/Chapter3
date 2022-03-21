package and5.abrar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activty_inputnilai.*
import kotlinx.android.synthetic.main.activity_mini3.*

class Mini3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini3)
        val bund = intent.extras
        val nama = bund?.getString("Nama")
        val usia = bund?.getString("Usia")
        val type = bund?.getString("Type")
        val alamat = bund?.getString("Alamat")
        val kerja = bund?.getString("Kerja")
        Text1.setText( "Nama Anda : $nama")
        if (usia!=null){
            Text2.setText("Usia Anda : $usia bernilai : $type")
            Text3.setText( "Alamat Anda : $alamat")
            Text4.setText("Pekerjaan Anda : $kerja")
        }else{
            Text2.setText(" ")
            Text3.setText(" ")
            Text4.setText(" ")
        }


        Btn3.setOnClickListener {
            val pindah = Intent(this, Mini4::class.java)
            pindah.putExtra("Nama",nama)
            startActivity(pindah)
        }
    }
}