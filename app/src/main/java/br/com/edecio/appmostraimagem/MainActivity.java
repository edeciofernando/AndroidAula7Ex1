package br.com.edecio.appmostraimagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnVerLivro;
    private ImageView imgLivro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVerLivro = (Button) findViewById(R.id.btnVerLivro);
        imgLivro = (ImageView) findViewById(R.id.imgLivro);

        btnVerLivro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Picasso.with(this).load("http://187.7.106.14/edecio/livro.jpg").into(imgLivro);
    }
}
