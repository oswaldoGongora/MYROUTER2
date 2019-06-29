package prueba.app.firebase.myrouter;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button  ruta5;
    private Button ruta12;
    private Button ruta13;
    private Button ruta14;
    private Button ruta15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ruta5=(Button)findViewById(R.id.ruta5);
        ruta12=(Button)findViewById(R.id.ruta12);
        ruta13=(Button)findViewById(R.id.ruta13);
        ruta14=(Button)findViewById(R.id.ruta14);
        ruta15=(Button)findViewById(R.id.ruta15);

        ruta5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inten=new Intent(Menu.this,plan.class);
                startActivity(inten);
            }
        });

        ruta12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inten=new Intent(Menu.this,CaPre.class);
                startActivity(inten);
            }
        });

        ruta13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inten=new Intent(Menu.this,san_miguel.class);
                startActivity(inten);
            }
        });

        ruta14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inten=new Intent(Menu.this,indeco.class);
                startActivity(inten);
            }
        });


        ruta15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inten=new Intent(Menu.this,vister.class);
                startActivity(inten);
            }
        });

    }
}
