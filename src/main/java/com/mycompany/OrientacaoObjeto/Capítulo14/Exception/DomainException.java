package com.mycompany.OrientacaoObjeto.Capítulo14.Exception;


public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
