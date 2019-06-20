package com.meepcraft.backbone.api.request;

import org.json.JSONObject;

/**
 * JSON object representing a request to be piped through BoneMesh.
 * 
 * @author Caleb L. Power
 */
public class BackboneRequest extends JSONObject {
  
  /**
   * Overloaded constructor to define the scope and the action.
   * 
   * @param scope the request scope
   * @param action the request action
   */
  public BackboneRequest(String scope, String action) {
    put("scope", scope);
    put("action", action);
  }
  
  /**
   * Overloaded constructor to define the action, with "backbone" as the
   * default scope.
   * 
   * @param action the action
   */
  public BackboneRequest(String action) {
    this("backbone", action);
  }

}
