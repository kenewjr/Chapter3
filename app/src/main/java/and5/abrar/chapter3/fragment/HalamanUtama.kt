package and5.abrar.chapter3.fragment

import and5.abrar.chapter3.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_utama.*

class HalamanUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)
        first.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, FirstFragment())
                    .commit()
            }
        }
        second.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, SecondFragment())
                    .commit()
            }
            }
    }
}