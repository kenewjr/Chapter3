package and5.abrar.chapter3.serializable

import and5.abrar.chapter3.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class First : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
//        serial()
        parcel()
    }
    fun serial(){
        Btn_seriazble.setOnClickListener {
            val pindah = Intent(this, Second::class.java)
            val dataperson = Person(name = "abrar", umur = 99, alamat = "Earth", hobi = "main")
            pindah.putExtra("wuhu",dataperson)
            startActivity(pindah)
        }
    }
    fun parcel(){
        Btn_parsel.setOnClickListener {
            val pindah = Intent(this, Second::class.java)
            val dataperson = PersonParcel("dobleh","hehehe@gmail.com")
            pindah.putExtra("uwu",dataperson)
            startActivity(pindah)
        }
    }
}