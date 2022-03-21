package and5.abrar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activty_b.*
import kotlinx.android.synthetic.main.activity_activty_b.ket
import kotlinx.android.synthetic.main.activity_activty_b.nama
import kotlinx.android.synthetic.main.activity_activty_b.nilai
import kotlinx.android.synthetic.main.activity_activty_b.nilai_huruf


class ActivtyB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activty_b)

        val bund = intent.extras
        val nilaiUts = bund?.getString("uts")
        val nilaiUas = bund?.getString("uas")
        val nilaiTugas = bund?.getString("tugas")
        val name = bund?.getString("mhs")
        val nilaiHitung = nilaiUts!!.toInt()+nilaiUas!!.toInt()+nilaiTugas!!.toInt()
        val nilaiTtl = nilaiHitung/3

        nama.setText("$name")
        nilai.setText("Nilai Anda = $nilaiTtl")
        if(nilaiTtl >=90 && nilaiTtl<=100){
            nilai_huruf.setText("A")
        }else if(nilaiTtl >=70 && nilaiTtl<=89){
            nilai_huruf.setText("B")
        }else if(nilaiTtl >=60 && nilaiTtl<=69){
            nilai_huruf.setText("C")
        }else if(nilaiTtl >=50 && nilaiTtl<=59){
            nilai_huruf.setText("D")
        }else{
            nilai_huruf.setText("E")
        }
        if(nilaiTtl>=65){
            ket.setText("LULUS")
        }else{
            ket.setText("TIDAK LULUS")
        }
    }
}