
package com.see1rg.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOftContinent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftContinent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tContinent" type="{http://www.oorsprong.org/websamples.countryinfo}tContinent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * Аннотация @XmlAccessorType(XmlAccessType.FIELD) указывает, каким образом JAXB (Java Architecture for XML Binding)
 * должен обрабатывать доступ к полям класса при выполнении процесса привязки XML.
 * Аннотация @XmlAccessorType может иметь следующие значения:
 * XmlAccessType.FIELD: JAXB будет использовать непосредственный доступ к полям класса для чтения и записи
 * XML-элементов. Это означает, что JAXB будет использовать рефлексию для доступа к полям и игнорировать геттеры
 * и сеттеры.
 * XmlAccessType.PROPERTY: JAXB будет использовать геттеры и сеттеры класса для чтения и записи XML-элементов.
 * XmlAccessType.PUBLIC_MEMBER: JAXB будет использовать как поля, так и геттеры и сеттеры для чтения и записи
 * XML-элементов. Здесь важно отметить, что JAXB рассматривает только публичные поля и методы.
 *
 * Аннотация @XmlType применяется к классу и используется для настройки привязки JAXB для типа данных XML.
 * Она позволяет указать имя типа и порядок свойств в XML-элементе.
 * В данном случае, аннотация @XmlType(name = "ArrayOftContinent", propOrder = {"tContinent"}) указывает следующие настройки:
 * name = "ArrayOftContinent": Указывает имя типа данных XML, которое будет использоваться при привязке объектов
 * класса к XML-элементам.
 * propOrder = {"tContinent"}: Указывает порядок свойств класса в XML-элементе. В данном случае, свойство tContinent
 * будет располагаться в XML-элементе перед другими свойствами (если они есть).
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftContinent", propOrder = {
    "tContinent"
})
public class ArrayOftContinent {

    @XmlElement(nillable = true)
    protected List<TContinent> tContinent;

    /**
     * Gets the value of the tContinent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tContinent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTContinent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TContinent }
     * 
     * 
     */
    public List<TContinent> getTContinent() {
        if (tContinent == null) {
            tContinent = new ArrayList<TContinent>();
        }
        return this.tContinent;
    }

}
