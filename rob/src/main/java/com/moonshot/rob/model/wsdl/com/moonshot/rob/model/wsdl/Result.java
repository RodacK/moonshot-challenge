
package com.moonshot.rob.model.wsdl;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="result">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="operands" type="{http://www.jboss.org/eap/quickstarts/wscalculator/Calculator}operands" minOccurs="0"/>
 *         <element name="result" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="even" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="theAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "result", propOrder = {
    "operands",
    "result",
    "even",
    "theAnswer"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
public class Result {

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    protected Operands operands;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    protected int result;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    protected boolean even;
    @XmlElement(defaultValue = "42")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    protected String theAnswer;

    /**
     * Gets the value of the operands property.
     * 
     * @return
     *     possible object is
     *     {@link Operands }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public Operands getOperands() {
        return operands;
    }

    /**
     * Sets the value of the operands property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operands }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public void setOperands(Operands value) {
        this.operands = value;
    }

    /**
     * Gets the value of the result property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public int getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public void setResult(int value) {
        this.result = value;
    }

    /**
     * Gets the value of the even property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public boolean isEven() {
        return even;
    }

    /**
     * Sets the value of the even property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public void setEven(boolean value) {
        this.even = value;
    }

    /**
     * Gets the value of the theAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public String getTheAnswer() {
        return theAnswer;
    }

    /**
     * Sets the value of the theAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public void setTheAnswer(String value) {
        this.theAnswer = value;
    }

}
