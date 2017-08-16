package pulau.com.pulauterunik;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vulcan extends AppCompatActivity implements View.OnClickListener{
    Button keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vulcan);
        keluar = (Button) findViewById(R.id.button);
        keluar.setOnClickListener(this);
    }
    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.button:
                exit();
                break;
        }
    }
    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah kamu Mau ke Halaman Daftar Pulau ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id){
                                Vulcan.this.finish();
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
