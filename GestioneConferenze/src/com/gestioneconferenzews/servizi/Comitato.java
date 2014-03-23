/**
 * Comitato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class Comitato  implements java.io.Serializable {
    private java.lang.Integer cdComitato;

    private java.lang.Integer cdConferenza;

    private java.lang.Integer cdTipo;

    private java.lang.String nome;

    public Comitato() {
    }

    public Comitato(
           java.lang.Integer cdComitato,
           java.lang.Integer cdConferenza,
           java.lang.Integer cdTipo,
           java.lang.String nome) {
           this.cdComitato = cdComitato;
           this.cdConferenza = cdConferenza;
           this.cdTipo = cdTipo;
           this.nome = nome;
    }


    /**
     * Gets the cdComitato value for this Comitato.
     * 
     * @return cdComitato
     */
    public java.lang.Integer getCdComitato() {
        return cdComitato;
    }


    /**
     * Sets the cdComitato value for this Comitato.
     * 
     * @param cdComitato
     */
    public void setCdComitato(java.lang.Integer cdComitato) {
        this.cdComitato = cdComitato;
    }


    /**
     * Gets the cdConferenza value for this Comitato.
     * 
     * @return cdConferenza
     */
    public java.lang.Integer getCdConferenza() {
        return cdConferenza;
    }


    /**
     * Sets the cdConferenza value for this Comitato.
     * 
     * @param cdConferenza
     */
    public void setCdConferenza(java.lang.Integer cdConferenza) {
        this.cdConferenza = cdConferenza;
    }


    /**
     * Gets the cdTipo value for this Comitato.
     * 
     * @return cdTipo
     */
    public java.lang.Integer getCdTipo() {
        return cdTipo;
    }


    /**
     * Sets the cdTipo value for this Comitato.
     * 
     * @param cdTipo
     */
    public void setCdTipo(java.lang.Integer cdTipo) {
        this.cdTipo = cdTipo;
    }


    /**
     * Gets the nome value for this Comitato.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Comitato.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Comitato)) return false;
        Comitato other = (Comitato) obj;
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
            ((this.cdConferenza==null && other.getCdConferenza()==null) || 
             (this.cdConferenza!=null &&
              this.cdConferenza.equals(other.getCdConferenza()))) &&
            ((this.cdTipo==null && other.getCdTipo()==null) || 
             (this.cdTipo!=null &&
              this.cdTipo.equals(other.getCdTipo()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome())));
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
        if (getCdConferenza() != null) {
            _hashCode += getCdConferenza().hashCode();
        }
        if (getCdTipo() != null) {
            _hashCode += getCdTipo().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Comitato.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "comitato"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdComitato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdComitato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdConferenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdConferenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
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
