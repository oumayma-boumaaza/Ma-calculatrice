package com.oumayma.macalculatrice;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bMoins,bPlus,bMultiplication,bDivision,bC,bCE,bPlusMoins,bPourcent,bEgale,bDot,bCarre,bRacine,binv;
    private TextView tvOperation;
    private EditText etResult;
    private ImageButton Delete;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connexion aux vues
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bRacine=findViewById(R.id.bRacine);
        binv=findViewById(R.id.binv);
        bDot=findViewById(R.id.bDot);
        bMoins=findViewById(R.id.bMoins);
        bPlus=findViewById(R.id.bPlus);
        bMultiplication=findViewById(R.id.bMultiplication);
        bDivision=findViewById(R.id.bDivision);
        bEgale = findViewById(R.id.bEgale);
        bC=findViewById(R.id.bC);
        bCE=findViewById(R.id.bCE);
        bCarre=findViewById(R.id.bCarre);
        bPlusMoins=findViewById(R.id.bPlusMoins);
        bPourcent=findViewById(R.id.bPourcent);
        Delete=findViewById(R.id.delete);
        tvOperation = findViewById(R.id.tvOperation);
        etResult = (EditText)findViewById(R.id.etResult);
        etResult.setEnabled(false);

        //onclick listeners
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString()+"9");
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etResult.getText().toString().contains(".")) return;
                etResult.setText(etResult.getText()+".");
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText("0");
                tvOperation.setText("0");
            }
        });
        bCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val =etResult.getText().toString();
                val = val.substring(0, val.length() - 1);
                etResult.setText(val);
            }
        });


        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText(etResult.getText() + " + ");
            }
        });

        bMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText(etResult.getText() + " - ");
            }
        });

        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOperation.setText(etResult.getText()+" ÷ ");
            }
        });
        bMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOperation.setText(etResult.getText()+" × ");
            }
        });
        bCarre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(etResult.getText().toString());
                double square = d*d;
                etResult.setText(String.valueOf(square));
                tvOperation.setText(d+"²");
            }
        });

        bPourcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvOperation.getText().toString()) / 100;
                etResult.setText(String.valueOf(d));
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(new StringBuilder().append(etResult.getText()).append(",").toString());
            }
        });
        bPlusMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvOperation.getText().toString()) * -1;
                etResult.setText(String.valueOf(d));
            }
        });
        bRacine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = etResult.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                etResult.setText(String.valueOf(r));
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"^"+"(-1)");
            }
        });

        bEgale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = etResult.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                double result = manip(replacedstr);
                tvOperation.setText(String.format("%s %s = ", tvOperation.getText().toString(), etResult));
                etResult.setText(String.valueOf(result));

            }
        });
      /*  Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = etResult.getText().toString();
                s = s.substring(0, s.length() - 1);
                etResult.setText(s);
            }
        });*/


    }
    public static double manip(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                 if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                     while (ch >= 'a' && ch <= 'z') nextChar();
                     String func = str.substring(startPos, this.pos);
                     x = parseFactor();
                     if (func.equals("sqrt")) x = Math.sqrt(x);

                     else throw new RuntimeException("Unknown function: " + func);
                 } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}