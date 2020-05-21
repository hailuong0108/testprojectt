package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void dialogLogin(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);


        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes()); //Attributes = thuộc tính
            lp.width=WindowManager.LayoutParams.MATCH_PARENT;
            lp.height = WindowManager.LayoutParams.MATCH_PARENT;
       final   EditText etUserName=  dialog.findViewById(R.id.editTextUserName);
         final EditText etPassWord = dialog.findViewById(R.id.editTextPassword);
        Button btnLogin, btnCancel;
        btnLogin =dialog.findViewById(R.id.btnDangNhap);
        btnCancel= dialog.findViewById(R.id.btnHuy);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etUserName.setText("");
                etPassWord.setText("");
                Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();

            }
        });
        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }
    public void btnLogin(View v ){
dialogLogin();
    }
}
