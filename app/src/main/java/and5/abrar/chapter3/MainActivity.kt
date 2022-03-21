package and5.abrar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnProses.setOnClickListener {
            val nama = name.text.toString()
            val nilai = nilai.text.toString()
            OutName.text = "Nama Siswa: $nama"
            OutNilai.text = "NIlai : $nilai"
            if(nilai.toInt() >= 85 && nilai.toInt() <= 100){
                Ket.text = "LULUS"
                huruf.text ="Huruf : A"
            }else if(nilai.toInt() >= 70 && nilai.toInt() <= 84){
                Ket.text = "LULUS"
                huruf.text ="Huruf : B"
            }else if(nilai.toInt() >= 60 && nilai.toInt() <= 69){
                Ket.text = "LULUS"
                huruf.text ="Huruf : C"
            }else if(nilai.toInt() >= 50 && nilai.toInt() <= 59){
                Ket.text = "Tidak Lulus"
                huruf.text ="Huruf : D"
            } else{
                Ket.text = "Tidak Lulus"
                huruf.text ="Huruf : E"
            }
        }
    }

    }