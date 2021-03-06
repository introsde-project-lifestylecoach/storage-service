
package lifecoach.adaptor.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Adaptor", targetNamespace = "http://webservice.adaptor.lifecoach/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Adaptor {


    /**
     * 
     * @param sex
     * @param weight
     * @param waist
     * @param age
     * @param hip
     * @param height
     * @return
     *     returns lifecoach.adaptor.webservice.Bmi
     */
    @WebMethod
    @WebResult(name = "bmi", targetNamespace = "")
    @RequestWrapper(localName = "getBmi", targetNamespace = "http://webservice.adaptor.lifecoach/", className = "lifecoach.adaptor.webservice.GetBmi")
    @ResponseWrapper(localName = "getBmiResponse", targetNamespace = "http://webservice.adaptor.lifecoach/", className = "lifecoach.adaptor.webservice.GetBmiResponse")
    @Action(input = "http://webservice.adaptor.lifecoach/Adaptor/getBmiRequest", output = "http://webservice.adaptor.lifecoach/Adaptor/getBmiResponse")
    public Bmi getBmi(
        @WebParam(name = "weight", targetNamespace = "")
        float weight,
        @WebParam(name = "height", targetNamespace = "")
        float height,
        @WebParam(name = "sex", targetNamespace = "")
        int sex,
        @WebParam(name = "age", targetNamespace = "")
        int age,
        @WebParam(name = "waist", targetNamespace = "")
        float waist,
        @WebParam(name = "hip", targetNamespace = "")
        float hip);

}
