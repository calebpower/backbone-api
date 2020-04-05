/*
 * Copyright (c) 2019 Axonibyte Innovations, LLC. All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
