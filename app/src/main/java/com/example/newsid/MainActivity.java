package com.example.newsid;

import android.widget.*;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private Button backButton;

    private Button CatButton1, CatButton2, CatButton3, CatButton4;
    private FrameLayout NewsBig;
    private LinearLayout NewsSatu, NewsDua, NewsTiga, NewsEmpat, NewsLima, NewsEnam, NewsTujuh, NewsDelapan, NewsSembilan, NewsSepuluh, NewsSebelas;
    public String toastMsg="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CatButton1 = (Button) findViewById(R.id.Cat1);
        CatButton2 = (Button) findViewById(R.id.Cat2);
        CatButton3 = (Button) findViewById(R.id.Cat3);
        CatButton4 = (Button) findViewById(R.id.Cat4);
        NewsBig = (FrameLayout) findViewById(R.id.BeritaBig);
        NewsSatu = (LinearLayout) findViewById(R.id.Berita1);
        NewsDua = (LinearLayout) findViewById(R.id.Berita2);
        NewsTiga = (LinearLayout) findViewById(R.id.Berita3);
        NewsEmpat = (LinearLayout) findViewById(R.id.Berita4);
        NewsLima = (LinearLayout) findViewById(R.id.Berita5);
        NewsEnam = (LinearLayout) findViewById(R.id.Berita6);
        NewsTujuh = (LinearLayout) findViewById(R.id.Berita7);
        NewsDelapan = (LinearLayout) findViewById(R.id.Berita8);
        NewsSembilan = (LinearLayout) findViewById(R.id.Berita9);
        NewsSepuluh = (LinearLayout) findViewById(R.id.Berita10);
        NewsSebelas = (LinearLayout) findViewById(R.id.Berita11);

        Categories(1);
        CatButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categories(1);
                AllNews();
            }
        });

        CatButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categories(2);
                Entertainment();
            }
        });

        CatButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categories(3);
                Sports();
            }
        });

        CatButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categories(4);
                Fashion();
            }
        });

        NewsBig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(12);
            }
        });
        NewsSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(1);
            }
        });
        NewsDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(2);
            }
        });
        NewsTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(3);
            }
        });
        NewsEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(4);
            }
        });
        NewsLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(5);
            }
        });
        NewsEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(6);
            }
        });
        NewsTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(7);
            }
        });
        NewsDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(8);
            }
        });
        NewsSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(9);
            }
        });
        NewsSepuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(10);
            }
        });
        NewsSebelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNews(11);
            }
        });

    }

    private void Categories(int number){
        CatButton1.setEnabled(true);
        CatButton2.setEnabled(true);
        CatButton3.setEnabled(true);
        CatButton4.setEnabled(true);
        CatButton1.setTextSize(14);
        CatButton2.setTextSize(14);
        CatButton3.setTextSize(14);
        CatButton4.setTextSize(14);
        switch (number){
            case 1 : CatButton1.setEnabled(false); CatButton1.setTextSize(18); break;
            case 2 : CatButton2.setEnabled(false); CatButton2.setTextSize(18); break;
            case 3 : CatButton3.setEnabled(false); CatButton3.setTextSize(18); break;
            case 4 : CatButton4.setEnabled(false); CatButton4.setTextSize(18); break;
        }
    }

    private void showToast(String toastMsg){
        Toast.makeText(getApplicationContext(), toastMsg, Toast.LENGTH_SHORT).show();
    }

    private void AllNews(){
        NewsSatu.setVisibility(View.VISIBLE);
        NewsDua.setVisibility(View.VISIBLE);
        NewsTiga.setVisibility(View.VISIBLE);
        NewsEmpat.setVisibility(View.VISIBLE);
        NewsLima.setVisibility(View.VISIBLE);
        NewsEnam.setVisibility(View.VISIBLE);
        NewsTujuh.setVisibility(View.VISIBLE);
        NewsDelapan.setVisibility(View.VISIBLE);
        NewsSembilan.setVisibility(View.VISIBLE);
        NewsSepuluh.setVisibility(View.VISIBLE);
        NewsSebelas.setVisibility(View.VISIBLE);
    }

    private void Entertainment(){
        NewsSatu.setVisibility(View.GONE);
        NewsDua.setVisibility(View.GONE);
        NewsTiga.setVisibility(View.VISIBLE);
        NewsEmpat.setVisibility(View.GONE);
        NewsLima.setVisibility(View.GONE);
        NewsEnam.setVisibility(View.GONE);
        NewsTujuh.setVisibility(View.GONE);
        NewsDelapan.setVisibility(View.GONE);
        NewsSembilan.setVisibility(View.GONE);
        NewsSepuluh.setVisibility(View.VISIBLE);
        NewsSebelas.setVisibility(View.VISIBLE);
    }

    private void Sports(){
        NewsSatu.setVisibility(View.GONE);
        NewsDua.setVisibility(View.GONE);
        NewsTiga.setVisibility(View.GONE);
        NewsEmpat.setVisibility(View.VISIBLE);
        NewsLima.setVisibility(View.VISIBLE);
        NewsEnam.setVisibility(View.GONE);
        NewsTujuh.setVisibility(View.GONE);
        NewsDelapan.setVisibility(View.VISIBLE);
        NewsSembilan.setVisibility(View.VISIBLE);
        NewsSepuluh.setVisibility(View.GONE);
        NewsSebelas.setVisibility(View.GONE);

    }

    private void Fashion(){
        NewsSatu.setVisibility(View.VISIBLE);
        NewsDua.setVisibility(View.VISIBLE);
        NewsTiga.setVisibility(View.GONE);
        NewsEmpat.setVisibility(View.GONE);
        NewsLima.setVisibility(View.GONE);
        NewsEnam.setVisibility(View.VISIBLE);
        NewsTujuh.setVisibility(View.VISIBLE);
        NewsDelapan.setVisibility(View.GONE);
        NewsSembilan.setVisibility(View.GONE);
        NewsSepuluh.setVisibility(View.GONE);
        NewsSebelas.setVisibility(View.GONE);
    }

    public void createNews(int nomer){
        dialogBuilder=new AlertDialog.Builder(this);

        switch (nomer){
            case 1:
                final View PopupVIew = getLayoutInflater().inflate(R.layout.popup1, null);
                backButton = (Button) PopupVIew.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew);
                dialog = dialogBuilder.create();
                dialog.show();
                break;
            case 2:
                final View PopupVIew2 = getLayoutInflater().inflate(R.layout.popup2, null);
                backButton = (Button) PopupVIew2.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew2);
                dialog = dialogBuilder.create();
                dialog.show();
                break;
            case 3:
                final View PopupVIew3 = getLayoutInflater().inflate(R.layout.popup3, null);
                backButton = (Button) PopupVIew3.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew3);
                dialog = dialogBuilder.create();
                dialog.show();
                break;

            case 4:
                final View PopupVIew4 = getLayoutInflater().inflate(R.layout.popup4, null);
                backButton = (Button) PopupVIew4.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew4);
                dialog = dialogBuilder.create();
                dialog.show();
                break;

            case 5:
                final View PopupVIew5 = getLayoutInflater().inflate(R.layout.popup5, null);
                backButton = (Button) PopupVIew5.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew5);
                dialog = dialogBuilder.create();
                dialog.show();
                break;

            case 6:
                final View PopupVIew6 = getLayoutInflater().inflate(R.layout.popup6, null);
                backButton = (Button) PopupVIew6.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew6);
                dialog = dialogBuilder.create();
                dialog.show();
                break;

            case 7:
                final View PopupVIew7 = getLayoutInflater().inflate(R.layout.popup7, null);
                backButton = (Button) PopupVIew7.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew7);
                dialog = dialogBuilder.create();
                dialog.show();
                break;
            case 8:
                final View PopupVIew8 = getLayoutInflater().inflate(R.layout.popup8, null);
                backButton = (Button) PopupVIew8.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew8);
                dialog = dialogBuilder.create();
                dialog.show();
                break;
            case 9:
                final View PopupVIew9 = getLayoutInflater().inflate(R.layout.popup9, null);
                backButton = (Button) PopupVIew9.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew9);
                dialog = dialogBuilder.create();
                dialog.show();
                break;
            case 10:
                final View PopupVIew10 = getLayoutInflater().inflate(R.layout.popup10, null);
                backButton = (Button) PopupVIew10.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew10);
                dialog = dialogBuilder.create();
                dialog.show();
                break;

            case 11:
                final View PopupVIew11 = getLayoutInflater().inflate(R.layout.popup11, null);
                backButton = (Button) PopupVIew11.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew11);
                dialog = dialogBuilder.create();
                dialog.show();
                break;
            case 12:
                final View PopupVIew12 = getLayoutInflater().inflate(R.layout.popup12, null);
                backButton = (Button) PopupVIew12.findViewById(R.id.backButton);
                dialogBuilder.setView(PopupVIew12);
                dialog = dialogBuilder.create();
                dialog.show();
                break;


        }


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //back button
                dialog.dismiss();
            }
        });
    }
}