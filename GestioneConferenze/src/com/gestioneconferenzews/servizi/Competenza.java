/**
 * Competenza.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class Competenza  implements java.io.Serializable {
    private java.lang.Integer cdCompetenza;

    private java.lang.String competenza;

    public Competenza() {
    }

    public Competenza(
           java.lang.Integer cdCompetenza,
           java.lang.String competenza) {
           this.cdCompetenza = cdCompetenza;
           this.competenza = competenza;
    }


    /**
     * Gets the cdCompetenza value for this Competenza.
     * 
     * @return cdCompetenza
     */
    public java.lang.Integer getCdCompetenza() {
        return cdCompetenza;
    }


    /**
     * Sets the cdCompetenza value for this Competenza.
     * 
     * @param cdCompetenza
     */
    public void setCdCompetenza(java.lang.Integer cdCompetenza) {
        this.cdCompetenza = cdCompetenza;
    }


    /**
     * Gets the competenza value for this Competenza.
     * 
     * @return competenza
     */
    public java.lang.String getCompetenza() {
        return competenza;
    }


    /**
     * Sets the competenza value for this Competenza.
     * 
     * @param competenza
     */
    public void setCompetenza(java.lang.String competenza) {
        this.competenza = competenza;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Competenza)) return false;
        Competenza other = (Competenza) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdCompetenza==null && other.getCdCompetenza()==null) || 
             (this.cdCompetenza!=null &&
              this.cdCompetenza.equals(other.getCdCompetenza()))) &&
            ((this.competenza==null && other.getCompetenza()==null) || 
             (this.competenza!=null &&
              this.competenza.equals(other.getCompetenza())));
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
        if (getCdCompetenza() != null) {
            _hashCode += getCdCompetenza().hashCode();
        }
        if (getCompetenza() != null) {
            _hashCode += getCompetenza().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Competenza.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "competenza"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdCompetenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdCompetenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "competenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
