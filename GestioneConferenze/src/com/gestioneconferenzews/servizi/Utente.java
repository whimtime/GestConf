/**
 * Utente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class Utente  implements java.io.Serializable {
    private java.lang.Integer cdPersona;

    private java.lang.Integer cdUsername;

    private java.util.Calendar dataAnnullamento;

    private java.util.Calendar dataCreazione;

    private java.util.Calendar dataVerifica;

    private java.lang.String password;

    private java.lang.String username;

    public Utente() {
    }

    public Utente(
           java.lang.Integer cdPersona,
           java.lang.Integer cdUsername,
           java.util.Calendar dataAnnullamento,
           java.util.Calendar dataCreazione,
           java.util.Calendar dataVerifica,
           java.lang.String password,
           java.lang.String username) {
           this.cdPersona = cdPersona;
           this.cdUsername = cdUsername;
           this.dataAnnullamento = dataAnnullamento;
           this.dataCreazione = dataCreazione;
           this.dataVerifica = dataVerifica;
           this.password = password;
           this.username = username;
    }


    /**
     * Gets the cdPersona value for this Utente.
     * 
     * @return cdPersona
     */
    public java.lang.Integer getCdPersona() {
        return cdPersona;
    }


    /**
     * Sets the cdPersona value for this Utente.
     * 
     * @param cdPersona
     */
    public void setCdPersona(java.lang.Integer cdPersona) {
        this.cdPersona = cdPersona;
    }


    /**
     * Gets the cdUsername value for this Utente.
     * 
     * @return cdUsername
     */
    public java.lang.Integer getCdUsername() {
        return cdUsername;
    }


    /**
     * Sets the cdUsername value for this Utente.
     * 
     * @param cdUsername
     */
    public void setCdUsername(java.lang.Integer cdUsername) {
        this.cdUsername = cdUsername;
    }


    /**
     * Gets the dataAnnullamento value for this Utente.
     * 
     * @return dataAnnullamento
     */
    public java.util.Calendar getDataAnnullamento() {
        return dataAnnullamento;
    }


    /**
     * Sets the dataAnnullamento value for this Utente.
     * 
     * @param dataAnnullamento
     */
    public void setDataAnnullamento(java.util.Calendar dataAnnullamento) {
        this.dataAnnullamento = dataAnnullamento;
    }


    /**
     * Gets the dataCreazione value for this Utente.
     * 
     * @return dataCreazione
     */
    public java.util.Calendar getDataCreazione() {
        return dataCreazione;
    }


    /**
     * Sets the dataCreazione value for this Utente.
     * 
     * @param dataCreazione
     */
    public void setDataCreazione(java.util.Calendar dataCreazione) {
        this.dataCreazione = dataCreazione;
    }


    /**
     * Gets the dataVerifica value for this Utente.
     * 
     * @return dataVerifica
     */
    public java.util.Calendar getDataVerifica() {
        return dataVerifica;
    }


    /**
     * Sets the dataVerifica value for this Utente.
     * 
     * @param dataVerifica
     */
    public void setDataVerifica(java.util.Calendar dataVerifica) {
        this.dataVerifica = dataVerifica;
    }


    /**
     * Gets the password value for this Utente.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Utente.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the username value for this Utente.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Utente.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Utente)) return false;
        Utente other = (Utente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdPersona==null && other.getCdPersona()==null) || 
             (this.cdPersona!=null &&
              this.cdPersona.equals(other.getCdPersona()))) &&
            ((this.cdUsername==null && other.getCdUsername()==null) || 
             (this.cdUsername!=null &&
              this.cdUsername.equals(other.getCdUsername()))) &&
            ((this.dataAnnullamento==null && other.getDataAnnullamento()==null) || 
             (this.dataAnnullamento!=null &&
              this.dataAnnullamento.equals(other.getDataAnnullamento()))) &&
            ((this.dataCreazione==null && other.getDataCreazione()==null) || 
             (this.dataCreazione!=null &&
              this.dataCreazione.equals(other.getDataCreazione()))) &&
            ((this.dataVerifica==null && other.getDataVerifica()==null) || 
             (this.dataVerifica!=null &&
              this.dataVerifica.equals(other.getDataVerifica()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getCdPersona() != null) {
            _hashCode += getCdPersona().hashCode();
        }
        if (getCdUsername() != null) {
            _hashCode += getCdUsername().hashCode();
        }
        if (getDataAnnullamento() != null) {
            _hashCode += getDataAnnullamento().hashCode();
        }
        if (getDataCreazione() != null) {
            _hashCode += getDataCreazione().hashCode();
        }
        if (getDataVerifica() != null) {
            _hashCode += getDataVerifica().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Utente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "utente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("dataCreazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCreazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVerifica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVerifica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
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
