
package lifecoach.localdb.webservice;

import java.util.List;
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
@WebService(name = "People", targetNamespace = "http://webservice.localdb.lifecoach/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "getPeopleList", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetPeopleList")
    @ResponseWrapper(localName = "getPeopleListResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetPeopleListResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/getPeopleListRequest", output = "http://webservice.localdb.lifecoach/People/getPeopleListResponse")
    public List<Person> getPeopleList();

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.CreatePersonResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/createPersonRequest", output = "http://webservice.localdb.lifecoach/People/createPersonResponse")
    public int createPerson(
        @WebParam(name = "person", targetNamespace = "http://webservice.localdb.lifecoach/")
        Person person);

    /**
     * 
     * @param personId
     * @return
     *     returns lifecoach.localdb.webservice.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadPersonResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/readPersonRequest", output = "http://webservice.localdb.lifecoach/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.UpdatePersonResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/updatePersonRequest", output = "http://webservice.localdb.lifecoach/People/updatePersonResponse")
    public int updatePerson(
        @WebParam(name = "person", targetNamespace = "http://webservice.localdb.lifecoach/")
        Person person);

    /**
     * 
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.DeletePersonResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/deletePersonRequest", output = "http://webservice.localdb.lifecoach/People/deletePersonResponse")
    public int deletePerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param measureId
     * @param personId
     * @param measureTypeId
     * @return
     *     returns lifecoach.localdb.webservice.Measure
     */
    @WebMethod
    @WebResult(name = "measure", targetNamespace = "")
    @RequestWrapper(localName = "readMeasure", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadMeasure")
    @ResponseWrapper(localName = "readMeasureResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadMeasureResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/readMeasureRequest", output = "http://webservice.localdb.lifecoach/People/readMeasureResponse")
    public Measure readMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId,
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Measure>
     */
    @WebMethod
    @WebResult(name = "measureList", targetNamespace = "")
    @RequestWrapper(localName = "readLastMeasure", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadLastMeasure")
    @ResponseWrapper(localName = "readLastMeasureResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadLastMeasureResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/readLastMeasureRequest", output = "http://webservice.localdb.lifecoach/People/readLastMeasureResponse")
    public List<Measure> readLastMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param personId
     * @param measureTypeId
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Measure>
     */
    @WebMethod
    @WebResult(name = "measureList", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureHistory", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetMeasureHistory")
    @ResponseWrapper(localName = "getMeasureHistoryResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetMeasureHistoryResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/getMeasureHistoryRequest", output = "http://webservice.localdb.lifecoach/People/getMeasureHistoryResponse")
    public List<Measure> getMeasureHistory(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId);

    /**
     * 
     * @param nMeasure
     * @param personId
     * @param measureTypeId
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Measure>
     */
    @WebMethod
    @WebResult(name = "measureList", targetNamespace = "")
    @RequestWrapper(localName = "getSomeMeasure", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetSomeMeasure")
    @ResponseWrapper(localName = "getSomeMeasureResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetSomeMeasureResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/getSomeMeasureRequest", output = "http://webservice.localdb.lifecoach/People/getSomeMeasureResponse")
    public List<Measure> getSomeMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId,
        @WebParam(name = "nMeasure", targetNamespace = "")
        int nMeasure);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "measureId", targetNamespace = "")
    @RequestWrapper(localName = "createMeasure", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.CreateMeasure")
    @ResponseWrapper(localName = "createMeasureResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.CreateMeasureResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/createMeasureRequest", output = "http://webservice.localdb.lifecoach/People/createMeasureResponse")
    public int createMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measure", targetNamespace = "http://webservice.localdb.lifecoach/")
        Measure measure);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "measureId", targetNamespace = "")
    @RequestWrapper(localName = "updateMeasure", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.UpdateMeasure")
    @ResponseWrapper(localName = "updateMeasureResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.UpdateMeasureResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/updateMeasureRequest", output = "http://webservice.localdb.lifecoach/People/updateMeasureResponse")
    public int updateMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measure", targetNamespace = "http://webservice.localdb.lifecoach/")
        Measure measure);

    /**
     * 
     * @param measureId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deleteMeasure", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.DeleteMeasure")
    @ResponseWrapper(localName = "deleteMeasureResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.DeleteMeasureResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/deleteMeasureRequest", output = "http://webservice.localdb.lifecoach/People/deleteMeasureResponse")
    public int deleteMeasure(
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param goalId
     * @return
     *     returns lifecoach.localdb.webservice.MeasureType
     */
    @WebMethod
    @WebResult(name = "measureType", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureType", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadMeasureType")
    @ResponseWrapper(localName = "readMeasureTypeResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadMeasureTypeResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/readMeasureTypeRequest", output = "http://webservice.localdb.lifecoach/People/readMeasureTypeResponse")
    public MeasureType readMeasureType(
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.MeasureType>
     */
    @WebMethod
    @WebResult(name = "measureTypeList", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureTypeList", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetMeasureTypeList")
    @ResponseWrapper(localName = "getMeasureTypeListResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetMeasureTypeListResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/getMeasureTypeListRequest", output = "http://webservice.localdb.lifecoach/People/getMeasureTypeListResponse")
    public List<MeasureType> getMeasureTypeList();

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Goal>
     */
    @WebMethod
    @WebResult(name = "goalList", targetNamespace = "")
    @RequestWrapper(localName = "getGoals", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetGoals")
    @ResponseWrapper(localName = "getGoalsResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetGoalsResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/getGoalsRequest", output = "http://webservice.localdb.lifecoach/People/getGoalsResponse")
    public List<Goal> getGoals(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param goalId
     * @param personId
     * @param measureTypeId
     * @return
     *     returns lifecoach.localdb.webservice.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readGoal", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadGoal")
    @ResponseWrapper(localName = "readGoalResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadGoalResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/readGoalRequest", output = "http://webservice.localdb.lifecoach/People/readGoalResponse")
    public Goal readGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId,
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @param personId
     * @param measureTypeId
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.Goal>
     */
    @WebMethod
    @WebResult(name = "goalList", targetNamespace = "")
    @RequestWrapper(localName = "getGoalHistory", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetGoalHistory")
    @ResponseWrapper(localName = "getGoalHistoryResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetGoalHistoryResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/getGoalHistoryRequest", output = "http://webservice.localdb.lifecoach/People/getGoalHistoryResponse")
    public List<Goal> getGoalHistory(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureTypeId", targetNamespace = "")
        String measureTypeId);

    /**
     * 
     * @param goal
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "goalId", targetNamespace = "")
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.CreateGoalResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/createGoalRequest", output = "http://webservice.localdb.lifecoach/People/createGoalResponse")
    public int createGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "goal", targetNamespace = "http://webservice.localdb.lifecoach/")
        Goal goal);

    /**
     * 
     * @param goal
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "goalId", targetNamespace = "")
    @RequestWrapper(localName = "updateGoal", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.UpdateGoal")
    @ResponseWrapper(localName = "updateGoalResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.UpdateGoalResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/updateGoalRequest", output = "http://webservice.localdb.lifecoach/People/updateGoalResponse")
    public int updateGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "goal", targetNamespace = "http://webservice.localdb.lifecoach/")
        Goal goal);

    /**
     * 
     * @param goalId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "deleteGoal", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.DeleteGoal")
    @ResponseWrapper(localName = "deleteGoalResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.DeleteGoalResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/deleteGoalRequest", output = "http://webservice.localdb.lifecoach/People/deleteGoalResponse")
    public int deleteGoal(
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @param personId
     * @param title
     * @return
     *     returns lifecoach.localdb.webservice.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "getGoalByTitle", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetGoalByTitle")
    @ResponseWrapper(localName = "getGoalByTitleResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetGoalByTitleResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/getGoalByTitleRequest", output = "http://webservice.localdb.lifecoach/People/getGoalByTitleResponse")
    public Goal getGoalByTitle(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "title", targetNamespace = "")
        String title);

    /**
     * 
     * @param goalId
     * @return
     *     returns lifecoach.localdb.webservice.GoalType
     */
    @WebMethod
    @WebResult(name = "goalType", targetNamespace = "")
    @RequestWrapper(localName = "readGoalType", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadGoalType")
    @ResponseWrapper(localName = "readGoalTypeResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.ReadGoalTypeResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/readGoalTypeRequest", output = "http://webservice.localdb.lifecoach/People/readGoalTypeResponse")
    public GoalType readGoalType(
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @return
     *     returns java.util.List<lifecoach.localdb.webservice.GoalType>
     */
    @WebMethod
    @WebResult(name = "goalTypeList", targetNamespace = "")
    @RequestWrapper(localName = "getGoalTypeList", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetGoalTypeList")
    @ResponseWrapper(localName = "getGoalTypeListResponse", targetNamespace = "http://webservice.localdb.lifecoach/", className = "lifecoach.localdb.webservice.GetGoalTypeListResponse")
    @Action(input = "http://webservice.localdb.lifecoach/People/getGoalTypeListRequest", output = "http://webservice.localdb.lifecoach/People/getGoalTypeListResponse")
    public List<GoalType> getGoalTypeList();

}
