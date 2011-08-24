package com.abctech.transition.core.bean;

import no.zett.model.AdObject;


public class TransformObject {

    private String customerXml;
    private AdObject adObject;

    public String getCustomerXml() {
          return customerXml;
      }

      public void setCustomerXml(String customerXml) {
          this.customerXml = customerXml;
      }

      public AdObject getAdObject() {
          return adObject;
      }

      public void setAdObject(AdObject adObject) {
          this.adObject = adObject;
      }

}
