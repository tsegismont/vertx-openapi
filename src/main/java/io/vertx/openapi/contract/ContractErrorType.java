/*
 * Copyright (c) 2023, SAP SE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *
 */

package io.vertx.openapi.contract;

import io.vertx.codegen.annotations.VertxGen;

@VertxGen
public enum ContractErrorType {
  /**
   * Provided file is not a valid OpenAPI contract
   */
  INVALID_SPEC,
  /**
   * You are trying to use an OpenAPI contract within a version that is not supported.
   */
  UNSUPPORTED_SPEC,
  /**
   * You are trying to use an OpenAPI feature that is not supported.
   */
  UNSUPPORTED_FEATURE
}
