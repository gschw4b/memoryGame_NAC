package com.br.memorygames_nac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;

    Integer[] cardsArray = {1, 2, 3, 4, 5, 6, 11, 12, 13, 14, 15, 16};

    int bob01, hora_aventura01, michael01, mickey01, minion01, pickachu01,
            bob02, hora_aventura02, michael02, mickey02, minion02, pickachu02;

    int primeiroCard, segundoCard;
    int primeiroClick, segundoClick;
    int numeroCard = 1;

    int turn = 1;

    Chronometer chronometer_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer_up = findViewById(R.id.count_up);
        chronometer_up.setBase(SystemClock.elapsedRealtime());
        chronometer_up.start();

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        frenteDoCard(); //carrega as imagens dos cards;

        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_11, card);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_12, card);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_13, card);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_14, card);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_21, card);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_22, card);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_23, card);
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_24, card);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_31, card);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_32, card);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_33, card);
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int card = Integer.parseInt((String) view.getTag());
                connectImage(iv_34, card);
            }
        });
    }

    private void connectImage(ImageView iv, int card) {
        if (cardsArray[card] == 1) {
            iv.setImageResource(bob01);
        } else if (cardsArray[card] == 11) {
            iv.setImageResource(bob02);
        } else if (cardsArray[card] == 2) {
            iv.setImageResource(hora_aventura01);
        } else if (cardsArray[card] == 12) {
            iv.setImageResource(hora_aventura02);
        } else if (cardsArray[card] == 3) {
            iv.setImageResource(michael01);
        } else if (cardsArray[card] == 13) {
            iv.setImageResource(michael02);
        } else if (cardsArray[card] == 4) {
            iv.setImageResource(mickey01);
        } else if (cardsArray[card] == 14) {
            iv.setImageResource(mickey02);
        } else if (cardsArray[card] == 5) {
            iv.setImageResource(minion01);
        } else if (cardsArray[card] == 15) {
            iv.setImageResource(minion02);
        } else if (cardsArray[card] == 6) {
            iv.setImageResource(pickachu01);
        } else if (cardsArray[card] == 16) {
            iv.setImageResource(pickachu02);
        }

        if (numeroCard == 1) {
            primeiroCard = cardsArray[card];
            if (primeiroCard > 10) {
                primeiroCard = primeiroCard - 10;
            }
            numeroCard = 2;
            primeiroClick = card;

            iv.setEnabled(false);
        } else if (numeroCard == 2) {
            segundoCard = cardsArray[card];
            if (segundoCard > 10) {
                segundoCard = segundoCard - 10;
            }
            numeroCard = 1;
            segundoClick = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            if (primeiroCard != segundoCard) {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculado(); //checa se as imagens selecionadas são iguais
                }
            },2000);
            } else {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        calculado(); //checa se as imagens selecionadas são iguais
                    }
                },0);
            }
        }
    }

    private void calculado() {
        if (primeiroCard == segundoCard) {
            if (primeiroClick == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (primeiroClick == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }
            if (segundoClick == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (segundoClick == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }
        } else {
            iv_11.setImageResource(R.drawable.back);
            iv_12.setImageResource(R.drawable.back);
            iv_13.setImageResource(R.drawable.back);
            iv_14.setImageResource(R.drawable.back);
            iv_21.setImageResource(R.drawable.back);
            iv_22.setImageResource(R.drawable.back);
            iv_23.setImageResource(R.drawable.back);
            iv_24.setImageResource(R.drawable.back);
            iv_31.setImageResource(R.drawable.back);
            iv_32.setImageResource(R.drawable.back);
            iv_33.setImageResource(R.drawable.back);
            iv_34.setImageResource(R.drawable.back);
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        checkFimDoJogo();
    }

    private void checkFimDoJogo() {
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                        .setMessage("FIM DE JOGO!")
                        .setCancelable(false)
                        .setPositiveButton("JOGAR NOVAMENTE", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frenteDoCard() {
        bob01 = R.drawable.bob01;
        bob02 = R.drawable.bob02;
        hora_aventura01 = R.drawable.hora_aventura01;
        hora_aventura02 = R.drawable.hora_aventura02;
        michael01 = R.drawable.michael01;
        michael02 = R.drawable.michael02;
        mickey01 = R.drawable.mickey01;
        mickey02 = R.drawable.mickey02;
        minion01 = R.drawable.minion01;
        minion02 = R.drawable.minion02;
        pickachu01 = R.drawable.pickachu01;
        pickachu02 = R.drawable.pickachu02;
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Você realmente deseja sair do jogo?");
        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("NÃO",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }

}