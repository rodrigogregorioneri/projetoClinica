package entity;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Entity;

/**
 * Classe que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2017-04-17
 *
 */
 
 
@DynamicUpdate
public class Usuario {

private int id;	
private String nome;
private String login;
private String senha;




}
