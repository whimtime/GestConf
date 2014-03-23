/**
 * Contatto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class Contatto  implements java.io.Serializable {
    private java.lang.Integer cdContatto;

    private java.lang.Integer cdPersona;

    private java.lang.String contatto;

    private java.util.Calendar dataAnnullamento;

    private java.lang.String tipo;

    public Contatto() {
    }

    public Contatto(
           java.lang.Integer cdContatto,
           java.lang.Integer cdPersona,
           java.lang.String contatto,
           java.util.Calendar dataAnnullamento,
           java.lang.String tipo) {
           this.cdContatto = cdContatto;
           this.cdPersona = cdPersona;
           this.contatto = contatto;
           this.dataAnnullamento = dataAnnullamento;
           this.tipo = tipo;
    }


    /**
     * Gets the cdContatto value for this Contatto.
     * 
     * @return cdContatto
     */
    public java.lang.Integer getCdContatto() {
        return cdContatto;
    }


    /**
     * Sets the cdContatto value for this Contatto.
     * 
     * @param cdContatto
     */
    public void setCdContatto(java.lang.Integer cdContatto) {
        this.cdContatto = cdContatto;
    }


    /**
     * Gets the cdPersona value for this Contatto.
     * 
     * @return cdPersona
     */
    public java.lang.Integer getCdPersona() {
        return cdPersona;
    }


    /**
     * Sets the cdPersona value for this Contatto.
     * 
     * @param cdPersona
     */
    public void setCdPersona(java.lang.Integer cdPersona) {
        this.cdPersona = cdPersona;
    }


    /**
     * Gets the contatto value for this Contatto.
     * 
     * @return contatto
     */
    public java.lang.String getContatto() {
        return contatto;
    }


    /**
     * Sets the contatto value for this Contatto.
     * 
     * @param contatto
     */
    public void setContatto(java.lang.String contatto) {
        this.contatto = contatto;
    }


    /**
     * Gets the dataAnnullamento value for this Contatto.
     * 
     * @return dataAnnullamento
     */
    public java.util.Calendar getDataAnnullamento() {
        return dataAnnullamento;
    }


    /**
     * Sets the dataAnnullamento value for this Contatto.
     * 
     * @param dataAnnullamento
     */
    public void setDataAnnullamento(java.util.Calendar dataAnnullamento) {
        this.dataAnnullamento = dataAnnullamento;
    }


    /**
     * Gets the tipo value for this Contatto.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Contatto.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contatto)) return false;
        Contatto other = (Contatto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdContatto==null && other.getCdContatto()==null) || 
             (this.cdContatto!=null &&
              this.cdContatto.equals(other.getCdContatto()))) &&
            ((this.cdPersona==null && other.getCdPersona()==null) || 
             (this.cdPersona!=null &&
              this.cdPersona.equals(other.getCdPersona()))) &&
            ((this.contatto==null && other.getContatto()==null) || 
             (this.contatto!=null &&
              this.contatto.equals(other.getContatto()))) &&
            ((this.dataAnnullamento==null && other.getDataAnnullamento()==null) || 
             (this.dataAnnullamento!=null &&
              this.dataAnnullamento.equals(other.getDataAnnullamento()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo())));
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
        if (getCdContatto() != null) {
            _hashCode += getCdContatto().hashCode();
        }
        if (getCdPersona() != null) {
            _hashCode += getCdPersona().hashCode();
        }
        if (getContatto() != null) {
            _hashCode += getContatto().hashCode();
        }
        if (getDataAnnullamento() != null) {
            _hashCode += getDataAnnullamento().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contatto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "contatto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdContatto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdContatto"));
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
        elemField.setFieldName("contatto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contatto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAnnullamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAnnullamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
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
