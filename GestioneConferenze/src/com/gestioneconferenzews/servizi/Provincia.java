/**
 * Provincia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class Provincia  implements java.io.Serializable {
    private java.lang.String codiceIstatProvincia;

    private java.lang.String codiceIstatRegione;

    private java.lang.String provincia;

    private java.lang.String siglaProvincia;

    public Provincia() {
    }

    public Provincia(
           java.lang.String codiceIstatProvincia,
           java.lang.String codiceIstatRegione,
           java.lang.String provincia,
           java.lang.String siglaProvincia) {
           this.codiceIstatProvincia = codiceIstatProvincia;
           this.codiceIstatRegione = codiceIstatRegione;
           this.provincia = provincia;
           this.siglaProvincia = siglaProvincia;
    }


    /**
     * Gets the codiceIstatProvincia value for this Provincia.
     * 
     * @return codiceIstatProvincia
     */
    public java.lang.String getCodiceIstatProvincia() {
        return codiceIstatProvincia;
    }


    /**
     * Sets the codiceIstatProvincia value for this Provincia.
     * 
     * @param codiceIstatProvincia
     */
    public void setCodiceIstatProvincia(java.lang.String codiceIstatProvincia) {
        this.codiceIstatProvincia = codiceIstatProvincia;
    }


    /**
     * Gets the codiceIstatRegione value for this Provincia.
     * 
     * @return codiceIstatRegione
     */
    public java.lang.String getCodiceIstatRegione() {
        return codiceIstatRegione;
    }


    /**
     * Sets the codiceIstatRegione value for this Provincia.
     * 
     * @param codiceIstatRegione
     */
    public void setCodiceIstatRegione(java.lang.String codiceIstatRegione) {
        this.codiceIstatRegione = codiceIstatRegione;
    }


    /**
     * Gets the provincia value for this Provincia.
     * 
     * @return provincia
     */
    public java.lang.String getProvincia() {
        return provincia;
    }


    /**
     * Sets the provincia value for this Provincia.
     * 
     * @param provincia
     */
    public void setProvincia(java.lang.String provincia) {
        this.provincia = provincia;
    }


    /**
     * Gets the siglaProvincia value for this Provincia.
     * 
     * @return siglaProvincia
     */
    public java.lang.String getSiglaProvincia() {
        return siglaProvincia;
    }


    /**
     * Sets the siglaProvincia value for this Provincia.
     * 
     * @param siglaProvincia
     */
    public void setSiglaProvincia(java.lang.String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Provincia)) return false;
        Provincia other = (Provincia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceIstatProvincia==null && other.getCodiceIstatProvincia()==null) || 
             (this.codiceIstatProvincia!=null &&
              this.codiceIstatProvincia.equals(other.getCodiceIstatProvincia()))) &&
            ((this.codiceIstatRegione==null && other.getCodiceIstatRegione()==null) || 
             (this.codiceIstatRegione!=null &&
              this.codiceIstatRegione.equals(other.getCodiceIstatRegione()))) &&
            ((this.provincia==null && other.getProvincia()==null) || 
             (this.provincia!=null &&
              this.provincia.equals(other.getProvincia()))) &&
            ((this.siglaProvincia==null && other.getSiglaProvincia()==null) || 
             (this.siglaProvincia!=null &&
              this.siglaProvincia.equals(other.getSiglaProvincia())));
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
        if (getCodiceIstatProvincia() != null) {
            _hashCode += getCodiceIstatProvincia().hashCode();
        }
        if (getCodiceIstatRegione() != null) {
            _hashCode += getCodiceIstatRegione().hashCode();
        }
        if (getProvincia() != null) {
            _hashCode += getProvincia().hashCode();
        }
        if (getSiglaProvincia() != null) {
            _hashCode += getSiglaProvincia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Provincia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "provincia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIstatProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceIstatProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIstatRegione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceIstatRegione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siglaProvincia"));
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
