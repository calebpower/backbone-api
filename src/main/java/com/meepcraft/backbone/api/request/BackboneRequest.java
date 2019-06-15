package com.meepcraft.backbone.api.request;

import org.json.JSONObject;

public class BackboneRequest extends JSONObject {
  
  public BackboneRequest(String scope, String action) {
    put("scope", scope);
    put("action", action);
  }
  
  public BackboneRequest(String action) {
    this("backbone", action);
  }

}
