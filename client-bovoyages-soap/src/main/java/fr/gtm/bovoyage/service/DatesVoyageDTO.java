/**
 * DatesVoyageDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.bovoyage.service;

public class DatesVoyageDTO  implements java.io.Serializable {
    private java.lang.String dateAller;

    private java.lang.String dateRetour;

    private long id;

    private double tarifUnitraireHT;

    public DatesVoyageDTO() {
    }

    public DatesVoyageDTO(
           java.lang.String dateAller,
           java.lang.String dateRetour,
           long id,
           double tarifUnitraireHT) {
           this.dateAller = dateAller;
           this.dateRetour = dateRetour;
           this.id = id;
           this.tarifUnitraireHT = tarifUnitraireHT;
    }


    /**
     * Gets the dateAller value for this DatesVoyageDTO.
     * 
     * @return dateAller
     */
    public java.lang.String getDateAller() {
        return dateAller;
    }


    /**
     * Sets the dateAller value for this DatesVoyageDTO.
     * 
     * @param dateAller
     */
    public void setDateAller(java.lang.String dateAller) {
        this.dateAller = dateAller;
    }


    /**
     * Gets the dateRetour value for this DatesVoyageDTO.
     * 
     * @return dateRetour
     */
    public java.lang.String getDateRetour() {
        return dateRetour;
    }


    /**
     * Sets the dateRetour value for this DatesVoyageDTO.
     * 
     * @param dateRetour
     */
    public void setDateRetour(java.lang.String dateRetour) {
        this.dateRetour = dateRetour;
    }


    /**
     * Gets the id value for this DatesVoyageDTO.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this DatesVoyageDTO.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the tarifUnitraireHT value for this DatesVoyageDTO.
     * 
     * @return tarifUnitraireHT
     */
    public double getTarifUnitraireHT() {
        return tarifUnitraireHT;
    }


    /**
     * Sets the tarifUnitraireHT value for this DatesVoyageDTO.
     * 
     * @param tarifUnitraireHT
     */
    public void setTarifUnitraireHT(double tarifUnitraireHT) {
        this.tarifUnitraireHT = tarifUnitraireHT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatesVoyageDTO)) return false;
        DatesVoyageDTO other = (DatesVoyageDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateAller==null && other.getDateAller()==null) || 
             (this.dateAller!=null &&
              this.dateAller.equals(other.getDateAller()))) &&
            ((this.dateRetour==null && other.getDateRetour()==null) || 
             (this.dateRetour!=null &&
              this.dateRetour.equals(other.getDateRetour()))) &&
            this.id == other.getId() &&
            this.tarifUnitraireHT == other.getTarifUnitraireHT();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDateAller() != null) {
            _hashCode += getDateAller().hashCode();
        }
        if (getDateRetour() != null) {
            _hashCode += getDateRetour().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        _hashCode += new Double(getTarifUnitraireHT()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatesVoyageDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.bovoyage.gtm.fr/", "datesVoyageDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateAller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateAller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRetour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateRetour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifUnitraireHT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifUnitraireHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
