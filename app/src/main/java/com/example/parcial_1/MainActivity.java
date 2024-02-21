package com.example.parcial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public class MainActivity extends AppCompatActivity {

        private EditText inputEditText;
        private TextView resultTextView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            inputEditText = findViewById(R.id.input_edit_text);
            resultTextView = findViewById(R.id.result_text_view);

            Button convertButton = findViewById(R.id.convert_button);
            convertButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String input = inputEditText.getText().toString();
                    if (!input.isEmpty()) {
                        double area = Double.parseDouble(input);
                        double result = convertirArea(area);
                        resultTextView.setText(String.valueOf(result));
                    } else {
                        resultTextView.setText("Por favor ingrese un valor");
                    }
                }
            });
        }

        private double convertirArea(double area) {
            String unidad = obtenerUnidadSeleccionada();
            switch (unidad) {
                case "Metro Cuadrado":
                    return convertirA MetroCuadrado(area);
                case "Pie Cuadrado":
                    return convertirAPieCuadrado(area);
                case "Vara Cuadrada":
                    return convertirAVaraCuadrada(area);
                case "Yarda Cuadrada":
                    return convertirAYardaCuadrada(area);
                case "Tarea":
                    return convertirATarea(area);
                case "Manzana":
                    return convertirAManzana(area);
                case "Hectárea":
                    return convertirAHectarea(area);
                default:
                    return area;
            }
        }

        private double convertirA MetroCuadrado(double area) {
            return area * 1.0;
        }

        private double convertirAPieCuadrado(double area) {
            return area * 0.092903;
        }

        private double convertirAVaraCuadrada(double area) {
            return area * 0.836127;
        }

        private double convertirAYardaCuadrada(double area) {
            return area * 0.732;
        }

        private double convertirATarea(double area) {
            return area * 0.000247105;
        }

        private double convertirAManzana(double area) {
            return area * 0.000247105;
        }

        private double convertirAHectarea(double area) {
            return area * 0.0001;
        }

        private String obtenerUnidadSeleccionada() {
            // Obtener la unidad seleccionada desde un Spinner u otro elemento de UI
            // Por ejemplo:
            // Spinner spinner = findViewById(R.id.unidad_spinner);
            // String unidad = spinner.getSelectedItem().toString();
            // Devolver la unidad seleccionada como una cadena
            return "Metro Cuadrado";
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}