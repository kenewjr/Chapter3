package and5.abrar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beranda.*

class Beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        profile.setOnClickListener {
            startActivity( Intent(this, Profile::class.java))
        }
        home.setOnClickListener {
            startActivity( Intent(this, Home::class.java))
        }
        web.setOnClickListener {
            startActivity( Intent(this, Web::class.java))
        }
        logout.setOnClickListener {
            finish()
        }
    }
}