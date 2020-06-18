
package edu.escuelaing.arsw.picayfama;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PicaFamasService {
    private String numberRamdom;
    private List<String> attemptsMade;
    private int counterFamas;
    private int counterPicas;

    /**
     * Constructor of services class
     */
    public PicaFamasService(){
        this.numberRamdom = String.valueOf((int) Math.floor(Math.random()*1000000000+1));
        this.attemptsMade = new ArrayList<>();
    }

    /**
     * @return generate a ramdom number
     */
    public String numeroAletorio(){
        return numberRamdom;
    }

    /**
     * Method to valid number of Famas or Picas in attempt
     * @param userNumber number of client
     * @return Sttring with info about number of Famas or Picas
     */
    public String validar(String userNumber){
        counterFamas = 0;
        counterPicas = 0;
        String result;
        attemptsMade.add(userNumber);
        try {
            ArrayList<Integer> listNumberRamdom = convertToList(numberRamdom);
            ArrayList<Integer> listNumberUser = convertToList(userNumber);

            for (int x = 0; x < listNumberUser.size(); x++) {
                if (listNumberRamdom.contains(listNumberUser.get(x))) {
                    if (listNumberUser.get(x) == listNumberRamdom.get(x)) {
                        counterFamas++;
                    } else {
                        counterPicas++;
                    }
                }
            }
            if (listNumberRamdom.equals(listNumberUser)) {
                result = "Ganaste!";
            } else {
                result = "Famas = " + counterFamas + "   Picas = " + counterPicas +
                        "    Intentos realizados " + attemptsMade.toString()
                        + "    La longitud del numero es: " + numberRamdom.length();
            }
        } catch (Exception e){
            result = "Ups! Algo salio mal, vuelve a intentarlo";
        }

        return result;
    }

    /**
     * Allow obtain arraylist from number in string
     * @param numberInString number in string
     * @return ArrayList with numbers
     */
    private ArrayList<Integer> convertToList(String numberInString){
        ArrayList<Integer> listNumber = new ArrayList<Integer>();
        for(int x = 0; x < numberInString.length(); x++){
            listNumber.add(Character.getNumericValue(numberInString.charAt(x)));
        }
        return listNumber;
    }

    public String getNumberRamdom() {
        return numberRamdom;
    }

    public void setNumberRamdom(String numberRamdom) {
        this.numberRamdom = numberRamdom;
    }

    public int getCounterFamas() {
        return counterFamas;
    }

    public void setCounterFamas(int counterFamas) {
        this.counterFamas = counterFamas;
    }

    public int getCounterPicas() {
        return counterPicas;
    }

    public void setCounterPicas(int counterPicas) {
        this.counterPicas = counterPicas;
    }
}
