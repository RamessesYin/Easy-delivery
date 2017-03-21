package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * An entity Shop 
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "shops")
public class Shop {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An autogenerated id (unique for each Shop in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
   
  //The Shop's status
  @NotNull
  private short status;
  
//The Shop's info
  @NotNull
  private String info;
 
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  public Shop() { }

  public Shop(long id) { 
    this.id = id;
  }
  
  public Shop(short status,String info) {
    this.status = status;
    this.info=info;
  }

  // Getter and setter methods

  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  

  public long getStatus() {
    return status;
  }

  public void setStatus(short value) {
    this.status = value;
  }
  
  public String getInfo() {
	    return info;
	  }

	  public void setInfo(String value) {
	    this.info = value;
	  }
	  
} // class Shop
