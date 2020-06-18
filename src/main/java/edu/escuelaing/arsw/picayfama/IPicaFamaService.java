package edu.escuelaing.arsw.picayfama;


public interface IPicaFamaService {
    /**
     * @return generate a ramdom number
     */
    public String numeroAletorio();

    /**
     * Method to valid number of Famas or Picas in attempt
     *
     * @param userNumber number of client
     * @return Sttring with info about number of Famas or Picas
     */
    public String validar(String userNumber);

}


