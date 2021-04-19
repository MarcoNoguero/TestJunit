import entities.Calculadora;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void pruebaSuma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(3,2);
        assertEquals(5,resultado);
    }

    @Test
    public void pruebaResta(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.resta(5,2);
        assertEquals(3,resultado);
    }


    @Test
    public void pruebaMulti(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicacion(5,5);
        assertEquals(25,resultado);
    }
    @Test
    public void pruebaDivision(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.division(25,5);
        assertEquals(5,resultado);
    }

}
