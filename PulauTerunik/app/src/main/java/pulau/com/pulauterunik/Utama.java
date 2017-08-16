package pulau.com.pulauterunik;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Utama extends AppCompatActivity implements View.OnClickListener {

    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);





        Button daftar = (Button) findViewById(R.id.Button11);
        daftar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), DaftarPulau.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button file = (Button) findViewById(R.id.Button12);
        file.setOnClickListener(new View.OnClickListener() {

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Profile.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button view = (Button) findViewById(R.id.Button14);
        view.setOnClickListener(new View.OnClickListener() {

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), webb.class);
                startActivityForResult(myIntent, 0);
            }
        });

        keluar = (Button) findViewById(R.id.Button13);
        keluar.setOnClickListener(this);

    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.Button13:
                exit();
                break;
        }
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah kamu Benar-Benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id){
                                Utama.this.finish();
                            }
                        })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                        //Todo Auto-generate method stub dialog.cencel()
                        dialog.cancel();
                    }
                }).show();
    }

}
