package co.com.jperez;

import co.com.jperez.controllers.ConverterController;
import co.com.jperez.services.ConverterService;

/**
 * @author JPerez
 * @version 1.0.0
 */

public class Main {

    public static void main(String[] args) {

        ConverterService service = new ConverterService();
        ConverterController controller = new ConverterController(service);
        controller.menu();

    }

}