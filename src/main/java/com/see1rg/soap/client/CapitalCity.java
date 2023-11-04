
package com.see1rg.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sCountryISOCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * Аннотация @XmlRootElement применяется к классу и используется для указания имени корневого элемента XML,
 * к которому будет привязан класс при выполнении преобразования JAXB.
 * В данном случае, аннотация @XmlRootElement(name = "CapitalCity") указывает, что класс CapitalCity будет
 * привязан к XML-элементу с именем "CapitalCity". Это означает, что при маршалинге (преобразовании объекта Java в XML)
 * или демаршалинге (преобразовании XML в объект Java), JAXB будет использовать этот имя элемента для создания или
 * считывания соответствующего XML-элемента.
 *
 * Аннотация @XmlRootElement может быть полезна при работе с XML-документами, в которых требуется явно указать имя
 * корневого элемента или когда объект Java должен быть привязан к корневому элементу.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sCountryISOCode"
})
@XmlRootElement(name = "CapitalCity")
public class CapitalCity {

    @XmlElement(required = true)
    protected String sCountryISOCode;

    /**
     * Gets the value of the sCountryISOCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountryISOCode() {
        return sCountryISOCode;
    }

    /**
     * Sets the value of the sCountryISOCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountryISOCode(String value) {
        this.sCountryISOCode = value;
    }

}
