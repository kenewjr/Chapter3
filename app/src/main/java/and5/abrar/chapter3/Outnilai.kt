package and5.abrar.chapter3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activty_outnilai.*

class Outnilai : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activty_outnilai)

        val nilaiUts = intent.getStringExtra("uts")
        val nilaiUas = intent.getStringExtra("uas")
        val nilaiTugas = intent.getStringExtra("tugas")
        val name = intent.getStringExtra("mhs")
        val nilaiHitung = nilaiUts!!.toInt()+nilaiUas!!.toInt()+nilaiTugas!!.toInt()
        val nilaiTtl = nilaiHitung/3

        nama.text = name
        nilai.text = "Nilai Anda = $nilaiTtl"
        if(nilaiTtl >=90 && nilaiTtl<=100){
         nilai_huruf.text = "A"
        }else if(nilaiTtl >=70 && nilaiTtl<=89){
            nilai_huruf.text = "B"
        }else if(nilaiTtl >=60 && nilaiTtl<=69){
            nilai_huruf.text = "C"
        }else if(nilaiTtl >=50 && nilaiTtl<=59){
            nilai_huruf.text = "D"
        }else{
            nilai_huruf.text = "E"
        }
        if(nilaiTtl>=65){
            ket.text = "LULUS"
        }else{
            ket.text = "TIDAK LULUS"
        }

    }
}