package and5.abrar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener {
            var user = user.text.toString()
            var pass = pass.text.toString()
            if (user=="admin"&&pass=="admin"){
                status.text = "ok"
                startActivity( Intent(this,Home::class.java ))
            }else{
                status.text = "gagal"
            }
        }
    }
}