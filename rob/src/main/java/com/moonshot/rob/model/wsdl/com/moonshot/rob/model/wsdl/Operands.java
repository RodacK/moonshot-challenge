
package com.moonshot.rob.model.wsdl;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operands complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="operands">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="a" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="b" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operands", propOrder = {
    "a",
    "b"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
public class Operands {

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    protected int a;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    protected int b;

    /**
     * Gets the value of the a property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public int getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public void setA(int value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public int getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.3")
    public void setB(int value) {
        this.b = value;
    }

}
