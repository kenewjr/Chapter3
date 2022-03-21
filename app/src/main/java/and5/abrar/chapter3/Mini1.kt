package and5.abrar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mini1.*

class Mini1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini1)

        Btn1.setOnClickListener {
            val pindah = Intent(this, Mini2::class.java)
            startActivity(pindah)
        }
    }
}