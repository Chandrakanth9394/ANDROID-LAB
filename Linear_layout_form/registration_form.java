package com.example.validation_linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText fname;
    private EditText lname;
    private EditText address;
    private EditText phone;
    private EditText dob;
    private EditText email;
    private EditText pwd;
    private Button clear;
    private Button b;
    String fsname,lsname,db,em,pas,addr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname=(EditText) findViewById(R.id.fn);
        lname=(EditText) findViewById(R.id.ln);
        address=(EditText) findViewById(R.id.add);
        phone=(EditText) findViewById(R.id.ph);
        dob=(EditText) findViewById(R.id.DOB);
        email=(EditText) findViewById(R.id.email);
        pwd=(EditText) findViewById(R.id.pass);
        b=(Button) findViewById(R.id.reg);
        clear=(Button) findViewById(R.id.clr);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fsname=fname.getText().toString().trim(); //The trim() method removes whitespace from both ends of a string. Note: This method does not change the original string
                lsname=lname.getText().toString().trim();
                db=dob.getText().toString().trim();
                em=email.getText().toString().trim();
                pas=pwd.getText().toString().trim();
                addr= address.getText().toString().trim();
                if (fsname.equals(""))
                  {
                    Toast.makeText(MainActivity.this, "enter your first name!",Toast.LENGTH_SHORT).show();
                  }
                else if (lsname.equals(""))
                  {
                    Toast.makeText(MainActivity.this,"enter your last name!",Toast.LENGTH_SHORT).show();
                  }
                else if(db.equals(""))
                  {
                      Toast.makeText(MainActivity.this,"enter your date of birth!",Toast.LENGTH_SHORT).show();
                  }
                else if(em.equals(""))
                  {
                      Toast.makeText(MainActivity.this,"enter your email!",Toast.LENGTH_SHORT).show();
                  }
                else if(pas.equals(""))
                  {
                      Toast.makeText(MainActivity.this,"enter your password!",Toast.LENGTH_SHORT).show();
                  }
                else if(addr.equals(""))
                  {
                      Toast.makeText(MainActivity.this,"enter your address!",Toast.LENGTH_SHORT).show();
                  }
                else if (phone.equals(""))
                  {
                      Toast.makeText(MainActivity.this,"enter your phonenumber!",Toast.LENGTH_SHORT).show();
                  }
                else
                   {
                       Toast.makeText(MainActivity.this,"Registration Successfull!",Toast.LENGTH_SHORT).show();
                   }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fname.setText("");
                lname.setText("");
                address.setText("");
                phone.setText("");
                dob.setText("");
                email.setText("");
                pwd.setText("");
            }
        });
    }
}
