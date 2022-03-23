package and5.abrar.chapter3.bottomnav

import and5.abrar.chapter3.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beranda_gojek.*

class BerandaGojek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda_gojek)

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menuhome->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, BerandaFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menupesan->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, ChatFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menupromo->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, PromoFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menupesanan->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, PesananFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
        }
    }
}