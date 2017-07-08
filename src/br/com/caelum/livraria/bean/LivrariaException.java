package br.com.caelum.livraria.bean;

import javax.ejb.ApplicationException;

@SuppressWarnings("serial")
@ApplicationException(rollback=true)
public class LivrariaException extends RuntimeException {

}
