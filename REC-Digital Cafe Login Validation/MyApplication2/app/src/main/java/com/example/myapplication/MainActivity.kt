import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.MainActivity2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val email:EditText=findViewById(R.id.email)
        val pass:EditText=findViewById(R.id.pass)
        val bt1:Button=findViewById(R.id.btn)
        val bt2:Button=findViewById(R.id.btn1)

        bt1.setOnClickListener {
            val email1=email.text.toString().trim()
            val pass1=pass.text.toString().trim()
            if(email1.isEmpty() || pass1.isEmpty()){
                Toast.makeText(this,"ALL FIELDS ARE CUMPULSORY",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(!email1.matches(Regex("\\b[A-Za-z0-9._%+-]*rajalakshimi[A-Za-z0-9._%+-]*@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b\n"))){
                Toast.makeText(this,"Invalid email",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(!pass1.matches(Regex("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{8,}\$\n"))){
                Toast.makeText(this,"Invalid Password",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
           val intent:Intent= Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        bt2.setOnClickListener {
            email.text.clear();
            pass.text.clear()

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}