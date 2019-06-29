package prueba.app.firebase.myrouter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Registro;
    private Button  Incio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Registro=(Button)findViewById(R.id.Registro);
        Incio=(Button)findViewById(R.id.Inicio);

        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inten=new Intent(MainActivity.this,Registro.class);
                startActivity(inten);
            }
        });
        Incio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inten=new Intent(MainActivity.this,Menu.class);
                startActivity(inten);
            }
        });


    }
}
