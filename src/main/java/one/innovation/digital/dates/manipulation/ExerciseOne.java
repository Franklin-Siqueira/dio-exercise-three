package one.innovation.digital.dates.manipulation;

import java.util.Date;

public class ExerciseOne {
    public static void main(String[] args) {
        //
        ExerciseOne e = new ExerciseOne();
        e.checkLong(1563385317992L);
    }
    /**
     * Exercicio 1
     *
     * Você tem um epoch (formato long) converta no formato Date
     *
     * Epoch 1563385317992
     *
     * Ponto de atenção:
     * como você está manipulando um numero do tipo long, dependendo da maneira que você estiver
     * manipulando essa informação, você precisa colocar a letra l no final do numero
     *
     * @param epoch
     * @return
     */
    public Date checkLong(long epoch) {
        //
        Date date = new Date(1563385317992L);
        System.out.println(date);
        return null;
    }
    /**
     *
     * @return
     */
    public long dateToLong() {

        return 0L;
    }
}
