/**
 * ComuneIstat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class ComuneIstat  implements java.io.Serializable {
    private java.lang.String cdComune;

    private java.lang.String codiceIstatComune;

    private java.lang.String denominazioneComune;

    private java.lang.String idCodiceCatasto;

    private java.lang.String siglaProvincia;

    public ComuneIstat() {
    }

    public ComuneIstat(
           java.lang.String cdComune,
           java.lang.String codiceIstatComune,
           java.lang.String denominazioneComune,
           java.lang.String idCodiceCatasto,
           java.lang.String siglaProvincia) {
           this.cdComune = cdComune;
           this.codiceIstatComune = codiceIstatComune;
           this.denominazioneComune = denominazioneComune;
           this.idCodiceCatasto = idCodiceCatasto;
           this.siglaProvincia = siglaProvincia;
    }


    /**
     * Gets the cdComune value for this ComuneIstat.
     * 
     * @return cdComune
     */
    public java.lang.String getCdComune() {
        return cdComune;
    }


    /**
     * Sets the cdComune value for this ComuneIstat.
     * 
     * @param cdComune
     */
    public void setCdComune(java.lang.String cdComune) {
        this.cdComune = cdComune;
    }


    /**
     * Gets the codiceIstatComune value for this ComuneIstat.
     * 
     * @return codiceIstatComune
     */
    public java.lang.String getCodiceIstatComune() {
        return codiceIstatComune;
    }


    /**
     * Sets the codiceIstatComune value for this ComuneIstat.
     * 
     * @param codiceIstatComune
     */
    public void setCodiceIstatComune(java.lang.String codiceIstatComune) {
        this.codiceIstatComune = codiceIstatComune;
    }


    /**
     * Gets the denominazioneComune value for this ComuneIstat.
     * 
     * @return denominazioneComune
     */
    public java.lang.String getDenominazioneComune() {
        return denominazioneComune;
    }


    /**
     * Sets the denominazioneComune value for this ComuneIstat.
     * 
     * @param denominazioneComune
     */
    public void setDenominazioneComune(java.lang.String denominazioneComune) {
        this.denominazioneComune = denominazioneComune;
    }


    /**
     * Gets the idCodiceCatasto value for this ComuneIstat.
     * 
     * @return idCodiceCatasto
     */
    public java.lang.String getIdCodiceCatasto() {
        return idCodiceCatasto;
    }


    /**
     * Sets the idCodiceCatasto value for this ComuneIstat.
     * 
     * @param idCodiceCatasto
     */
    public void setIdCodiceCatasto(java.lang.String idCodiceCatasto) {
        this.idCodiceCatasto = idCodiceCatasto;
    }


    /**
     * Gets the siglaProvincia value for this ComuneIstat.
     * 
     * @return siglaProvincia
     */
    public java.lang.String getSiglaProvincia() {
        return siglaProvincia;
    }


    /**
     * Sets the siglaProvincia value for this ComuneIstat.
     * 
     * @param siglaProvincia
     */
    public void setSiglaProvincia(java.lang.String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComuneIstat)) return false;
        ComuneIstat other = (ComuneIstat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdComune==null && other.getCdComune()==null) || 
             (this.cdComune!=null &&
              this.cdComune.equals(other.getCdComune()))) &&
            ((this.codiceIstatComune==null && other.getCodiceIstatComune()==null) || 
             (this.codiceIstatComune!=null &&
              this.codiceIstatComune.equals(other.getCodiceIstatComune()))) &&
            ((this.denominazioneComune==null && other.getDenominazioneComune()==null) || 
             (this.denominazioneComune!=null &&
              this.denominazioneComune.equals(other.getDenominazioneComune()))) &&
            ((this.idCodiceCatasto==null && other.getIdCodiceCatasto()==null) || 
             (this.idCodiceCatasto!=null &&
              this.idCodiceCatasto.equals(other.getIdCodiceCatasto()))) &&
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
        if (getCdComune() != null) {
            _hashCode += getCdComune().hashCode();
        }
        if (getCodiceIstatComune() != null) {
            _hashCode += getCodiceIstatComune().hashCode();
        }
        if (getDenominazioneComune() != null) {
            _hashCode += getDenominazioneComune().hashCode();
        }
        if (getIdCodiceCatasto() != null) {
            _hashCode += getIdCodiceCatasto().hashCode();
        }
        if (getSiglaProvincia() != null) {
            _hashCode += getSiglaProvincia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComuneIstat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "comuneIstat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdComune");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdComune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIstatComune");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceIstatComune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominazioneComune");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denominazioneComune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCodiceCatasto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCodiceCatasto"));
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
