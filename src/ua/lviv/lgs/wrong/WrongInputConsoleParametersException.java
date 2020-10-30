package ua.lviv.lgs.wrong;
/**
 * @since java 1.8
 * @author Marian Kuziv
 * @version 1.1
 */

public class WrongInputConsoleParametersException extends Exception {
    /**
     * @param args
     * @throws WrongInputConsoleParametersException
     * @author Marian Kuziv
     * @return null
     * @see java code convention
     */
    private String wrong;
    public WrongInputConsoleParametersException(String wrong){
        super(wrong);
        this.wrong=wrong;
    }
    public String getWrong(){
        return wrong;
    }
}
