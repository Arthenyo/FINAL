package org.example.QUESTAO3.factory;

import org.example.QUESTAO3.imposto.*;
import org.example.QUESTAO3.model.enums.TipoImposto;

public class ImpostoFactory {
    public static Imposto getImposto(TipoImposto tipo) {
        switch (tipo) {
            case TIPO_ICMS:
                return new ICMS();
            case TIPO_IPI:
                return new IPI();
            case TIPO_PIS:
                return new PIS();
            case TIPO_ISS:
                return new ISS();
            default:
                throw new IllegalArgumentException("Tipo de imposto desconhecido: " + tipo);
        }
    }
}
