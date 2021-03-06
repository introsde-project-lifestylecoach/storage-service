
package lifecoach.localdb.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getIdMeasureTypeByTypeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getIdMeasureTypeByTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMeasureType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIdMeasureTypeByTypeResponse", propOrder = {
    "idMeasureType"
})
public class GetIdMeasureTypeByTypeResponse {

    protected int idMeasureType;

    /**
     * Recupera il valore della proprietà idMeasureType.
     * 
     */
    public int getIdMeasureType() {
        return idMeasureType;
    }

    /**
     * Imposta il valore della proprietà idMeasureType.
     * 
     */
    public void setIdMeasureType(int value) {
        this.idMeasureType = value;
    }

}
