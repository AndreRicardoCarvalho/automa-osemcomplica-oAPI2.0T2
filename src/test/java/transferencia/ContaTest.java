package transferencia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    Cliente xuxa;
    Cliente silviosantos;
    Conta contaXuxa;
    Conta contaSilvioSantos;

    @Test
    public void realizarTransacao(){
         xuxa = new  Cliente("Xuxa", "12345678900","111111111");
         silviosantos = new Cliente("Silvio Santos","00987654321","222222");

         contaXuxa = new Conta("0025","2254",2500.00,xuxa);
         contaSilvioSantos = new Conta("0026","2251",3500.00,silviosantos);

        contaXuxa.realizarTransferncia(1000.00,contaSilvioSantos);
        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvioSantos.getSaldo());
        


    }
}