/*
 * Copyright 2004 - 2012 Mirko Nasato and contributors
 *           2016 - 2017 Simon Braconnier and contributors
 *
 * This file is part of JODConverter - Java OpenDocument Converter.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jodconverter.job;

import org.jodconverter.document.DocumentFormat;

/** A conversion job with required source format that is not yet applied to the converter. */
public interface ConversionJobWithRequiredSourceFormatUnspecified {

  /**
   * Defines the source document format for the given input document.
   *
   * @param format The document format of the source document.
   * @return The current conversion specification.
   */
  ConversionJobWithLoadPropertiesUnspecified as(DocumentFormat format);
}
