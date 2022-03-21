package and5.abrar.chapter3.serializable

import and5.abrar.chapter3.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//        val typeusia:String
//        val dataperson = intent.getSerializableExtra("wuhu") as Person
//        txt_seriazble.text = "Nama : " + dataperson.name
//        txt_seriazbledua.text = "Umur : " + dataperson.umur
//        txt_seriazbletiga.text = "Alamat : " + dataperson.alamat
//        txt_seriazbleempat.text = "Hobi : " + dataperson.hobi
//        if(dataperson.umur%2==0){
//            typeusia = "genap"
//        }else{
//            typeusia = "ganjil"
//        }
//        txt_seriazblelima.text = "Umur Anda : $typeusia "

        val dataparcel = intent.getParcelableExtra("uwu") as PersonParcel?
        txt_parcel.text = dataparcel?.email
    }
}