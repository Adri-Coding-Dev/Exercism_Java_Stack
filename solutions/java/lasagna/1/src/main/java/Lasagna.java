/**
 * MISION: Generar los metodos que me piden correctamente
 */

public class Lasagna {
    /**
     * Metodo que SIEMPRE retorna 40 (minutos esperados que se este cocinando la lasagna
     * @return -> 40
     */
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){

        return 40;
    }

    /**
     * Metodo que devuelve el tiempo que falte por cocinar
     * @param minutesIsOven -> Cantidad de minutos que YA estan cocinados
     * @return -> Tiempo restante por cocinar
     */
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesIsOven){
        return expectedMinutesInOven() - minutesIsOven;
    }

    /**
     * Metodo que devuelve el tiempo que tarda en preparar todas las capas (cada cada tarda 2 minutos)
     * @param layers -> Capas a preparar
     * @return -> Tiempo que tarda en preparar todas las capas
     */
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    /**
     * Metodo que devuelve el tiempo total en minutos
     * @param layers -> Capas (necesarias para el calculo de preparationTimeInMinutes())
     * @param minutesIsOven -> Minutos ya cocinados
     * @return -> Suma del tiempo ya cocinado y el tiempo que tarda en preparar la lasagna
     */
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesIsOven){
        return preparationTimeInMinutes(layers) + minutesIsOven;
    }
}
