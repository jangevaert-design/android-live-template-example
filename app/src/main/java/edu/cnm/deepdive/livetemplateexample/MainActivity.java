package edu.cnm.deepdive.livetemplateexample;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
        AlertDialog show = new Builder(this)
                .setTitle("")
                .setMessage("Hello!")
                .setPositiveButton("", new OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {
                      
                  }
                }).show();
  }
}