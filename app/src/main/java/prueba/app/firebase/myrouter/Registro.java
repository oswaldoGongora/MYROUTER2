package prueba.app.firebase.myrouter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Registro extends AppCompatActivity {
private EditText TextEmail;
private EditText TextPassword;
private Button btnRegustro;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);





    }
}
