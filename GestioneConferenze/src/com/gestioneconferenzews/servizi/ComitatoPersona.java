/**
 * ComitatoPersona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class ComitatoPersona  implements java.io.Serializable {
    private java.lang.Integer cdComitato;

    private java.lang.Integer cdComitatoPersona;

    private java.lang.Integer cdPersona;

    private java.lang.Integer chair;

    public ComitatoPersona() {
    }

    public ComitatoPersona(
           java.lang.Integer cdComitato,
           java.lang.Integer cdComitatoPersona,
           java.lang.Integer cdPersona,
           java.lang.Integer chair) {
           this.cdComitato = cdComitato;
           this.cdComitatoPersona = cdComitatoPersona;
           this.cdPersona = cdPersona;
           this.chair = chair;
    }


    /**
     * Gets the cdComitato value for this ComitatoPersona.
     * 
     * @return cdComitato
     */
    public java.lang.Integer getCdComitato() {
        return cdComitato;
    }


    /**
     * Sets the cdComitato value for this ComitatoPersona.
     * 
     * @param cdComitato
     */
    public void setCdComitato(java.lang.Integer cdComitato) {
        this.cdComitato = cdComitato;
    }


    /**
     * Gets the cdComitatoPersona value for this ComitatoPersona.
     * 
     * @return cdComitatoPersona
     */
    public java.lang.Integer getCdComitatoPersona() {
        return cdComitatoPersona;
    }


    /**
     * Sets the cdComitatoPersona value for this ComitatoPersona.
     * 
     * @param cdComitatoPersona
     */
    public void setCdComitatoPersona(java.lang.Integer cdComitatoPersona) {
        this.cdComitatoPersona = cdComitatoPersona;
    }


    /**
     * Gets the cdPersona value for this ComitatoPersona.
     * 
     * @return cdPersona
     */
    public java.lang.Integer getCdPersona() {
        return cdPersona;
    }


    /**
     * Sets the cdPersona value for this ComitatoPersona.
     * 
     * @param cdPersona
     */
    public void setCdPersona(java.lang.Integer cdPersona) {
        this.cdPersona = cdPersona;
    }


    /**
     * Gets the chair value for this ComitatoPersona.
     * 
     * @return chair
     */
    public java.lang.Integer getChair() {
        return chair;
    }


    /**
     * Sets the chair value for this ComitatoPersona.
     * 
     * @param chair
     */
    public void setChair(java.lang.Integer chair) {
        this.chair = chair;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComitatoPersona)) return false;
        ComitatoPersona other = (ComitatoPersona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdComitato==null && other.getCdComitato()==null) || 
             (this.cdComitato!=null &&
              this.cdComitato.equals(other.getCdComitato()))) &&
            ((this.cdComitatoPersona==null && other.getCdComitatoPersona()==null) || 
             (this.cdComitatoPersona!=null &&
              this.cdComitatoPersona.equals(other.getCdComitatoPersona()))) &&
            ((this.cdPersona==null && other.getCdPersona()==null) || 
             (this.cdPersona!=null &&
              this.cdPersona.equals(other.getCdPersona()))) &&
            ((this.chair==null && other.getChair()==null) || 
             (this.chair!=null &&
              this.chair.equals(other.getChair())));
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
        if (getCdComitato() != null) {
            _hashCode += getCdComitato().hashCode();
        }
        if (getCdComitatoPersona() != null) {
            _hashCode += getCdComitatoPersona().hashCode();
        }
        if (getCdPersona() != null) {
            _hashCode += getCdPersona().hashCode();
        }
        if (getChair() != null) {
            _hashCode += getChair().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComitatoPersona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "comitatoPersona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdComitato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdComitato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdComitatoPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdComitatoPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chair");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
