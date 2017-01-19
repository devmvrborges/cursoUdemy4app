package alcoolgasolina.studio.com.alcoolougasolina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 18/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: Uma fórmula que contém na internet sobre o calculo para saber o que
mais compensa na hora de abastacer o seu carro. Formula é Valor Alcool / Valor Gasolina
o resultado acima de 0,7 compensa abastecer com gasolina, caso contrário abastecer com álcool

Desenvolvido durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private TextView textoResultado;
    private Button botaoVerificar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  //Recupera valores
                                                  String textoPrecoAlcool = precoAlcool.getText().toString();
                                                  String textoPrecoGasolina = precoGasolina.getText().toString();

                                                  Double alcool = Double.parseDouble(textoPrecoAlcool);
                                                  Double gasolina = Double.parseDouble(textoPrecoGasolina);
                                                  //Dividir preco alcool pelo preco gasolina

                                                  Double resultado = alcool / gasolina;

                                                  if (resultado > 0.7) {
                                                      textoResultado.setText("Melhor utilizar gasolina");
                                                  } else {
                                                      textoResultado.setText("Melhor utilizar Álcool");
                                                  }

                                              }
                                          }

        );


    }
}
